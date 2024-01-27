package Lecture5_Methods_Exercise;

import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int number = 1; number <= n; number++) {
            //проверка дали числото е топ:
            //1. сумата от цифрите му да се дели на 8 -> isSumDigitsDivisibleBy8
            //2. да съдържа поне една нечетна цифра -> isOddDigitContainedInNumber
            if (isSumDigitsDivisibleBy8(number) && isOddDigitContainedInNumber(number)) {
                System.out.println(number);
            }
        }
    }

    //1. метод за проверка дали сумата от цифрите му се дели на 8
    public static boolean isSumDigitsDivisibleBy8(int number) {
        //1. сумата от цифрите на числото
        int sum = 0;
        while (number > 0) {
            int lastDigit = number % 10; //последна цифра
            sum += lastDigit; //сумираме
            number = number / 10; //премахваме
        }
        //2. дали сумата се дели на 8
        return sum % 8 == 0;
//        if (sum % 8 == 0) {
//            return true;
//        } else {
//            return false;
//        }

    }

    //2. метод за проверка дали цислото съдържа поне една нечетна цифра
    public static boolean isOddDigitContainedInNumber(int number) {
        while (number > 0) {
            int lastDigit = number % 10; //последна цифра
            if (lastDigit % 2 != 0) {
                //нечетна цифра - поне една!
                return true;
            } else {
                //ако е четна цифрата, премахваме
                number = number / 10;
            }
        }
        //проверили сме всички цифри и няма нечетна
        return false;
    }
}
