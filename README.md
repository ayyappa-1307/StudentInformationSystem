📁 Student Information System (SIS) - Java Console Application
This project is a simple, menu-driven Student Information System (SIS) implemented as a console application in Java. It allows administrators to perform basic CRUD (Create, Read, Update, Delete) operations on student records, focusing on fundamental concepts of Object-Oriented Programming (OOP) and data validation.



🚀 Key Features
CRUD Operations: Full functionality to Add, View, Search, Update, and Delete student records.

Modular Design: Separates concerns into dedicated classes for data modeling, business logic, and input validation.

Data Validation: Includes robust input checking for age (positive integer) and grade (A-F or 1-10 format) to ensure data integrity.

Search Flexibility: Allows searching for students by either Student ID or Name.

Formatted Output: Displays student data in a clear, organized table format.

🛠️ Technology Stack
Language: Java

Core Concepts: Object-Oriented Programming (OOP), Java Collections (ArrayList), Console I/O (Scanner), Exception Handling, Regular Expressions (for validation).

⚙️ Setup and Run Instructions
This project requires the Java Development Kit (JDK) to compile and run.

Prerequisites

Java Development Kit (JDK 8 or newer) installed.

Step-by-Step Guide

1.Clone the Repository (or Download):
git clone [Your Repository URL Here]
cd Student_SIS

2.Compile the Source Files: Navigate to the project root directory where the .java files are located and compile all classes:
javac *.java

3.Run the Application: Execute the main class to start the SIS menu:
java StudentInformationSystem

📂 Code Structure
The project is structured with a clear separation of concerns, making it easy to understand and maintain.
StudentInformationSystem.java
StudentManager.java
Student.java
ValidationUtils.java

💻 Usage
Once the application is running, the main menu will be displayed.

Example Workflow: Adding a New Student

Select option 1. Add Student.

The system will prompt for Name, Age, Grade, Student ID, and Contact.

Validation is active: If you enter a non-positive number for age or an incorrect format for grade (e.g., 'Z'), the system will reject the input and prompt you again until a valid entry is provided.

4.Upon successful input: ✔ Student Added Successfully!

💡.Extendability (Future Enhancements)
Data Persistence: Implement File I/O (Serialization or CSV) or JDBC to store student data permanently, preventing data loss when the application exits.

Advanced Search: Implement more complex search queries (e.g., search by age range, grade, or course).

Sorting Functionality: Add options to sort the View All Students output by Name, Age, or Student ID.

Error Handling: Expand try-catch blocks in StudentInformationSystem.java to provide more specific and helpful error messages for all potential exceptions.
