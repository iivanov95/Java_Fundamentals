package MidExamExercise01;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Problem5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> items = Arrays.stream(scanner.nextLine()
                .split(", ")).collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equals("Craft!")) {
            String[] commandParts = command.split(" - ");
            switch (commandParts[0]) {
                case "Collect":
                    String currentItem = commandParts[1];
                    if (!items.contains(currentItem)) {
                        items.add(currentItem);
                    }
                    break;
                case "Drop":
                    String item = commandParts[1];
                    items.remove(item);
                    break;
                case "Combine Items":
                    String twoItems = commandParts[1];
                    String oldItem = String.valueOf(twoItems.split(":")[0]);
                    String newItem = String.valueOf(twoItems.split(":")[1]);
                    if (items.contains(oldItem)) {
                        int index = items.indexOf(oldItem) + 1;
                        items.add(index, newItem);
                    }
                    break;
                case "Renew":
                    currentItem = commandParts[1];
                    if (items.contains(currentItem)) {
                        items.remove(items.indexOf(currentItem));
                        items.add(currentItem);
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        for (int i = 0; i < items.size(); i++) {
            if (i == items.size() - 1) {
                System.out.print(items.get(i));
            } else {
                System.out.print(items.get(i) + ", ");
            }
        }
    }
}