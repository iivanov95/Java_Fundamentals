package Lecture9_AssociativeArrays_Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> materials = new LinkedHashMap<>();

        materials.put("shards", 0);
        materials.put("fragments", 0);
        materials.put("motes", 0);

        Map<String, Integer> junks = new LinkedHashMap<>();
        boolean isWon = false;

        while (!isWon) {
            String input = scanner.nextLine();
            String[] inputData = input.split("\\s+");


            for (int i = 0; i <= inputData.length - 1; i += 2) {
                int quantity = Integer.parseInt(inputData[i]);
                String material = inputData[i + 1].toLowerCase();

                if (material.equals("shards") || material.equals("fragments") || material.equals("motes")) {
                    int currentQuantity = materials.get(material);
                    materials.put(material, currentQuantity + quantity);
                } else {
                    if (junks.containsKey(material)) {
                        int currentQuantity = junks.get(material);
                        junks.put(material, currentQuantity + quantity);
                    } else {
                        junks.put(material, quantity);
                    }
                }

                if (materials.get("shards") >= 250) {
                    isWon = true;
                    System.out.println("Shadowmourne obtained!");
                    materials.put("shards", materials.get("shards") - 250);
                    break;
                } else if (materials.get("fragments") >= 250) {
                    isWon = true;
                    System.out.println("Valanyr obtained!");
                    materials.put("fragments", materials.get("fragments") - 250);
                    break;
                } else if (materials.get("motes") >= 250) {
                    isWon = true;
                    System.out.println("Dragonwrath obtained!");
                    materials.put("motes", materials.get("motes") - 250);
                    break;
                }
            }
            if (isWon) {
                break;
            }
        }
        materials.entrySet().forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
        junks.entrySet().forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
    }
}