# Foreign_exchange-Backend-project
Setup and Installation Instructions
Clone the Repository: git clone https://github.com/0001Nitish/DailyExpenceSharingApplication cd

Install Dependencies: Ensure you have Maven installed. Run the following command to install the necessary dependencies: mvn clean install

Database Setup:
Ensure you have a running instance of a database (e.g., MySQL, PostgreSQL).

Update the application.properties file with your database configuration: properties 
spring.datasource.url=jdbc:postgres://localhost:5432/your_database
spring.datasource.username=your_username 
spring.datasource.password=your_password 
spring.jpa.hibernate.ddl-auto=update

DDL
