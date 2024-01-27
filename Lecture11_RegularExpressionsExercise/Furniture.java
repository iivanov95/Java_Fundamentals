package Lecture11_RegularExpressionsExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = ">>(?<furnitureName>[A-Za-z]+)<<(?<price>[0-9]+\\.?[0-9]*)!(?<quantity>[0-9]+)";
        Pattern pattern = Pattern.compile(regex);
        List<String> furnitureList = new ArrayList<>();

        double totalPrice = 0;
        String input = scanner.nextLine();
        //">>{furniture name}<<{price}!{quantity}
        while (!input.equals("Purchase")) {
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                String furnitureName = matcher.group("furnitureName");
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));
                furnitureList.add(furnitureName);
                double currentPrice = price * quantity;
                totalPrice += currentPrice;
            }
            input = scanner.nextLine();
        }
        System.out.println("Bought furniture:");
        for (String furniture : furnitureList) {
            System.out.println(furniture);
        }
        System.out.printf("Total money spend: %.2f", totalPrice);
    }
}