#  Student Management System (Java Console Application)

This is a **Java console-based project** that allows you to manage student records. You can add, view, search, and delete students using a simple menu-driven interface.

---

##  Features

-  Add Student (ID, Name, Age)
-  View All Students
-  Search Student by ID
-  Delete Student by ID
-  Exit the Program

---

##  How It Works

This application uses:
- Java `ArrayList` to store student objects
-`Scanner` for user input
- A `while(true)` loop for menu-driven interaction

Each student is represented using the `Student` class, which holds the student's ID, name, and age.

---

## Technologies Used
- Java
- ArrayList
- Scanner class
- Basic OOPs (Object-Oriented Programming)

---

## How to Run

1. Clone the repository:

2. Open the project in any Java IDE (like VS Code, IntelliJ, Eclipse)

3. Compile and run `StudentManagement.java` file.

4. Follow the menu on the console.

---

##  Sample Output

---- Student Management System ----
1. Add Student
2. View All Students
3. Search Student by ID
4. Delete Student by ID
5. Exit
Enter your choice: 1
Enter ID: 1
Enter Name: vaishuu
Enter Age: 20
Student added successfully.

---- Student Management System ----
1. Add Student
2. View All Students
3. Search Student by ID
4. Delete Student by ID
5. Exit
Enter your choice: 1
Enter ID: 2
Enter Name: gayuu
Enter Age: 18
Student added successfully.

---- Student Management System ----
1. Add Student
2. View All Students
3. Search Student by ID
4. Delete Student by ID
5. Exit
Enter your choice: 2
All Students:
ID: 1 | Name: vaishuu | Age: 20
ID: 2 | Name: gayuu | Age: 18

---- Student Management System ----
1. Add Student
2. View All Students
3. Search Student by ID
4. Delete Student by ID
5. Exit
Enter your choice: 3
Enter Student ID to search: 1
ID: 1 | Name: vaishuu | Age: 20

---- Student Management System ----
1. Add Student
2. View All Students
3. Search Student by ID
4. Delete Student by ID
5. Exit
Enter your choice: 4
Enter Student ID to delete: 2
Student deleted.

---- Student Management System ----
1. Add Student
2. View All Students
3. Search Student by ID
4. Delete Student by ID
5. Exit
Enter your choice: 2
All Students:
ID: 1 | Name: vaishuu | Age: 20

---- Student Management System ----
1. Add Student
2. View All Students
3. Search Student by ID
4. Delete Student by ID
5. Exit
Enter your choice: 5
Exiting... Thank you!
