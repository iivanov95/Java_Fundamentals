package Lecture4_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int index = 0; index <= numbers.length - 1; index++) {
            int currentNum = numbers[index];
            int leftSum = 0; //сума на елементите в ляво
            int rightSum = 0; //сума на елементите в дясно
            //1. намираме сумата на елементите в ляво
            //лявата сума: всички елементи от първия до моя без да го включвам
            for (int leftIndex = 0; leftIndex < index; leftIndex++) {
                leftSum += numbers[leftIndex];
            }
            //2. намираме сумата на елементите в дясно
            ////дясната сума: всички елементи след моя до последния
            for (int rightIndex = index + 1; rightIndex <= numbers.length - 1; rightIndex++) {
                rightSum += numbers[rightIndex];
            }
            //3. проверка дали двете суми са равни -> имам намерено число

            if (leftSum == rightSum) {
                System.out.println(index);
                return; //прекратява цялата програма
            }
        }
        //обходили сме всички числа и нито едно не е отговорило на условието
        System.out.println("no");
    }
}