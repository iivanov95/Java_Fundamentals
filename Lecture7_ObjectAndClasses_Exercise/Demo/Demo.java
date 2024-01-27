package Lecture7_ObjectAndClasses_Exercise.Demo;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Animal dog = new Animal("dog", 12);

        dog.setType("cat");

    }
}