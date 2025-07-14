# 🚀 Demo_API_Test_Framework

![Build Status](https://img.shields.io/badge/build-passing-brightgreen)
![Java](https://img.shields.io/badge/Java-21-blue)
![RestAssured](https://img.shields.io/badge/RestAssured-API--Testing-green)
![Maven](https://img.shields.io/badge/Maven-3.9.9-orange)

---

## 📌 Project Overview

**Demo_API_Test_Framework** is a scalable and maintainable **REST API Test Automation Framework** designed using a **hybrid architecture**. It leverages **TestNG**, **Rest Assured**, **POJO models**, and design patterns like **Service Object Model**, **Builder**, and **Singleton**.

This framework is built for **modularity**, **reusability**, and **easy integration**, with robust logging, reporting, and request/response filtering capabilities.

---

## 🧰 Technologies & Tools

- ☕ Java 21  
- 📦 Maven  
- 🧪 TestNG  
- 🔗 Rest Assured  
- 🪵 Log4j (Logging)  
- 📊 Extent Reports  
- 🎧 TestNG Listeners  

---

## 🔨 Core Features

### ✅ Design Patterns

- **Singleton Pattern**  
  Ensures only one instance of service objects. Constructor of model classes is made `private` to restrict object creation.

- **Service Object Model**  
  API endpoints are encapsulated in dedicated service classes extending `BaseService`.

- **Builder Pattern**  
  Allows flexible parameter construction for payloads by passing values in any order.

---

### 🔧 Framework Modules

- **🔹 BaseService Class**  
  Acts as a wrapper around Rest Assured, containing HTTP methods and base URI setup.

- **🔹 Services Layer**  
  Individual classes for each service (based on Swagger/OpenAPI specs), extending `BaseService`. Each contains endpoint-specific methods.

- **🔹 Model/POJO Classes**  
  Represents request/response schemas, enabling clean JSON serialization/deserialization.

- **🔹 Test Classes (src/test/java)**  
  TestNG-based test cases using `@Test` annotations to validate various service scenarios.

- **🔹 Filters for Interception**  
  Request/Response filters to log or modify data before reaching the server/client.

- **🔹 Listeners**  
  Custom TestNG listeners to log events like test start, pass, fail, and capture errors dynamically.

---

### 🧪 Testing & Execution

- **Environment Configuration**  
  Properties like `baseURI`, `token`, and other runtime values are stored in `config.properties`.

- **Parallel Execution**  
  Enabled via `testng.xml` configuration to run tests in parallel or grouped suites.

- **Command-Line Execution**  
  A `.bat` file (`run_tests.bat`) allows one-click execution from terminal or CI/CD tools.

---

## 📈 Reports & Logs

- **Extent HTML Reports**  
  Rich, visual reports with test status, error logs, and screenshots (if applicable) stored in `/reports` with timestamps.

- **Log4j Logs**  
  Multi-level logging (INFO, DEBUG, ERROR) captured in `/logs` for full execution traceability.

---

## ▶️ Getting Started

### ✅ Prerequisites

- Java JDK 21 installed  
- Maven installed  
- Set environment variables: `JAVA_HOME`, `MAVEN_HOME`, and update `PATH`

### 🧪 Run Tests

1. **Clone the Repository:**
   ```bash
   git clone https://github.com/Gangadhar2821/Demo_API_Test_Framework.git

   
