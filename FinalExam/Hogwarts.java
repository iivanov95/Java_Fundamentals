package FinalExam;

import java.util.Scanner;

public class Hogwarts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String spell = scanner.nextLine();

        String commands = scanner.nextLine();
        while (!commands.equals("Abracadabra")) {
            String[] commandsParts = commands.split(" ");
            String currentCommand = commandsParts[0];
            switch (currentCommand) {
                case "Abjuration":
                    for (char symbol : spell.toCharArray()) {
                        if (Character.isLetter(symbol)) {
                            String currentSymbol = symbol + "";
                            char upperCase = currentSymbol.toUpperCase().charAt(0);
                            spell = spell.replace(symbol, upperCase);
                        }
                    }
                    System.out.println(spell);
                    break;
                case "Necromancy":
                    for (char symbol : spell.toCharArray()) {
                        if (Character.isLetter(symbol)) {
                            String currentSymbol = symbol + "";
                            char lowerCase = currentSymbol.toLowerCase().charAt(0);
                            spell = spell.replace(symbol, lowerCase);
                        }
                    }
                    System.out.println(spell);
                    break;
                case "Illusion":
                    int index = Integer.parseInt(commandsParts[1]);
                    String letter = commandsParts[2];
                    if (index >= 0 && index <= spell.length() - 1) {
                        String currentChar = spell.charAt(index) + "";
                        spell = spell.replace(currentChar, letter);
                        System.out.println("Done!");
                    } else {
                        System.out.println("The spell was too weak.");
                    }
                    break;
                case "Divination":
                    String firstSubstring = commandsParts[1];
                    String secondSubstring = commandsParts[2];
                    if (spell.contains(firstSubstring)) {
                        spell = spell.replaceAll(firstSubstring, secondSubstring);
                        System.out.println(spell);
                    }
                    break;
                case "Alteration":
                    String substring = commandsParts[1];
                    if (spell.contains(substring)) {
                        spell = spell.replace(substring, "");
                        System.out.println(spell);
                    }
                    break;
                default:
                    System.out.println("The spell did not work!");
            }
            commands = scanner.nextLine();
        }
    }
}