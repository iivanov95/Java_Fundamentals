package Lecture9_AssociativeArrays;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeMap<String, Integer> airplanesMap = new TreeMap<>();

        airplanesMap.put("Boeing 737", 130);
        airplanesMap.put("Airbus A320", 160);
        airplanesMap.put("Airbus", 150);

        if (!airplanesMap.containsKey("Airbus")) {
            airplanesMap.put("Airbus", 98);
        }
        if (!airplanesMap.containsKey("Airbus 00")) {
            airplanesMap.put("Airbus 00", 98);
        }

        airplanesMap.remove("Airbus");

        for (Map.Entry<String, Integer> entry : airplanesMap.entrySet()) {
            // String mapKey = entry.getKey();
            // int mapValue = entry.getValue();
            System.out.printf("%s - %d%n", entry.getKey(), entry.getValue());
        }

    }
}