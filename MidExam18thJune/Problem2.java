package MidExam18thJune;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> coffees = Arrays.stream(scanner.nextLine()
                .split(" ")).collect(Collectors.toList());
        int countCommands = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= countCommands; i++) {
            String command = scanner.nextLine();
            String[] commandParts = command.split(" ");
            String currentCommand = commandParts[0];

            switch (currentCommand) {
                case "Include":
                    String currentCoffee = commandParts[1];
                    coffees.add(currentCoffee);
                    break;
                case "Remove":
                    String whichCoffee = commandParts[1];
                    int numberCoffees = Integer.parseInt(commandParts[2]);
                    if (whichCoffee.equals("first")) {
                        coffees.removeAll(coffees.subList(0, numberCoffees));
                    }
                    if (whichCoffee.equals("last")) {
                        int start = coffees.size() - 1;
                        int end = coffees.size() - 1 - numberCoffees;
                        for (int j = start; j >= end; j--) {
                            if (j == end) {
                                break;
                            }
                            coffees.remove(j);
                        }
                    }
                    break;
                case "Prefer":
                    int firstIndex = Integer.parseInt(commandParts[1]);
                    int secondIndex = Integer.parseInt(commandParts[2]);
                    if (firstIndex >= 0 && firstIndex <= coffees.size() - 1 && secondIndex >= 0 && secondIndex <= coffees.size() - 1) {
                        String firstCoffee = coffees.get(firstIndex);
                        String secondCoffee = coffees.get(secondIndex);
                        coffees.set(firstIndex, secondCoffee);
                        coffees.set(secondIndex, firstCoffee);
                    }
                    break;
                case "Reverse":
                    Collections.reverse(coffees);
                    break;
            }
        }
        System.out.println("Coffees:");
        for (String coffee: coffees) {
            System.out.print(coffee + " ");
        }
    }
}