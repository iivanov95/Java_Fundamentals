package Lecture7_ObjectsAndClasses;

import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

public class Demo {
    static class Dice {
        int sides;


    }
    public void roll() {
        Random rnd = new Random();
        int side = rnd.nextInt(7);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDate birthdayIvan = LocalDate.of(1995, 3,30);

        System.out.println(birthdayIvan);


    }
}