/*
Question Description
An organization wants to ensure that all employees follow the same company policy.

Each employee has:

Their own employee name
A shared company policy code that applies to everyone in the organization
Requirements
Create a class named Employee.
Store the following:
name as a non-static data member
policyCode as a static variable, hardcoded as "SEC-2025"
Use a constructor to initialize the employee name.
Create a non-static method that displays:
Employee name
Company policy code
Create a main class that:
Creates employee objects using hardcoded data
Displays policy details for each employee
UML Diagram
​
Hardcoded Data Set to Use
Employee Name
Anita
Suresh
Expected Output
Anita follows policy SEC-2025
Suresh follows policy SEC-2025
*/
public class EmployeeCompanyPolicyDisplaySystem{
    public static void main(String[] args){
        Employee e1 = new Employee("Anita", "SEC-2025");
        Employee e2 = new Employee("Suresh", "SEC-2025");


        e1.displayPolicy();
        e2.displayPolicy();
    }
}
class Employee{
    String name;
    String policyCode;


    Employee(String name, String policyCode){
        this.name = name;
        this.policyCode = policyCode;
    }
    void displayPolicy(){
        System.out.println(name + " follows policy " + policyCode);
    }
}