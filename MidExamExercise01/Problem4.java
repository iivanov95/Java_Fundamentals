package MidExamExercise01;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Problem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.contains("end")) {
            String[] commandParts = command.split(" ");
            String currentCommand = commandParts[0];

            switch (currentCommand) {
                case "swap":
                    int firstIndex = Integer.parseInt(commandParts[1]);
                    int secondIndex = Integer.parseInt(commandParts[2]);
                    int firstNumber = numbersList.get(firstIndex);
                    int secondNumber = numbersList.get(secondIndex);
                    numbersList.set(firstIndex, secondNumber);
                    numbersList.set(secondIndex, firstNumber);
                    break;
                case "multiply":
                    firstIndex = Integer.parseInt(commandParts[1]);
                    secondIndex = Integer.parseInt(commandParts[2]);
                    firstNumber = numbersList.get(firstIndex);
                    secondNumber = numbersList.get(secondIndex);
                    int result = firstNumber * secondNumber;
                    numbersList.set(firstIndex, result);
                    break;
                case "decrease":
                    for (int i = 0; i < numbersList.size(); i++) {
                        int currentNum = numbersList.get(i) - 1;
                        numbersList.set(i, currentNum);
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        for (int i = 0; i < numbersList.size(); i++) {
            if (i == numbersList.size() - 1) {
                System.out.print(numbersList.get(i));
            } else {
                System.out.print(numbersList.get(i) + ", ");
            }
        }
    }
}