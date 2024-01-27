package Lecture10_TextProcessing;

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String toRemove = scanner.nextLine();
        String text = scanner.nextLine();

        for (int i = 0; i < text.length(); i++) {
            int index = text.indexOf(toRemove);

            text = text.replace(toRemove, "");
        }
        System.out.println(text);
    }
}