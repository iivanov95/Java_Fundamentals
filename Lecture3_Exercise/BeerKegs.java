package Lecture3_Exercise;

import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberKegs = Integer.parseInt(scanner.nextLine());
        String biggestKeg = "";
        double volumeBiggestKeg = Double.MIN_VALUE;
        for (int i = 1; i <= numberKegs; i++) {
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());
            double volume = Math.pow(radius, 2) * Math.PI * height;

            if (volume > volumeBiggestKeg) {
                volumeBiggestKeg = volume;
                biggestKeg = model;
            }
        }
        System.out.println(biggestKeg);
    }
}