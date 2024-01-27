package FinalExamPreparation;

import java.util.Scanner;

public class TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String encryptedMessage = scanner.nextLine();

        String command = scanner.nextLine();
        StringBuilder modifyMessage = new StringBuilder(encryptedMessage);

        while (!command.equals("Decode")) {
            String[] commandParts = command.split("\\|");
            String currentCommand = commandParts[0];

            switch (currentCommand) {
                case "Move":
                    int numberOfLetters = Integer.parseInt(commandParts[1]);
                    String firstLetters = modifyMessage.substring(0, numberOfLetters);
                    modifyMessage.delete(0, numberOfLetters);
                    modifyMessage.append(firstLetters);
                    break;
                case "Insert":
                    int index = Integer.parseInt(commandParts[1]);
                    String value = commandParts[2];
                    modifyMessage.insert(index, value);
                    break;
                case "ChangeAll":
                    String substring = commandParts[1];
                    String replacement = commandParts[2];
                    String currentMessage = modifyMessage.toString();
                    currentMessage = currentMessage.replace(substring, replacement);
                    modifyMessage = new StringBuilder(currentMessage);
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.println("The decrypted message is: " + modifyMessage);
    }
}