package Lecture3_Exercise;

import java.util.Scanner;

public class FromLeftToTheRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numLines = Integer.parseInt(scanner.nextLine());
        int sumLeft = 0;
        int sumRight = 0;
        for (int input = 1; input <= numLines; input++) {
            String currentInput = scanner.nextLine();
            for (char position = 0; position <= currentInput.length() - 1; position++) {
                sumLeft += position;

            }
            if (sumLeft > sumRight) {
                System.out.println(sumLeft);
            } else {
                System.out.println(sumRight);
            }
        }
    }
}