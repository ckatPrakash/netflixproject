# Netflix Login Project

This project is a simple Java-based web application that simulates a Netflix-like login page. It is built using Maven and follows standard web application practices.

## Project Structure

```
netflix-login
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           └── LoginServlet.java
│   │   ├── resources
│   │   └── webapp
│   │       ├── WEB-INF
│   │       │   └── web.xml
│   │       ├── css
│   │       │   └── styles.css
│   │       └── login.jsp
│   ├── test
│   │   └── java
│   │       └── com
│   │           └── example
│   │               ├── LoginServletTest.java
│   │               └── LoginIntegrationTest.java
├── pom.xml
└── README.md
```

## Features

- A login page with fields for email/username and password.
- A "Sign In" button and a "Remember Me" checkbox.
- A link for "Need help?".
- Form submission handled by a servlet that logs the submitted data.

## Prerequisites

- Java Development Kit (JDK) 8 or higher
- Apache Maven
- Apache Tomcat (for deployment)

## Build Instructions

1. Clone the repository:
   ```
   git clone <repository-url>
   cd netflix-login
   ```

2. Build the project using Maven:
   ```
   mvn clean package
   ```

3. This will generate a `.war` file in the `target` directory.

## Deployment Instructions

1. Deploy the generated `.war` file to your Apache Tomcat server.
2. Access the application at `http://localhost:8080/netflix-login/`.

## Testing

- Unit tests for the `LoginServlet` can be run using:
  ```
  mvn test
  ```

- Integration tests are also included to verify the functionality of the login page.

## License

This project is licensed under the MIT License.