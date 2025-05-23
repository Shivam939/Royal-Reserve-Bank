# 🏦 The Royal Reserve Bank — Java Spring Boot Microservices

A modern **Digital Banking Solution** built with **Spring Boot** and **Spring Cloud**, following a **microservices architecture**.  
It demonstrates scalable backend services, secure authentication with **Auth0**, event-driven communication, and robust observability.

---

## 🧩 Services Overview

- **🏧 Account API** – Manages customer accounts and balances (MongoDB)  
- **💳 Transaction API** – Processes financial transactions and maintains consistency (PostgreSQL)  
- **📈 Asset Management API** – Handles stocks, bonds, and asset info (MySQL)  
- **📩 Notification API** – Sends email/SMS notifications asynchronously via Kafka  
- **🌐 API Gateway** – Spring Cloud Gateway (MVC) handling routing and authentication (Auth0)  
- **⚙️ Config Server** – Centralized configuration management  
- **🔍 Discovery Server** – Service registry with Netflix Eureka  

---

## 🏗️ Tech Stack

**Backend**
- Java 17  
- Spring Boot (Microservices)  
- Spring Cloud Gateway MVC  
- Kafka (Event-driven messaging)  
- MongoDB, PostgreSQL, MySQL (Databases)  
- Redis (Caching)  
- Auth0 (Authentication & Authorization)  
- Resilience4J (Circuit Breaker)  

**Monitoring & Observability**
- Prometheus (Metrics)  
- Grafana (Dashboards)  
- Zipkin (Distributed Tracing)  

**Deployment**
- Docker  

---

## 🧱 Application Architecture

This application follows a **Microservices-based Architecture**:

- Independent, scalable services  
- Service discovery with Eureka for dynamic communication  
- Centralized config management with Config Server  
- Event-driven communication with Kafka  
- Secure APIs via Auth0 integrated in API Gateway  
- Circuit breaker for resilience using Resilience4J  
- Cache-aside pattern with Redis to boost performance  
- Observability via Zipkin, Prometheus, and Grafana  

---

## 📦 How to Run

```bash
# Clone the repository
git clone <repository-url>
cd royal-reserve-bank

# Start supporting services (Kafka, Redis, etc.)
docker-compose -f docker-compose-infrastructure-services.yml up -d

# Build and run Config Server
mvn clean install -pl config-server
java -jar config-server/target/config-server.jar

# Build all other microservices
mvn clean install -pl !config-server

# Start Discovery Server and microservices (individually or via Docker Compose)
docker-compose up -d
