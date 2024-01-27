package Lecture4_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int targetSum = Integer.parseInt(scanner.nextLine());
        //обхождаме всички числа от масива
        for (int index = 0; index <= numbers.length - 1; index++) {
            int currentNum = numbers[index]; // текущото число
            for (int i = index + 1; i <= numbers.length - 1; i++) { //всички числа след моето
                int nextNum = numbers[i]; //числото след моето
                if (currentNum + nextNum == targetSum) {
                    System.out.println(currentNum + " " + nextNum);
                }
            }
        }
    }
}