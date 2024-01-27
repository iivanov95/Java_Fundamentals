package FinalExamPreparation;

import java.util.*;

public class PlantDiscovery2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        HashMap<String, Integer> plantRarityMap = new HashMap<>();
        HashMap<String, Double> plantRatingMap = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            String[] tokens = scanner.nextLine().split("<->");
            String plantName = tokens[0];
            int rarity = Integer.parseInt(tokens[1]);
            plantRarityMap.put(plantName, rarity);
            plantRatingMap.put(plantName, 0.0);
        }

        String input = scanner.nextLine();

        while (!input.equals("Exhibition")) {
            String[] tokens = input.split("[: -]+");
            String command = tokens[0];
            String plantName = tokens[1];
            boolean isValidCommand = command.equals("Rate") || command.equals("Update") || command.equals("Reset");
            if (!plantRarityMap.containsKey(plantName) || !isValidCommand) {
                System.out.println("error");
            } else {
                switch (command) {
                    case "Rate":
                        double rate = Double.parseDouble(tokens[2]);
                        if (plantRatingMap.get(plantName) == 0) {
                            plantRatingMap.put(plantName, rate);
                        } else {
                            double newRate = (plantRatingMap.get(plantName) + rate) / 2;
                            plantRatingMap.put(plantName, newRate);
                        }
                        break;
                    case "Update":
                        int newRarity = Integer.parseInt(tokens[2]);
                        plantRarityMap.put(plantName, newRarity);
                        break;
                    case "Reset":
                        plantRatingMap.put(plantName, 0.0);
                        break;
                }
            }
            input = scanner.nextLine();
        }
        System.out.println("Plants for the exhibition:");
        //- %s; Rarity: %d; Rating: %.2f
        for (Map.Entry<String, Integer> entry : plantRarityMap.entrySet()) {
            System.out.printf("- %s; Rarity: %d; Rating: %.2f%n", entry.getKey(), entry.getValue(), plantRatingMap.get(entry.getKey()));
        }
    }
}