package Lecture7_ObjectsAndClasses;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] wordsArr = scanner.nextLine().split(" ");

        Random randomObj = new Random();
        for (int i = 0; i < wordsArr.length; i++) {
            int rndIndexX = randomObj.nextInt(wordsArr.length);
            int rndIndexY = randomObj.nextInt(wordsArr.length);

            String oldWord = wordsArr[rndIndexX];
            wordsArr[rndIndexX] = wordsArr[rndIndexY];
            wordsArr[rndIndexY] = oldWord;
        }
        System.out.println(String.join(System.lineSeparator(), wordsArr));
    }
}