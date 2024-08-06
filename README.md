# Employee-Management-System
Employee Management System REST API
This is a REST API for an Employee Management System, built using Spring Boot, Hibernate, and a database. It supports CRUD (Create, Read, Update, Delete) operations for managing employees.

Features
Create a new employee
Retrieve all employees
Retrieve a single employee by ID
Update an existing employee
Delete an employee
Prerequisites
Java 8 or higher
Maven
MySQL or any other relational database
Getting Started
Clone the repository
git clone https://github.com/Zeeshanhassan75/employee-management-system.git
cd employee-management-system
Setup Database
Create a database named employee_db.
Update the application.properties file with your database credentials.
spring.datasource.url=jdbc:mysql://localhost:3306/employee_db
spring.datasource.username=your_username
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL5Dialect
Build and Run the Application
mvn clean install
mvn spring-boot:run
The application will start running at http://localhost:8080.

API Endpoints
Create a new Employee
URL: /api/employees
Method: POST
Request Body:
{
    "name": "Zeeshan hassan",
    "phone": "1234567890",
    "email": "zeeshan@example.com"
}
Retrieve all Employees
URL: /api/employees
Method: GET
Retrieve a single Employee by ID
URL: /api/employees/{id}
Method: GET
URL Parameters:
id: Employee ID
Update an existing Employee
URL: /api/employees/{id}
Method: PUT
URL Parameters:
id: Employee ID
Request Body:
{
    "name": "Zeeshan Hassan",
    "phone": "0987654321",
    "email": "zeeshan@example.com"
}
Delete an Employee
URL: /api/employees/{id}
Method: DELETE
URL Parameters:
id: Employee ID
Technologies Used
Spring Boot
Hibernate
MySQL
Maven
Author
Zeeshan Hassan
