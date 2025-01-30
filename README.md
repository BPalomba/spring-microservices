Spring Boot Microservices Project 🚀
This project implements a microservices architecture using Spring Boot, with MariaDB and PostgreSQL as databases.

## 🛠️ Technologies Used  
- **Spring Boot** (Spring Cloud, Spring Data JPA, Spring Security)  
- **MariaDB** and **PostgreSQL** (for data storage)  
- **Eureka** (for service discovery)  
- **Spring Cloud Gateway** (for API routing)  
- **Feign Client** (for inter-service communication)  

## 📌 Features  
✅ **Microservices-based architecture**  
✅ **Hybrid database approach:** MariaDB & PostgreSQL  
✅ **Load balancing and API routing with Spring Cloud Gateway**  
✅ **Service-to-service communication using Feign Client**  
✅ **Centralized configuration with Spring Cloud Config**  


## 📡 API Endpoints  

### 🎓 **Course Service** (`/api/course`)  
| Method | Endpoint | Description |
|--------|----------|-------------|
| **POST** | `/api/course/create` | Create a new course |
| **GET** | `/api/course/all` | Retrieve all courses |
| **GET** | `/api/course/search/{id}` | Find a course by its ID |
| **GET** | `/api/course/search-student/{idCourse}` | Find students enrolled in a specific course |

### 🧑‍🎓 **Student Service** (`/api/student`)  
| Method | Endpoint | Description |
|--------|----------|-------------|
| **POST** | `/api/student/create` | Create a new student |
| **GET** | `/api/student/all` | Retrieve all students |
| **GET** | `/api/student/search/{id}` | Find a student by their ID |
| **GET** | `/api/student/search-by-course/{idCourse}` | Find students by course ID |




## 🛠️ System Design Blueprint

![image](https://github.com/user-attachments/assets/7083a3eb-f0f5-4785-98fb-e6e861a67d41)
