package Lecture4_Exercise;

import java.util.Scanner;

public class TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] itemsArr = scanner.nextLine().split("|");
        String command = scanner.nextLine();
        while (!command.equals("Yohoho!")) {


            command = scanner.nextLine();
        }
    }
}
