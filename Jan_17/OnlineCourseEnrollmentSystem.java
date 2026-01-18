/*
Online Course Enrollment System
Question Description
An online learning platform wants to build a small internal Java program to track student enrollments.

Every time a student enrolls in a course, the system must store:

The student name
The course name
The platform also wants to keep track of the total number of enrollments across the entire application, regardless of how many enrollment objects are created.

Requirements
Create a class named Enrollment.
Each enrollment object must store the following non-static data members:
studentName
courseName
Maintain a static variable to store the total number of enrollments.
When a new enrollment object is created:
The constructor must initialize student name and course name
The total enrollment count must increase automatically
Create a non-static method to display:
Student name
Course name
Create a main class that:
Creates enrollment objects using hardcoded data
Displays enrollment details for all students
Prints the total number of enrollments
UML Diagram
​
Hardcoded Data Set to Use
Student Name	Course Name
Alice	Java
Bob	Python
Charlie	Spring
Expected Output
Alice enrolled in Java
Bob enrolled in Python
Charlie enrolled in Spring
Total Enrollments: 3
 */



public class OnlineCourseEnrollmentSystem{
    public static void main(String[] args){
        Enrollment s1 = new Enrollment("Alice", "Java");
        Enrollment s2 = new Enrollment("Bob", "Python");
        Enrollment s3 = new Enrollment("Charlie", "Spring");

        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();
        System.out.println("Total Enrollments: " + Enrollment.totalEnrollments);
    }
}
class Enrollment{
    String StudentName;
    String courseName;
    static int totalEnrollments;

    Enrollment(String StudentName, String courseName){
        this.StudentName = StudentName;
        this.courseName = courseName;
        totalEnrollments++;
    }

    void displayDetails(){
        System.out.println(StudentName + " enrolled in " + courseName);
    }
}