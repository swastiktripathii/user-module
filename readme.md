# **Car Rental User Module**

## **Project Overview**

This project is a backend service for a Car Rental Company designed to handle:

User Registration (both individual and bulk upload)

User login authentication and tracking

Maintaining login history in a PostgreSQL database

Role-based access control where Admin can bulk upload users, and Employees can only register and login.

You interact with the backend only via gRPC APIs.

### Technologies Used

Java 17+ & Spring Boot: Modern, robust language and framework with excellent ecosystem support for backend services.

PostgreSQL: A powerful, open-source relational database to store users and login history reliably.

gRPC: High-performance RPC framework ideal for efficient communication between clients and server using Protocol Buffers (protobufs).

Flyway: Manages database schema migrations safely and automatically.

JPA / Hibernate: Simplifies database interaction with object-relational mapping.

BCrypt Password Hashing: Securely hash user passwords to protect against compromises.

Validation & Error Handling: Ensures data integrity and provides meaningful responses.


.proto files define your gRPC services and message structures.

grpc/ contains your gRPC server implementation.

model/ and repository/ manage DB entities and data access.

service/ has core application logic.

How to Run the Project Prerequisites:
Java 17 or higher installed

Maven installed

PostgreSQL installed and running (version compatible with Flyway)

PostgreSQL database and user configured

A gRPC client tool (e.g., Postman with gRPC support, BloomRPC, IntelliJ HTTP client)

Step 1: Setup PostgreSQL Database
Create database and user with appropriate privileges (adjust password accordingly):

# **SQL**

CREATE DATABASE carrental;
CREATE USER carrental_user WITH PASSWORD 'YourStrongPass123!';
GRANT ALL PRIVILEGES ON DATABASE carrental TO carrental_user;
Step 2: Configure application.yml
Edit src/main/resources/application.yml with your database details:

text
spring:
datasource:
url: jdbc:postgresql://localhost:5432/carrental
username: carrental_user
password: YourStrongPass123!
jpa:
hibernate:
ddl-auto: update
show-sql: true
properties:
hibernate:
format_sql: true
flyway:
enabled: true
locations: classpath:db/migration
Step 3: Build and Run the Application
From the project root directory, run:

# **Bash**

mvn clean package
mvn spring-boot:run
The application will start on localhost:9090.

Flyway will apply DB migrations, creating needed tables.

Step 4: Test Using a gRPC Client
Connect your gRPC client to:

text
localhost:9090
Import the .proto from src/main/proto/user_service.proto to get service definition.

# **Sample gRPC Service Inputs (Unique Examples)**
1. RegisterUser
   json
   {
   "name": "Evelyn Harper",
   "email": "evelyn.harper@example.net",
   "password": "ComplexPass!789",
   "userType": "Employee"
   }
2. LoginUser
   json
   {
   "email": "evelyn.harper@example.net",
   "password": "ComplexPass!789",
   "ipAddress": "203.0.113.45"
   }
3. UploadUsers (Bulk Upload)
   json
   {
   "users": [
   {
   "name": "Frank Castle",
   "email": "frank.castle@example.org",
   "password": "Punisher1978!",
   "userType": "Admin"
   },
   {
   "name": "Jessica Jones",
   "email": "jessica.jones@example.org",
   "password": "AliasAlias#1",
   "userType": "Employee"
   },
   {
   "name": "Matt Murdock",
   "email": "matt.murdock@example.org",
   "password": "Daredevil@2025",
   "userType": "Employee"
   }
   ],
   "adminToken": "sample-admin-token"
   }
4. GetLoginHistory
   json
   {
   "userId": 3,
   "adminToken": "sample-admin-token"
   }
   Additional Notes
   Replace "adminToken" values with real tokens if authentication is implemented.

Passwords must be strong and handled securely.

Always verify userType values are either "Admin" or "Employee".


## **Docker Usage**

##### Build Docker Image

Run this command in your project root (where the Dockerfile is located):
docker build -t user-module:latest .

##### Run Docker Container

Start the container and expose the gRPC port:
docker run -p 6565:6565 user-module:latest
Notes
Make sure you have built your JAR file (e.g., using mvn clean package) before building the Docker image.
The application will be accessible on port 6565.

# **Summary**

This project leverages modern backend technologies and gRPC for high-performance API communication. It demonstrates secure user management, role-based access, and scalable designs such as bulk user uploads and login tracking with PostgreSQL persistence.