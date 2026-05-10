# 🔗 URL Shortener

A simple full-stack URL shortener built with **Java Spring Boot** and **Vanilla JavaScript**.

## Features
- ✅ Shorten any URL instantly
- ✅ Click tracking / analytics
- ✅ Delete URLs
- ✅ Redirect via short code
- ✅ In-memory H2 database (no setup needed)

## Tech Stack
| Layer    | Technology          |
|----------|---------------------|
| Backend  | Java 17 + Spring Boot 3 |
| Database | H2 (in-memory)      |
| Frontend | HTML + CSS + Vanilla JS |

## Project Structure
```
url-shortener/
├── pom.xml
└── src/main/
    ├── java/com/urlshortener/
    │   ├── UrlShortenerApplication.java  ← Main entry point
    │   ├── Url.java                      ← Entity / Model
    │   ├── UrlRepository.java            ← Database access
    │   └── UrlController.java            ← REST API
    └── resources/
        ├── application.properties
        └── static/
            └── index.html                ← Frontend UI
```

## How to Run

### Requirements
- Java 17+
- Maven

### Steps
```bash
git clone https://github.com/ghouse-codes/url-shortener.git
cd url-shortener
mvn spring-boot:run
```

Open your browser at: **http://localhost:8080**

## API Endpoints

| Method | Endpoint           | Description        |
|--------|--------------------|--------------------|
| POST   | /api/shorten       | Create short URL   |
| GET    | /{code}            | Redirect to URL    |
| GET    | /api/urls          | List all URLs      |
| DELETE | /api/urls/{id}     | Delete a URL       |

## Example
```json
POST /api/shorten
{ "url": "https://www.google.com" }

Response:
{
  "shortCode": "aB3xYz",
  "shortUrl": "http://localhost:8080/aB3xYz",
  "originalUrl": "https://www.google.com"
}
```
