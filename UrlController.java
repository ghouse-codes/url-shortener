package com.urlshortener;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Map;
import java.util.Random;

@RestController
public class UrlController {

    private final UrlRepository repo;

    public UrlController(UrlRepository repo) {
        this.repo = repo;
    }

    // Shorten a URL
    @PostMapping("/api/shorten")
    public ResponseEntity<?> shorten(@RequestBody Map<String, String> body) {
        String originalUrl = body.get("url");
        if (originalUrl == null || originalUrl.isBlank()) {
            return ResponseEntity.badRequest().body("URL is required");
        }

        String code = randomCode();
        Url url = new Url(code, originalUrl);
        repo.save(url);

        return ResponseEntity.ok(Map.of(
            "shortCode", code,
            "shortUrl", "http://localhost:8080/" + code,
            "originalUrl", originalUrl
        ));
    }

    // Redirect to original URL
    @GetMapping("/{code}")
    public ResponseEntity<?> redirect(@PathVariable String code) {
        return repo.findByShortCode(code)
            .map(url -> {
                url.setClicks(url.getClicks() + 1);
                repo.save(url);
                return ResponseEntity.status(302)
                    .location(URI.create(url.getOriginalUrl()))
                    .build();
            })
            .orElse(ResponseEntity.notFound().build());
    }

    // Get all URLs (analytics)
    @GetMapping("/api/urls")
    public List<Url> getAllUrls() {
        return repo.findAll();
    }

    // Delete a URL
    @DeleteMapping("/api/urls/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        repo.deleteById(id);
        return ResponseEntity.ok("Deleted");
    }

    private String randomCode() {
        String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            sb.append(chars.charAt(random.nextInt(chars.length())));
        }
        return sb.toString();
    }
}
