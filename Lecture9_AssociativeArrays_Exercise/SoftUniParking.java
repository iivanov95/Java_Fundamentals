package Lecture9_AssociativeArrays_Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countCommands = Integer.parseInt(scanner.nextLine());

        Map<String, String> parkingDataMap = new LinkedHashMap<>();

        for (int i = 1; i <= countCommands; i++) {
            String command = scanner.nextLine();
            String[] commandParts = command.split(" ");
            String commandName = commandParts[0];
            String userName = commandParts[1];

            switch (commandName) {
                case "register":
                    String carNumber = commandParts[2];
                    if (parkingDataMap.containsKey(userName)) {
                        System.out.printf("ERROR: already registered with plate number %s%n", carNumber);
                    } else {
                        parkingDataMap.put(userName, carNumber);
                        System.out.printf("%s registered %s successfully%n", userName, carNumber);
                    }
                    break;
                case "unregister":
                    if (!parkingDataMap.containsKey(userName)) {
                        System.out.printf("ERROR: user %s not found%n", userName);
                    } else {
                        parkingDataMap.remove(userName);
                        System.out.printf("%s unregistered successfully%n", userName);
                    }
                    break;
            }
        }
        for (Map.Entry<String, String> entry : parkingDataMap.entrySet()) {
            System.out.printf("%s => %s%n", entry.getKey(), entry.getValue());
        }
    }
}