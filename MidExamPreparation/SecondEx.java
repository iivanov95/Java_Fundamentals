package MidExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SecondEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> productList = Arrays.stream(scanner.nextLine()
                              .split("!")).collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equals("Go Shopping!")) {
            String[] commandsArr = command.split(" ");
            String currentCommand = commandsArr[0];
            String item = commandsArr[1];
            switch (currentCommand) {
                case "Urgent":
                    if (!productList.contains(item)) {
                        productList.add(0, item);
                    }
                    break;
                case "Unnecessary":
                    productList.remove(item);
                    break;
                case "Correct":
                    String newItem = commandsArr[2];
                    if (productList.contains(item)) {
                        int oldItemIndex = productList.indexOf(item);
                        productList.set(oldItemIndex, newItem);
                    }
                    break;
                case "Rearrange":
                    if (productList.contains(item)) {
                        productList.remove(item);
                        productList.add(item);
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.println(String.join(", ", productList));
    }
}