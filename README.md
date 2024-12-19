# API_Backend

This project aims to create a robust and secure REST API using Java 21 with the Quarkus framework. The API will be designed to offer various endpoints, each serving different functionalities, and will implement an authentication process to ensure secure access. The API will adhere to best practices in security and performance, leveraging Quarkus for fast startup times and low memory consumption.

Key Features:

REST API Endpoints:

A set of endpoints will be implemented to handle various types of operations, such as:
GET: Retrieve data from the server.
POST: Create new records in the system.
PUT/PATCH: Update existing records.
DELETE: Remove records from the system.
Each endpoint will return data in JSON format and support common HTTP status codes (200 OK, 400 Bad Request, 401 Unauthorized, 404 Not Found, etc.).
Authentication and Security:

JWT-based Authentication: Users will authenticate using JSON Web Tokens (JWT). Upon successful login, the server will issue a JWT token that must be included in the header of future requests to access protected resources.
Role-based Access Control (RBAC): The API will implement different levels of access, ensuring that only users with the appropriate roles can access certain endpoints (e.g., admin-only or user-specific resources).
Secure Password Storage: Passwords will be hashed using a secure algorithm, such as bcrypt, to prevent plain text storage.
CORS Support: Cross-origin resource sharing (CORS) will be configured to allow secure communication with external clients.
Quarkus Framework:

Quarkus will be used to handle the backend logic. It will provide an optimized environment for building Java applications with:
Fast startup times and reduced memory footprint.
Live reload support for efficient development.
Easy integration with popular Java libraries like Hibernate for database interaction and RESTEasy for building the REST API.
Database Integration:

The application will integrate with a database (e.g., PostgreSQL or H2 for development purposes) to store and retrieve data.
JPA (Java Persistence API) will be used for managing the relational data.
The app will include entities and repositories for performing CRUD operations.
Testing:

The API pretends to be documented using OpenAPI (Swagger), allowing users and developers to interact with the API via an auto-generated web interface that provides details about the available endpoints, request/response formats, and authentication methods.
Technologies Used:

Java 21: The latest version of Java for modern features and improvements.
Quarkus: A Java framework optimized for containerized environments, providing fast startup and low memory usage.
JWT (JSON Web Tokens): For secure and stateless user authentication.
Hibernate/JPA: For data persistence and database interaction.
Swagger/OpenAPI: For auto-generated API documentation.
