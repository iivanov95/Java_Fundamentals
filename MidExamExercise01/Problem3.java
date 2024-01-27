package MidExamExercise01;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> inputElements = Arrays.stream(scanner.nextLine()
                               .split(" ")).collect(Collectors.toList());
        String command = scanner.nextLine();
        int numberMoves = 0;
        while (!command.equals("end")) {
            String[] currentCommand = command.split(" ");
            int firstIndex = Integer.parseInt(currentCommand[0]);
            int secondIndex = Integer.parseInt(currentCommand[1]);
            if (firstIndex == secondIndex || firstIndex < 0 || secondIndex > inputElements.size() - 1) {
                int middleIndex = inputElements.size() / 2;
                inputElements.add(middleIndex, "-" + numberMoves + "a");
                System.out.println("Invalid input! Adding additional elements to the board%n");
                command = scanner.nextLine();
            } else {
                if (inputElements.get(firstIndex).equals(inputElements.get(secondIndex))) {
                    inputElements.remove(inputElements.get(firstIndex));
                    inputElements.remove(inputElements.get(secondIndex));
                    int correctNumber = Integer.parseInt(inputElements.get(secondIndex));
                    System.out.printf("Congrats! You have found matching elements - %d!%n", correctNumber);
                } else {
                    System.out.println("Try again!");
                }
                numberMoves++;
                boolean isEmpty = false;
                for (int i = 0; i < inputElements.size(); i++) {
                    if (Integer.parseInt(inputElements.get(i)) == 0) {
                        isEmpty = true;
                    } else {
                        isEmpty = false;
                    }
                }
                if (isEmpty) {
                    System.out.printf("You have won in %d turns!", numberMoves);
                }
                command = scanner.nextLine();
                if (command.equals("end")) {
                    System.out.println("Sorry you lose :(");
                    for (int i = 0; i < inputElements.size(); i++) {
                        System.out.print(inputElements.get(i));
                    }
                    break;
                }
            }
        }
    }
}
