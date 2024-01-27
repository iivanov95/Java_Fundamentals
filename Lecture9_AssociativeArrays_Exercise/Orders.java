package Lecture9_AssociativeArrays_Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        LinkedHashMap<String, Double> productPrice = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> productQuantity = new LinkedHashMap<>();

        while (!input.equals("buy")) {
            String productName = input.split(" ")[0];
            double price = Double.parseDouble(input.split(" ")[1]);
            int quantity = Integer.parseInt(input.split(" ")[2]);

            if (!productPrice.containsKey(productName)) {
                productPrice.put(productName, price);
                productQuantity.put(productName, quantity);
            } else {
                productPrice.put(productName, price);
                productQuantity.put(productName, productQuantity.get(productName) + quantity);
            }
            input = scanner.nextLine();
        }
        for (Map.Entry<String, Double> product : productPrice.entrySet()) {
            String name = product.getKey();
            double currentPrice = productPrice.get(name);
            int currentQuantity = productQuantity.get(name);
            double totalPrice = currentQuantity * currentPrice;
            System.out.printf("%s -> %.2f%n", name, totalPrice);
        }
    }
}