# Smart Contact Manager

Smart Contact Manager (SCM) is a modern web application built with Spring Boot, designed to help users efficiently manage their contacts. SCM offers advanced features such as social login, cloud-based image storage, email integration, and a responsive, themeable UI.

## Features
1. User signup with email and password
2. Account verification via email link
3. Social login with Google and GitHub (OAuth)
4. Add contacts with profile pictures
5. Contact pictures uploaded to cloud (AWS, Cloudinary)
6. View all contacts
7. View detailed contact information
8. Compose and send emails directly from SCM
9. Emails support text and attachments
10. Update contact information
11. Delete contacts
12. Search contacts
13. Pagination for contact lists
14. Export contact data to Excel
15. Mark contacts as favorites
16. View and edit user profile details
17. Dark and light theme support
18. Provide feedback

## Technologies Used
- Latest Spring Boot
- Spring Framework
- Spring MVC
- Spring Data JPA (ORM)
- OAuth for social login (Google, GitHub)
- Thymeleaf template engine
- Validation
- Spring Security (secure routes)
- PostgreSQL Database
- Java email services (sending/receiving email)
- AWS/Cloudinary SDK (file storage)
- JavaScript
- Bootstrap CSS Framework
- Flowbite components
- PDF/Excel tools for report generation

## Getting Started

### Prerequisites
- Java 21 or higher
- Maven
- PostgreSQL database

### Setup Instructions
1. Clone the repository:
   ```bash
   git clone <repository-url>
   cd scm2.0
   ```
2. Configure your database and cloud storage credentials in `src/main/resources/application.properties`.
3. Build the project:
   ```bash
   ./mvnw clean install
   ```
4. Run the application:
   ```bash
   ./mvnw spring-boot:run
   ```
5. Access the app at [http://localhost:8080](http://localhost:8080)

## Project Structure
```
scm2.0/
├── src/main/java/com/scm/scm20/        # Java source code
├── src/main/resources/templates/        # Thymeleaf templates
├── src/main/resources/static/           # Static assets (CSS, JS)
├── src/main/resources/application.properties # Configurations
├── pom.xml                              # Maven build file
```

## Usage
- Register or login (email/password or social login)
- Add, view, update, and delete contacts
- Upload contact pictures to cloud
- Send emails with attachments
- Export contacts to Excel
- Switch between dark and light themes
- Provide feedback

## Contributors
1. Abdur Rabbi Tota
2. Md Sakibul Islam
3. Obidul Islam
4. Devjoti Das
