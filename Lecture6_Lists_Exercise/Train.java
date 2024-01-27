package Lecture6_Lists_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> wagons = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int maxCapacity = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String[] commandParts = command.split(" ");
            if (command.contains("Add")) {
                wagons.add(Integer.parseInt(commandParts[1]));
            } else {
                int numberWagons = wagons.size() - 1;
                for (int position = 0; position <= numberWagons; position++) {
                    int currentWagonSize = wagons.get(position);
                    boolean canFit = maxCapacity - currentWagonSize >= Integer.parseInt(commandParts[0]);
                    if (canFit) {
                        int newWagonSize = currentWagonSize + Integer.parseInt(commandParts[0]);
                        wagons.remove(position);
                        wagons.add(position, newWagonSize);
                        break;
                    }
                }
            }
            command = scanner.nextLine();
        }
        for (int wagon : wagons) {
            System.out.print(wagon + " ");
        }
    }
}