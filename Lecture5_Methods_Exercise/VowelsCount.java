package Lecture5_Methods_Exercise;

import java.util.Locale;
import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toLowerCase();
        //"Test".toLowerCase() -> "test"
        //"IVAN".toLowerCase() -> "ivan"

        printNumVowels(input);
    }

    //Метод, който отпечатва броя на малките гласни букви
    public static void printNumVowels (String text) {
        int numVowels = 0;
        //текст = "eLiza".toCharArray() -> ['e', 'l', 'i', 'z', 'a']
        for (char symbol : text.toCharArray()) {
            if (symbol == 'a' || symbol == 'e' || symbol == 'i' || symbol == 'o' || symbol == 'u') {
                numVowels++;
            }
        }
        System.out.println(numVowels);
    }
}