package Lecture6_Lists_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!command.equals("end")) {
            if (command.contains("Delete")) {
                int numberForRemoval = Integer.parseInt(command.split(" ")[1]);
                numbers.removeAll(Arrays.asList(numberForRemoval));
            } else if (command.contains("Insert")) {
                int numberForInsert = Integer.parseInt(command.split(" ")[1]);
                int indexForInsert = Integer.parseInt(command.split(" ")[2]);
                numbers.add(indexForInsert, numberForInsert);
            }

            command = scanner.nextLine();
        }

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}