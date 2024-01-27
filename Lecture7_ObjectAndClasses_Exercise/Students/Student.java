package Lecture7_ObjectAndClasses_Exercise.Students;

public class Student {
    private String firstName;
    private String lastName;
    private double grade;

    //конструктор за създаване на обекти от класа Student:
    public Student (String firstName, String lastName, double grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public double getGrade() {
        return this.grade;
    }
}