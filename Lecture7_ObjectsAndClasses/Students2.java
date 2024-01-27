package Lecture7_ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students2 {
    public static class Student {
        String firstName;
        String lastName;
        String age;
        String town;

        public Student(String firstName, String lastName, String age, String town) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.town = town;
        }

        public String getTown() {
            return this.town;
        }

        public String getAge() {
            return this.age;
        }

        public String getFirstName() {
            return this.firstName;
        }

        public String getLastName() {
            return this.lastName;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> studentsList = new ArrayList<>();

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] studentsDataArr = input.split(" ");
            String firstName = studentsDataArr[0];
            String lastName = studentsDataArr[1];
            String age = studentsDataArr[2];
            String town = studentsDataArr[3];

            if (isStudentExistent(studentsList, firstName, lastName)) {

            }

            Student currentStudent = new Student(firstName, lastName, age, town);

            studentsList.add(currentStudent);

            input = scanner.nextLine();
        }

    }

    static boolean isStudentExistent (List<Student> studentList, String firstName, String lastName) {
        for (Student student : studentList) {
            if (student.getFirstName().equals(firstName)
                    && student.getLastName().equals(lastName)) {
                return true;
            }
        }
        return false;
    }
}
