package Lecture2_Exercise;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int numStudents = Integer.parseInt(scanner.nextLine());
        double lightsaberPrice = Double.parseDouble(scanner.nextLine());
        double robePrice = Double.parseDouble(scanner.nextLine());
        double beltPrice = Double.parseDouble(scanner.nextLine());
        double lightsaberSum = Math.ceil(numStudents * 1.1) * lightsaberPrice;
        double robeSum = numStudents * robePrice;
        double freeBeltsSum = (numStudents / 6.0) * beltPrice;
        double beltSum = numStudents * beltPrice;
        double moneyNeeded = 0;
        if (numStudents >= 6) {
            moneyNeeded = lightsaberSum + robeSum + (beltSum - freeBeltsSum);
        } else {
            moneyNeeded = lightsaberSum + robeSum + beltSum;
        }

        double diff = Math.abs(budget - moneyNeeded);
        if (budget < moneyNeeded) {
            System.out.printf("George Lucas will need %.2flv more.", diff);
        } else {
            System.out.printf("The money is enough - it would cost %.2flv.", moneyNeeded);
        }
    }
}