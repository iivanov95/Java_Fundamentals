package FinalExam;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String skill = scanner.nextLine();
        String command = scanner.nextLine();
        while (!command.equals("For Azeroth")) {
            String[] commandParts = command.split(" ");
            String currentCommand = commandParts[0];
            switch (currentCommand) {
                case "GladiatorStance":
                    for (char symbol : skill.toCharArray()) {
                        if (Character.isLetter(symbol)) {
                            String currentSymbol = symbol + "";
                            char upperCase = currentSymbol.toUpperCase().charAt(0);
                            skill = skill.replace(symbol, upperCase);
                        }
                    }
                    System.out.println(skill);
                    break;
                case "DefensiveStance":
                    for (char symbol : skill.toCharArray()) {
                        if (Character.isLetter(symbol)) {
                            String currentSymbol = symbol + "";
                            char upperCase = currentSymbol.toLowerCase().charAt(0);
                            skill = skill.replace(symbol, upperCase);
                        }
                    }
                    System.out.println(skill);
                    break;
                case "Dispel":
                    int index = Integer.parseInt(command.split(" ")[1]);
                    String currentLetter = skill.charAt(index) + "";
                    String newLetter = commandParts[2];
                    if (index <= skill.length() - 1) {
                        skill = skill.replaceFirst(currentLetter, newLetter);
                        System.out.println("Success!");
                    } else {
                        System.out.println("Dispel too weak.");
                    }
                    break;
                case "Target":
                    if (commandParts[1].equals("Change")) {
                        String firstSubstring = commandParts[2];
                        String secondSubstring = commandParts[3];
                        if (skill.contains(firstSubstring)) {
                            skill = skill.replaceAll(firstSubstring, secondSubstring);
                            System.out.println(skill);
                        } else {
                            System.out.println(skill);
                        }
                    } else if (commandParts[1].equals("Remove")) {
                        String substring = commandParts[2];
                        if (skill.contains(substring)) {
                            skill = skill.replace(substring, "");
                            System.out.println(skill);
                        }
                    }
                    break;
                default:
                    System.out.println("Command doesn't exist!");
            }
            command = scanner.nextLine();
        }
    }
}