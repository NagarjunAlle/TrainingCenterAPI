Steps to Run the Spring Boot Project:
 1.Clone the Repository: 
  Clone the repository containing the Spring Boot project to your local machine.
 2.Open in IDE: 
  Open the project in your preferred Java IDE, such as IntelliJ IDEA, Eclipse, or Spring Tool Suite.
 3.Configure Database: 
  Make sure you have MySQL installed and running. Update the application.properties file with your MySQL database connection details, including URL, username, and password.
 4.Build the Project:
  Build the project using Maven or Gradle. If you're using Maven, you can run mvn clean install from the command line.
 5.Run the Application: 
  Run the Spring Boot application. You can do this by running the main class (Application.java) as a Java application from your IDE, or by using the Maven or Gradle Spring Boot plugins.
 6.Access the APIs: 
  Once the application is running, you can access the APIs using tools like Postman or cURL. The base URL for the APIs will typically be http://localhost:8080/api/training-centers, assuming the application is running on the default port 8080.
What Has Been Done:
  1.Created a Spring Boot project with RESTful APIs using Spring Web.
  2.Implemented a POST API to create and save a new training center with validation for mandatory fields, email, phone, and size.
  3.Implemented a GET API to retrieve a list of all stored training centers.
  4.Used Spring Data JPA for database access.
  5.Used Hibernate for ORM (Object-Relational Mapping).
  6.Integrated validation using Spring Boot's validation annotations.
  7.Implemented exception handling for validation errors and other exceptions.
Validators Used:
  @NotBlank, @Size, and @Pattern for field validations.
  @Email for email validation.
  @NotNull and @Min for numeric validations.
How to Test:
  POST API: Use tools like Postman or cURL to send a POST request to http://localhost:8080/api/training-centers with the required JSON body. Verify that a new training center is created and returned in the response.
  GET API: Similarly, send a GET request to http://localhost:8080/api/training-centers to retrieve the list of all stored training centers. Verify that the response contains the expected data.
