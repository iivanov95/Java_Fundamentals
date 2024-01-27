package FinalExamPreparation;

import java.util.Scanner;

public class PasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder passwordSB = new StringBuilder(scanner.nextLine());
        String input = scanner.nextLine();
        String finalPass = "";
        while (!input.equals("Done")) {
            String[] commandParts = input.split(" ");
            String command = commandParts[0];
            switch (command) {
                case "TakeOdd":
                    for (int i = 0; i <= passwordSB.length() - 1; i++) {
                        if (i % 2 != 0) {
                            finalPass += passwordSB.charAt(i);
                        }
                    }
                    System.out.println(finalPass);
                    passwordSB = new StringBuilder(finalPass);
                    break;
                case "Cut":
                    int index = Integer.parseInt(commandParts[1]);
                    int length = Integer.parseInt(commandParts[2]);
                    if (index + length >= passwordSB.length() - 1) {
                        passwordSB.delete(index, passwordSB.length() - 1);
                    } else {
                        passwordSB.delete(index, index + length);
                    }
                    System.out.println(passwordSB);
                    break;
                case "Substitute":
                    String substring = commandParts[1];
                    String substitute = commandParts[2];
                    if (passwordSB.toString().contains(substring)) {

                    } else {
                        System.out.println("Nothing to replace!");
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.println("Your password is: " + passwordSB);
    }
}