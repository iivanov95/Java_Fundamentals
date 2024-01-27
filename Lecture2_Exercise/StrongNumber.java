package Lecture2_Exercise;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int startNum = number;
        //проверка дали сумата от факториелите == първоначалното число
        //За всяка цифра от числото повтарям:
        //1. цифра
        //2. факториел
        //3. сумирам в sumFact
        //4. премахване последната цифра
        //стоп: число <= 0
        //продължавам: число > 0

        int sumFact = 0; //сумата от факториелите

        while (number > 0) {
            //За всяка цифра от числото повтарям:
            //1. цифра
            int lastDigit = number % 10;
            //2. факториел
            int fact = 1;
            for (int i = 1; i <= lastDigit; i++) {
                fact = fact * i;
            }
            //3. сумирам в sumFact
            sumFact += fact;
            //4. премахване последната цифра
            number = number / 10;
        }
        if (startNum == sumFact) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
