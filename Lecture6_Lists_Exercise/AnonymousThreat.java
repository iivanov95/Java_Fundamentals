package Lecture6_Lists_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AnonymousThreat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> input = Arrays.stream(scanner.nextLine()
                        .split(" ")).collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equals("3:1")) {
            String[] currentCommand = command.split(" ");
            String commandWord = currentCommand[0];
            if (commandWord.equals("merge")) {
                int startIndex = Integer.parseInt(currentCommand[1]);
                int endIndex = Integer.parseInt(currentCommand[2]);
                String sum = "";
                if (startIndex >= 0 && endIndex <= input.size() - 1) {
                    for (int i = startIndex; i <= endIndex; i++) {
                        if (startIndex >= 0 && endIndex <= input.size()) {

                        }
                        input.removeAll(input.subList(startIndex + 1, endIndex + 1));
                        sum += input.get(i) + "";
                    }
                } else {
                    continue;
                }
                input.set(startIndex, sum);
            } else if (commandWord.equals("divide")) {
                int index = Integer.parseInt(currentCommand[1]);
                int partitions = Integer.parseInt(currentCommand[2]);

            }

            command = scanner.nextLine();
        }

    }
}
