# Spotify Wrapped: Top Artists and Tracks Dashboard
A backend API for tracking and analyzing top artists and tracks based on user listening history.

This project tracks users' listening history (top artists and tracks) over time using the Spotify API. It aggregates data daily and allows querying of the most listened-to artists and tracks during a selected time period.

## Technologies Used
- Java Spring Boot
- MySQL
- JPA/Hibernate
- Maven for project management

## Setup Instructions

### Prerequisites
- Java 17 or higher
- Maven
- MySQL Database
- dotenv-java dependency (for local environment variables)

### 1. Clone the repository:
```bash
git clone https://github.com/yourusername/projectname.git
cd projectname
```

### 2. Install the dependencies
```bash
mvn clean install
```

### 3. Configure the .env file
``` ini
DB_URL=jdbc:mysql://localhost:3306/mydatabase
DB_USERNAME=root
DB_PASSWORD=yourpassword
```

### 4. Set up MySQL Database
Create a database and update the .env file with the correct dataabase name

### 5. Run the application
``` bash
mvn sprint-boot:run
```
