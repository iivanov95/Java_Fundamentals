package Lecture9_AssociativeArrays_Exercise;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        LinkedHashMap<String, Integer> resourcesMap = new LinkedHashMap<>();

        while (!input.equals("stop")) {
            String resource = input;
            int quantity = Integer.parseInt(scanner.nextLine());

            if (resourcesMap.containsKey(resource)) {
                resourcesMap.put(resource, resourcesMap.get(resource) + quantity);
            } else {
                resourcesMap.put(resource, quantity);
            }

            input = scanner.nextLine();
        }
        resourcesMap.entrySet().forEach(resource -> System.out.println(resource.getKey() + " -> " + resource.getValue()));
    }
}