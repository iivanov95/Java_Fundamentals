package Lecture10_TextProcessing;

import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] bannedWordsArr = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (String bannedWord : bannedWordsArr) {
            String asterisk = repeatString(bannedWord);
            text = text.replace(bannedWord, asterisk);
        }
        System.out.println(text);
    }
    public static String repeatString (String banWord) {
        String result = "";
        for (int i = 0; i < banWord.length(); i++) {
            result = result + "*";
        }
        return  result;
    }
}