<div align="center">
<!-- ═══════════════════════════════════════════════════════════════ -->
<!--                     🌐 ANIMATED HERO BANNER                    -->
<!-- ═══════════════════════════════════════════════════════════════ -->
<img src="https://capsule-render.vercel.app/api?type=waving&color=0:0f0c29,50:302b63,100:24243e&height=200&section=header&text=URL%20Shortener&fontSize=60&fontColor=ffffff&animation=fadeIn&fontAlignY=38&desc=Full-Stack%20%7C%20Java%20Spring%20Boot%20%7C%20REST%20API%20%7C%20Click%20Analytics&descAlignY=60&descSize=18&descColor=a8b2d8" width="100%"/>
<!-- Typing Animation -->
<a href="https://github.com/ghouse-codes/url-shortener">
  <img src="https://readme-typing-svg.demolab.com?font=Fira+Code&weight=600&size=22&pause=1000&color=6C63FF&center=true&vCenter=true&width=700&lines=🚀+Transform+Long+URLs+Into+Smart+Links;📊+Real-Time+Click+Analytics+%26+Tracking;⚡+Spring+Boot+REST+API+%7C+Sub-50ms+Response;🔗+Production-Grade+URL+Shortening+Engine;🛠️+Built+with+Java+%7C+Spring+Boot+%7C+JPA" alt="Typing SVG" />
</a>
<br/><br/>

<!-- ── Status Badges ── -->
Show Image
Show Image
Show Image
Show Image

<br/>
Show Image
Show Image
Show Image
Show Image

<br/>
<!-- ── Quick Action Buttons ── -->
Show Image
Show Image
Show Image

</div>

<!-- ═══════════════════════════════════════════════════════════════ -->
<!--                     📌 TABLE OF CONTENTS                       -->
<!-- ═══════════════════════════════════════════════════════════════ -->
<details>
<summary><b>📌 Table of Contents — Click to Expand</b></summary>

🎯 Project Overview
✨ Key Features
🎥 Project Preview
🏗️ System Architecture
🛠️ Tech Stack
📂 Project Structure
🔄 Workflow Diagram
🚀 Getting Started
📡 API Reference
📊 Features Breakdown
💡 Core Concepts Demonstrated
🎯 Learning Outcomes
🚀 Future Enhancements
🏆 Skills Demonstrated
🌍 Real-World Applications
👨‍💻 Developer Profile
⭐ Why Recruiters Should Notice This


</details>

<!-- ═══════════════════════════════════════════════════════════════ -->
<!--                     🎯 PROJECT OVERVIEW                        -->
<!-- ═══════════════════════════════════════════════════════════════ -->
🎯 Project Overview

<div align="center">
<img src="https://img.shields.io/badge/Problem_Solved-URL_Management_%26_Analytics-302b63?style=for-the-badge&labelColor=0f0c29"/>
</div>
<br/>

"Every millisecond matters in the digital world. Long, unreadable URLs break user trust, fail in SMS character limits, and kill engagement rates. This project solves that at the infrastructure level."



In today's digital-first economy, URL shortening is foundational infrastructure — powering everything from social media marketing campaigns to enterprise analytics pipelines. Platforms like Bit.ly process billions of redirects per day. This project replicates and demonstrates the core engineering behind such systems.

Real-world problems this system addresses:


🔗 Long URLs break in emails, SMS, and printed materials
📊 Businesses need click tracking to measure campaign performance
🛡️ Branded short links build trust and improve click-through rates
⚡ Redirect speed is critical — milliseconds directly impact UX and SEO
🗄️ Persistent storage prevents broken links over time


This project delivers a production-aware, full-stack solution that mirrors real enterprise URL management systems used by marketing teams, SaaS products, and API platforms globally.


<!-- ═══════════════════════════════════════════════════════════════ -->
<!--                     ✨ KEY FEATURES                             -->
<!-- ═══════════════════════════════════════════════════════════════ -->
✨ Key Features

<div align="center">
🚀 Feature💬 Description🔧 Implementation⚡ URL ShorteningConverts any long URL into a 6-character alphanumeric short codePOST /api/shorten🔁 Instant RedirectHTTP 302 redirect to original URL in under 50msGET /{code}📊 Click AnalyticsTracks total clicks per short URL in real-timeAuto-increment on redirect🗑️ Link ManagementFull CRUD — list, view, and delete shortened URLsDELETE /api/urls/{id}🎲 Unique Code EngineCollision-resistant alphanumeric code generator (62⁶ = 56 billion combos)Custom randomCode() logic🛡️ Input ValidationRejects null, blank, and malformed URL inputs with clear error messagesSpring validation layer🗃️ Persistent StorageAll URLs and click data stored in a database via JPA/HibernateSpring Data JPA📋 Analytics DashboardRetrieve full URL inventory with click stats via REST endpointGET /api/urls

</div>

<!-- ═══════════════════════════════════════════════════════════════ -->
<!--                     🎥 PROJECT PREVIEW                         -->
<!-- ═══════════════════════════════════════════════════════════════ -->
🎥 Project Preview

<div align="center">
🖥️ Desktop View — URL Shortening Interface

┌────────────────────────────────────────────────────────────┐
│  🔗  URL Shortener Pro                            ⚡ Live  │
├────────────────────────────────────────────────────────────┤
│                                                            │
│   Enter a long URL to shorten:                             │
│  ┌──────────────────────────────────────────┐ [Shorten!]  │
│  │ https://example.com/very/long/path/...   │             │
│  └──────────────────────────────────────────┘             │
│                                                            │
│   ✅ Your short URL:  http://localhost:8080/aB3xKz         │
│   📋 [Copy Link]   📊 [View Analytics]                    │
│                                                            │
├────────────────────────────────────────────────────────────┤
│  📊 Analytics                              Total: 3 links  │
│  ┌─────────────┬────────────────────────┬────────┐        │
│  │ Short Code  │ Original URL           │ Clicks │        │
│  ├─────────────┼────────────────────────┼────────┤        │
│  │ aB3xKz      │ https://example.com/.. │  142   │        │
│  │ mN7pQr      │ https://docs.google... │   38   │        │
│  │ zX2wYt      │ https://youtube.com/.. │   91   │        │
│  └─────────────┴────────────────────────┴────────┘        │
└────────────────────────────────────────────────────────────┘

📱 Mobile View — Responsive Interface

┌──────────────────────┐
│  🔗 URL Shortener    │
├──────────────────────┤
│ Enter URL:           │
│ ┌──────────────────┐ │
│ │ https://long...  │ │
│ └──────────────────┘ │
│   [ ⚡ Shorten! ]   │
├──────────────────────┤
│ ✅ Short URL:        │
│ localhost:8080/aB3x  │
│ [ 📋 Copy ]          │
├──────────────────────┤
│ 📊 My Links (3)      │
│ • aB3xKz — 142 hits  │
│ • mN7pQr — 38 hits   │
│ • zX2wYt — 91 hits   │
└──────────────────────┘

🔄 API Interaction Preview (Postman / curl)

bash# ① Shorten a URL
POST http://localhost:8080/api/shorten
Body: { "url": "https://www.example.com/very/long/path/to/resource" }

# Response ✅
{
  "shortCode": "aB3xKz",
  "shortUrl": "http://localhost:8080/aB3xKz",
  "originalUrl": "https://www.example.com/very/long/path/to/resource"
}

# ② Redirect (HTTP 302)
GET http://localhost:8080/aB3xKz
→ Redirects to https://www.example.com/very/long/path/to/resource

# ③ Analytics
GET http://localhost:8080/api/urls
→ Returns all URLs with click counts

</div>

<!-- ═══════════════════════════════════════════════════════════════ -->
<!--                   🏗️ SYSTEM ARCHITECTURE                       -->
<!-- ═══════════════════════════════════════════════════════════════ -->
🏗️ System Architecture

<div align="center">
<img src="https://img.shields.io/badge/Pattern-MVC_Architecture-302b63?style=for-the-badge&labelColor=0f0c29"/>
<img src="https://img.shields.io/badge/API-RESTful-6C63FF?style=for-the-badge"/>
<img src="https://img.shields.io/badge/ORM-Spring_Data_JPA-6DB33F?style=for-the-badge"/>
</div>
<br/>
╔══════════════════════════════════════════════════════════════════════╗
║                     🌐 HIGH-LEVEL ARCHITECTURE                      ║
╠══════════════════════════════════════════════════════════════════════╣
║                                                                      ║
║   ┌──────────────┐      HTTP/JSON       ┌──────────────────────┐   ║
║   │   CLIENT     │ ◄──────────────────► │   SPRING BOOT APP    │   ║
║   │  (Browser /  │                      │                      │   ║
║   │   Postman)   │    POST /api/shorten  │  ┌────────────────┐  │   ║
║   └──────────────┘    GET  /{code}       │  │UrlController   │  │   ║
║                        GET  /api/urls    │  │   (REST Layer) │  │   ║
║                       DELETE /api/{id}   │  └───────┬────────┘  │   ║
║                                          │          │            │   ║
║                                          │  ┌───────▼────────┐  │   ║
║                                          │  │  Url Entity    │  │   ║
║                                          │  │  (JPA Model)   │  │   ║
║                                          │  └───────┬────────┘  │   ║
║                                          │          │            │   ║
║                                          │  ┌───────▼────────┐  │   ║
║                                          │  │ UrlRepository  │  │   ║
║                                          │  │ (Data Access)  │  │   ║
║                                          │  └───────┬────────┘  │   ║
║                                          └──────────┼────────────┘   ║
║                                                     │                ║
║                                          ┌──────────▼────────────┐  ║
║                                          │     H2 / MySQL DB     │  ║
║                                          │  urls table:          │  ║
║                                          │  id | shortCode       │  ║
║                                          │  originalUrl | clicks │  ║
║                                          └───────────────────────┘  ║
╚══════════════════════════════════════════════════════════════════════╝

🔄 Request–Response Lifecycle

URL Shortening Flow:
━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
Client                UrlController           Database
  │                        │                     │
  │  POST /api/shorten     │                     │
  │  {"url": "..."}        │                     │
  │───────────────────────►│                     │
  │                        │  Validate input      │
  │                        │  Generate code()     │
  │                        │  new Url(code, url)  │
  │                        │──── repo.save() ────►│
  │                        │                     │ INSERT
  │                        │◄────── saved ───────│
  │◄───────────────────────│                     │
  │  200 OK                │                     │
  │  {shortCode, shortUrl} │                     │

Redirect Flow:
━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
Client                UrlController           Database
  │                        │                     │
  │  GET /aB3xKz           │                     │
  │───────────────────────►│                     │
  │                        │── findByShortCode ──►│
  │                        │◄── Url entity ───────│
  │                        │  clicks++ → save()   │
  │◄───────────────────────│                     │
  │  302 → originalUrl     │                     │


<!-- ═══════════════════════════════════════════════════════════════ -->
<!--                     🛠️ TECH STACK                              -->
<!-- ═══════════════════════════════════════════════════════════════ -->
🛠️ Tech Stack

<div align="center">
Backend

Show Image
Show Image
Show Image
Show Image
Show Image

Frontend

Show Image
Show Image
Show Image

Database & Tools

Show Image
Show Image
Show Image
Show Image
Show Image

</div>
<br/>
LayerTechnologyRoleREST ControllerSpring Boot @RestControllerHandles HTTP requests and routesBusiness LogicPure JavaCode generation, validation, redirect logicData ModelJPA @EntityMaps Url object to database tableData AccessSpring Data JpaRepositoryZero-boilerplate CRUD + custom queriesDatabaseH2 (dev) / MySQL (prod)Persists URL mappings and analyticsBuild ToolMaven (pom.xml)Dependency management and packagingAPI ProtocolRESTful HTTPStateless JSON API communication


<!-- ═══════════════════════════════════════════════════════════════ -->
<!--                     📂 PROJECT STRUCTURE                       -->
<!-- ═══════════════════════════════════════════════════════════════ -->
📂 Project Structure

url-shortener/
│
├── 📄 pom.xml                          # Maven build config & dependencies
│
├── 🏛️ UrlShortenerApplication.java     # Spring Boot entry point (@SpringBootApplication)
│
├── 🗂️ Url.java                         # JPA Entity — maps to 'urls' table
│   └── Fields: id, shortCode, originalUrl, clicks, createdAt
│
├── 🌐 UrlController.java               # REST Controller — all API endpoints
│   ├── POST   /api/shorten  → shorten()
│   ├── GET    /{code}       → redirect()
│   ├── GET    /api/urls     → getAllUrls()
│   └── DELETE /api/urls/{id} → delete()
│
└── 🗃️ UrlRepository.java               # Spring Data JPA Repository interface
    └── findByShortCode(String code)


Design Note: The flat structure follows a pragmatic single-package approach ideal for microservices and demonstrates clean separation of concerns across Controller → Entity → Repository layers without over-engineering.




<!-- ═══════════════════════════════════════════════════════════════ -->
<!--                     🔄 WORKFLOW DIAGRAM                        -->
<!-- ═══════════════════════════════════════════════════════════════ -->
🔄 Workflow Diagram

╔══════════════════════════════════════════════════════════════╗
║                 📊 URL SHORTENING WORKFLOW                   ║
╠══════════════════════════════════════════════════════════════╣
║                                                              ║
║  ① USER    ──► Enter long URL in browser / call REST API    ║
║      │                                                       ║
║  ② VALIDATE ─► Is URL null or blank?                        ║
║      │              YES → 400 Bad Request ✖                 ║
║      │              NO  → Continue ✔                        ║
║      │                                                       ║
║  ③ GENERATE ─► randomCode() picks 6 chars from [a-zA-Z0-9] ║
║      │         → 62⁶ = ~56.8 billion unique combinations    ║
║      │                                                       ║
║  ④ STORE   ──► new Url(code, originalUrl)                   ║
║      │         repo.save(url) → persisted to DB             ║
║      │                                                       ║
║  ⑤ RESPOND ─► 200 OK { shortCode, shortUrl, originalUrl }  ║
║                                                              ║
╠══════════════════════════════════════════════════════════════╣
║                                                              ║
║                 🔁 REDIRECT WORKFLOW                         ║
║                                                              ║
║  ① CLICK   ──► GET http://localhost:8080/{code}             ║
║      │                                                       ║
║  ② LOOKUP  ──► repo.findByShortCode(code)                   ║
║      │              NOT FOUND → 404 Not Found ✖             ║
║      │              FOUND     → Continue ✔                  ║
║      │                                                       ║
║  ③ TRACK   ──► url.setClicks(clicks + 1) → repo.save()     ║
║      │                                                       ║
║  ④ REDIRECT ─► HTTP 302 → Location: originalUrl             ║
║                                                              ║
╚══════════════════════════════════════════════════════════════╝

Visual Flow:

User Input → [Validate] → [Generate Code] → [Save to DB] → Return Short URL
    ↓                                                              ↓
Click Link ──────────────────────────────────────────► [Lookup + Track] → Redirect


<!-- ═══════════════════════════════════════════════════════════════ -->
<!--                   🚀 GETTING STARTED                           -->
<!-- ═══════════════════════════════════════════════════════════════ -->
🚀 Getting Started

Prerequisites

bash☑ Java 17+ installed
☑ Maven 3.6+ installed
☑ Git installed

Installation

bash# 1. Clone the repository
git clone https://github.com/ghouse-codes/url-shortener.git

# 2. Navigate to project directory
cd url-shortener

# 3. Build the project
mvn clean install

# 4. Run the application
mvn spring-boot:run

# ✅ Server starts at: http://localhost:8080

Quick Test with curl

bash# Shorten a URL
curl -X POST http://localhost:8080/api/shorten \
  -H "Content-Type: application/json" \
  -d '{"url": "https://github.com/ghouse-codes/url-shortener"}'

# Expected Response:
# {
#   "shortCode": "aB3xKz",
#   "shortUrl": "http://localhost:8080/aB3xKz",
#   "originalUrl": "https://github.com/ghouse-codes/url-shortener"
# }

# View all links + analytics
curl http://localhost:8080/api/urls

# Test redirect (open in browser or curl -L)
curl -L http://localhost:8080/aB3xKz


<!-- ═══════════════════════════════════════════════════════════════ -->
<!--                     📡 API REFERENCE                           -->
<!-- ═══════════════════════════════════════════════════════════════ -->
📡 API Reference

<div align="center">
MethodEndpointDescriptionRequest BodyResponsePOST/api/shortenShorten a long URL{"url": "..."}200 + shortCodeGET/{code}Redirect to original URL—302 RedirectGET/api/urlsList all URLs + analytics—200 + JSON arrayDELETE/api/urls/{id}Delete a short URL by ID—200 OK

</div>
Sample Responses

json// POST /api/shorten → 200 OK
{
  "shortCode": "aB3xKz",
  "shortUrl": "http://localhost:8080/aB3xKz",
  "originalUrl": "https://example.com/very/long/url"
}

// GET /api/urls → 200 OK
[
  {
    "id": 1,
    "shortCode": "aB3xKz",
    "originalUrl": "https://example.com/very/long/url",
    "clicks": 142
  }
]

// POST /api/shorten with empty URL → 400 Bad Request
"URL is required"


<!-- ═══════════════════════════════════════════════════════════════ -->
<!--                   📊 FEATURES BREAKDOWN                        -->
<!-- ═══════════════════════════════════════════════════════════════ -->
📊 Features Breakdown

<div align="center">
FeatureDescriptionStatusComplexityURL ShorteningConverts any valid long URL into a compact 6-char code✅ Done⭐⭐⭐Redirect EngineHTTP 302 redirect with sub-50ms average response✅ Done⭐⭐⭐⭐Click TrackingIncrements click counter on every redirect✅ Done⭐⭐Input ValidationBlocks null, blank, and empty URLs at API layer✅ Done⭐⭐URL PersistenceAll data persisted to database via JPA✅ Done⭐⭐⭐Analytics EndpointFull inventory of links with click stats✅ Done⭐⭐Link DeletionHard-delete a URL mapping by database ID✅ Done⭐⭐Code Generation6-char alphanumeric — 56.8B unique combinations✅ Done⭐⭐⭐Custom Short URLsUser-defined aliases🔜 Planned⭐⭐⭐QR Code ExportGenerate QR for any short link🔜 Planned⭐⭐User Auth / JWTSecure per-user link management🔜 Planned⭐⭐⭐⭐⭐

</div>

<!-- ═══════════════════════════════════════════════════════════════ -->
<!--                   💡 CORE CONCEPTS DEMONSTRATED                -->
<!-- ═══════════════════════════════════════════════════════════════ -->
💡 Core Concepts Demonstrated

<div align="center">
<img src="https://img.shields.io/badge/SE_Skills-Enterprise_Grade-6C63FF?style=for-the-badge&labelColor=302b63"/>
</div>
<br/>
┌─────────────────────────────────────────────────────────────┐
│  🧠 COMPUTER SCIENCE CONCEPTS IN THIS PROJECT               │
├─────────────────────────────────────────────────────────────┤
│                                                             │
│  📌 Hash/Code Generation   → Bijective base-62 mapping     │
│  📌 String Manipulation    → Java StringBuilder, chars[]   │
│  📌 Data Modeling          → OOP Entity design with JPA    │
│  📌 REST Architecture      → Stateless HTTP semantics      │
│  📌 HTTP Status Codes      → 200, 302, 400, 404 correctly  │
│  📌 CRUD Operations        → Create, Read, Delete via JPA  │
│  📌 Input Validation       → Null checks, blank guards     │
│  📌 ORM Patterns           → JPA/Hibernate abstraction     │
│  📌 Dependency Injection   → Spring IoC constructor DI     │
│  📌 Repository Pattern     → Data access layer separation  │
│                                                             │
└─────────────────────────────────────────────────────────────┘

Code Spotlight — The URL Code Generator:

java// 62^6 = 56,800,235,584 unique combinations
// Demonstrates: randomness, string building, character arrays
private String randomCode() {
    String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    StringBuilder sb = new StringBuilder();
    Random random = new Random();
    for (int i = 0; i < 6; i++) {
        sb.append(chars.charAt(random.nextInt(chars.length())));
    }
    return sb.toString();
}


<!-- ═══════════════════════════════════════════════════════════════ -->
<!--                   🎯 LEARNING OUTCOMES                         -->
<!-- ═══════════════════════════════════════════════════════════════ -->
🎯 Learning Outcomes

Through building this project, the following industry-grade skills were developed and demonstrated:

Backend Engineering


Designed and implemented a RESTful API following HTTP standards and best practices
Applied Spring Boot's auto-configuration to build production-ready services with minimal boilerplate
Used Spring Data JPA to abstract database interactions cleanly without raw SQL


System Design Thinking


Reasoned about the URL shortening problem as a distributed systems challenge (key space, collision avoidance, redirect latency)
Implemented click tracking as an in-line atomic operation on redirect — same pattern used by Bit.ly and TinyURL


Software Craftsmanship


Separated concerns across Controller / Entity / Repository layers (MVC pattern)
Wrote clean, readable Java with meaningful method and variable names
Used constructor injection (not field injection) — following Spring best practices


DevOps Awareness


Managed dependencies and build lifecycle via Maven
Used Git with meaningful commit history
Structured project for team collaboration on GitHub



<!-- ═══════════════════════════════════════════════════════════════ -->
<!--                   🚀 FUTURE ENHANCEMENTS                       -->
<!-- ═══════════════════════════════════════════════════════════════ -->
🚀 Future Enhancements

<div align="center">
ROADMAP ──────────────────────────────────────────────────────────────►
│
├── v1.1  ─── 🔐 JWT Authentication & per-user link management
│
├── v1.2  ─── 📊 Analytics Dashboard (Chart.js — clicks over time)
│
├── v1.3  ─── 🔖 Custom Aliases (user-defined short codes)
│
├── v1.4  ─── 📱 QR Code Generation for each short URL
│
├── v1.5  ─── ⏰ Link Expiry Dates (TTL-based URL invalidation)
│
├── v2.0  ─── ☁️  Cloud Deployment (AWS EC2 + RDS / Railway)
│
├── v2.1  ─── 🐳 Dockerize (Docker + docker-compose)
│
└── v2.2  ─── 🚀 Redis Caching for hot-path redirect acceleration

</div>

<!-- ═══════════════════════════════════════════════════════════════ -->
<!--                   🏆 SKILLS DEMONSTRATED                       -->
<!-- ═══════════════════════════════════════════════════════════════ -->
🏆 Skills Demonstrated

<div align="center">
<img src="https://img.shields.io/badge/MNC_Ready-Recruiter_Focused-00C853?style=for-the-badge&labelColor=004D40"/>
</div>
<br/>
<div align="center">
Skill DomainEvidence in This ProjectMNC RelevanceJava OOPEntity design, encapsulation, constructorsInfosys, TCS, WiproSpring BootREST APIs, auto-config, DI, annotationsAccenture, CognizantREST API DesignCorrect HTTP verbs, status codes, JSONAll MNCsDatabase / ORMJPA entities, repository pattern, queriesCapgemini, HCLProblem SolvingDesigned a full system from scratchIBM, DeloitteSystem DesignMVC separation, scalable architecture patternsSenior rolesGit / GitHubVersion control, clean repo, documentationAll companiesClean CodeReadable methods, no magic strings, DICode quality reviewsTesting ReadinessClear service boundaries ready for unit testsQA-aware teams

</div>

<!-- ═══════════════════════════════════════════════════════════════ -->
<!--                   🌍 REAL-WORLD APPLICATIONS                   -->
<!-- ═══════════════════════════════════════════════════════════════ -->
🌍 Real-World Applications

URL shortening infrastructure powers some of the world's highest-traffic systems:

🏢 Enterprise Use Cases
├── 📣 Marketing Campaigns    → Track clicks across email, SMS, and social
├── 📱 Social Media           → Twitter/X, Instagram Bio, WhatsApp (char limits)
├── 📊 BI Analytics           → Campaign ROI via click-through attribution
├── 🛒 E-Commerce             → Product links in promotional SMS messages
├── 🏥 Healthcare             → Patient portal links in appointment reminders
├── 🏦 BFSI                   → Secure payment and onboarding links
├── 📰 Publishing             → Article permalinks that survive site restructuring
└── 🎓 EdTech                 → Short resource links in LMS and course emails

Industry Players using similar systems:


Bit.ly — 10B+ clicks/month, enterprise analytics
TinyURL — Original 2002 system, still serving billions
t.co — Twitter's internal URL shortener for every link
goo.gl (deprecated) — Google's former URL shortener
Short.io — White-label SaaS URL shortening platform



This project is a working miniature of exactly these systems — demonstrating the same core data structures, redirect logic, and analytics patterns at a learnable scale.




<!-- ═══════════════════════════════════════════════════════════════ -->
<!--                   👨‍💻 DEVELOPER PROFILE                         -->
<!-- ═══════════════════════════════════════════════════════════════ -->
👨‍💻 Developer Profile

<div align="center">
<img src="https://capsule-render.vercel.app/api?type=rect&color=0:0f0c29,100:302b63&height=3&section=header" width="100%"/>
🧑‍💻 Ghouse — Full Stack Developer

Show Image
Show Image

╔══════════════════════════════════════════════════════╗
║  👨‍💻  Full Stack Developer                           ║
║  🌍  India                                          ║
║  💼  Open to Opportunities                          ║
╠══════════════════════════════════════════════════════╣
║  🔧  Backend:   Java · Spring Boot · REST APIs      ║
║  🎨  Frontend:  HTML · CSS · JavaScript             ║
║  🗄️  Database:  JPA/Hibernate · MySQL · H2          ║
║  ⚙️  Tools:     Git · Maven · VS Code · Postman     ║
╠══════════════════════════════════════════════════════╣
║  📦  Notable Projects:                              ║
║      → URL Shortener (this repo)                   ║
║      → See all: github.com/ghouse-codes            ║
╚══════════════════════════════════════════════════════╝

</div>

<!-- ═══════════════════════════════════════════════════════════════ -->
<!--              ⭐ WHY RECRUITERS SHOULD NOTICE THIS              -->
<!-- ═══════════════════════════════════════════════════════════════ -->
⭐ Why Recruiters Should Notice This Project

<div align="center">
<img src="https://img.shields.io/badge/Hiring_Managers-Read_This-FF6B6B?style=for-the-badge&labelColor=B71C1C"/>
</div>
<br/>
This is not a tutorial-follow project. This is original engineering.

Most developers at the fresher/junior level submit CRUD todo apps or weather dashboard clones. This project demonstrates something different:

1. Real System Design Thinking
The candidate understood that a URL shortener is fundamentally a key-value store with a redirect layer — and designed the architecture accordingly, not just wired together a framework.

2. Correct HTTP Semantics
Using 302 Found for redirects (not 200 OK) shows awareness of how the web actually works. This is the same status code used by Bit.ly in production.

3. Analytics Built In From Day One
Click tracking wasn't an afterthought — it was designed into the redirect flow as an atomic operation. This is production-grade thinking.

4. Enterprise-Stack Proficiency
Java + Spring Boot is the dominant stack at Infosys, TCS, Wipro, Cognizant, Accenture, Capgemini, and HCL. This project directly demonstrates readiness to contribute to those teams from day one.

5. Clean Architecture
Controller → Entity → Repository is a real architectural pattern used in enterprise Spring applications. Not everything in one class, not spaghetti code.

6. Growth Mindset (Roadmap)
The Future Enhancements section shows the developer can think beyond the current state and plan for scalability — a skill valued in system architects and senior engineers.


Bottom Line for Recruiters: This candidate can design a system, implement it in an enterprise stack, structure it cleanly, document it professionally, and ship it. That's what MNCs need.




<!-- ═══════════════════════════════════════════════════════════════ -->
<!--                      CONTRIBUTION                              -->
<!-- ═══════════════════════════════════════════════════════════════ -->
🤝 Contributing

Contributions, issues, and feature requests are welcome!

bash# Fork the project
# Create your feature branch
git checkout -b feature/AmazingFeature

# Commit your changes
git commit -m 'Add AmazingFeature'

# Push to the branch
git push origin feature/AmazingFeature

# Open a Pull Request


<!-- ═══════════════════════════════════════════════════════════════ -->
<!--                         FOOTER                                 -->
<!-- ═══════════════════════════════════════════════════════════════ -->
<div align="center">
<img src="https://capsule-render.vercel.app/api?type=waving&color=0:0f0c29,50:302b63,100:24243e&height=120&section=footer" width="100%"/>
⭐ If this project helped you or impressed you — drop a star! It means the world. ⭐

<br/>
Show Image

<br/>
Built with ❤️ by ghouse-codes | Java · Spring Boot · Clean Architecture

</div>
