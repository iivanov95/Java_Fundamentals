package Lecture6_Lists_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equals("End")) {
            String[] commandParts = command.split(" ");
            String commandName = commandParts[0];
            switch (commandName) {
                case "Add":
                    int numberToAdd = Integer.parseInt(commandParts[1]);
                    numbers.add(numberToAdd);
                    break;
                case "Insert":
                    int numberToInsert = Integer.parseInt(commandParts[1]);
                    int indexToInsert = Integer.parseInt(commandParts[2]);
                    if (isValidIndex(indexToInsert, numbers.size())) {
                        numbers.add(indexToInsert, numberToInsert);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Remove":
                    int indexToRemove = Integer.parseInt(commandParts[1]);
                    if (isValidIndex(indexToRemove, numbers.size())) {
                        numbers.remove(indexToRemove);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Shift":
                    int count = Integer.parseInt(commandParts[2]);
                    String direction = commandParts[1];
                    if (direction.equals("left")) {
                        for (int i = 1; i <= count; i++) {
                            int firstElement = numbers.get(0);
                            numbers.remove(0);
                            numbers.add(firstElement);
                        }
                    } else if (direction.equals("right")) {
                        for (int i = 1; i <= count; i++) {
                            int lastElement = numbers.get(numbers.size() - 1);
                            numbers.remove(numbers.size() - 1);
                            numbers.add(0, lastElement);
                        }
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
    public static boolean isValidIndex(int index, int size) {
        return index >= 0 && index <= size - 1;
    }
}