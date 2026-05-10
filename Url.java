package com.urlshortener;

import jakarta.persistence.*;

@Entity
@Table(name = "urls")
public class Url {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String shortCode;
    private String originalUrl;
    private Long clicks = 0L;

    public Url() {}

    public Url(String shortCode, String originalUrl) {
        this.shortCode = shortCode;
        this.originalUrl = originalUrl;
    }

    public Long getId() { return id; }
    public String getShortCode() { return shortCode; }
    public String getOriginalUrl() { return originalUrl; }
    public Long getClicks() { return clicks; }

    public void setShortCode(String shortCode) { this.shortCode = shortCode; }
    public void setOriginalUrl(String originalUrl) { this.originalUrl = originalUrl; }
    public void setClicks(Long clicks) { this.clicks = clicks; }
}
