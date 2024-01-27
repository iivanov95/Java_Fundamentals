package Lecture4_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbersArr = Arrays.stream(scanner.nextLine() // "1 4 3 2"
                          .split(" ")) // ["1" "4" "3" "2"]
                            .mapToInt(Integer::parseInt) // [1, 4, 3, 2]
                            .toArray();
        //последния елемент винаги е топ число
        for (int index = 0; index < numbersArr.length - 1; index++) {
            int currentNum = numbersArr[index]; //числото на текущия индекс
            boolean isBigger = true;
            //true -> текущото число е по-голямо от всички отдясно
            //false -> текущото число не е по-голямо от всички отдясно

            for (int i = index + 1; i <= numbersArr.length - 1; i++) { //всички елементи след моя
                int numberAfter = numbersArr[i];
                if (currentNum <= numberAfter) {
                    isBigger = false;
                    break;
                    //моето число е по-малко от някое след него
                }
            }
            if (isBigger) {
                //моето число винаги е било по-голямо
                System.out.print(currentNum + " ");
            }
        }
        System.out.println(numbersArr[numbersArr.length - 1]);
    }
}