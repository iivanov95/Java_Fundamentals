package Lecture5_Methods;

import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String wordInput = scanner.nextLine();
        int repetitions = Integer.parseInt(scanner.nextLine());

        String resultText = repeatString(repetitions, wordInput);
        System.out.println(resultText);
    }

    public static String repeatString(int n, String word) {
        String result = "";
        for (int i = 1; i <= n; i++) {
            result = result += word;
        }
        return result;
    }
}