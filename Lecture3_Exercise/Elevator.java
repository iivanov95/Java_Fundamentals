package Lecture3_Exercise;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numPeople = Integer.parseInt(scanner.nextLine());
        int elevatorCapacity = Integer.parseInt(scanner.nextLine());
        int courses = (int) Math.ceil((double) numPeople / elevatorCapacity);
        System.out.println(courses);
    }
}