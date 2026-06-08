# Spring Boot User List Demo Update

The original demo project used a simple structure and did not clearly separate the business logic into different layers.

In this upgraded version, I refactored the project using a three-layer architecture:

Controller layer: handles HTTP requests and returns responses.

Service layer: contains the business logic.

DAO layer: is responsible for data access.

This structure makes the project easier to understand, maintain, and extend. It also follows a more common backend development style used in real Spring Boot projects.




## Project Structure

```text
springboot-web-01
├── .mvn/                           # Maven wrapper configuration
├── src/
│   └── main/
│       └── java/
│           └── com.yunhan.springbootweb01/
│               ├── controller/
│               │   └── UserController.java
│               │
│               ├── dao/
│               │   ├── UserDao.java
│               │   └── impl/
│               │
│               ├── pojo/
│               │   └── User.java
│               │
│               ├── service/
│               │   ├── UserService.java
│               │   │  
│               │   └── impl/
│               │
│               └── SpringbootWeb01Application.java
│                  