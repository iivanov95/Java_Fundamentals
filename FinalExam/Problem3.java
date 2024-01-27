package FinalExam;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        LinkedHashMap<String, Integer> personHealth = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> personEnergy = new LinkedHashMap<>();

        while (!command.equals("Results")) {
            String[] commandParts = command.split(":");
            String currentCommand = commandParts[0];
            switch (currentCommand) {
                case "Add":
                    String name = commandParts[1];
                    int health = Integer.parseInt(commandParts[2]);
                    int energy = Integer.parseInt(commandParts[3]);
                    if (personHealth.containsKey(name)) {
                        personHealth.put(name, personHealth.get(name) + health);
                    } else {
                        personHealth.put(name, health);
                        personEnergy.put(name, energy);
                    }
                    break;
                case "Attack":
                    String attackerName = commandParts[1];
                    String defenderName = commandParts[2];
                    int damage = Integer.parseInt(commandParts[3]);
                    if (personHealth.containsKey(defenderName) && personEnergy.containsKey(attackerName)) {
                        personHealth.put(defenderName, personHealth.get(defenderName) - damage);
                        personEnergy.put(attackerName, personEnergy.get(attackerName) - 1);
                        if (personHealth.get(defenderName) <= 0) {
                            personHealth.remove(defenderName);
                            personEnergy.remove(defenderName);
                            System.out.println(defenderName + " was disqualified!");
                        }
                        if (personEnergy.get(attackerName) <= 0) {
                            personHealth.remove(attackerName);
                            personEnergy.remove(attackerName);
                            System.out.println(attackerName + " was disqualified!");
                        }
                    }
                    break;
                case "Delete":
                    String username = commandParts[1];
                    if (personHealth.containsKey(username) || personEnergy.containsKey(username)) {
                        personHealth.remove(username);
                        personEnergy.remove(username);
                    } else if (username.equals("All")) {
                        personHealth.clear();
                        personEnergy.clear();
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        int count = 0;
        for (Map.Entry<String, Integer> entry : personEnergy.entrySet()) {
            count++;
        }
        System.out.println("People count: " + count);
        for (Map.Entry<String, Integer> entry : personHealth.entrySet()) {
            System.out.printf("%s - %d - %d%n", entry.getKey(), entry.getValue(), personEnergy.get(entry.getKey()));
        }
    }
}