package Lecture6_Lists_Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numCommands = Integer.parseInt(scanner.nextLine());

        List<String> guestsList = new ArrayList<>();

        for (int i = 1; i <= numCommands; i++) {
            String command = scanner.nextLine();
            String[] commandPart = command.split(" ");
            String name = commandPart[0];
            if (command.contains("not")) {
                if (guestsList.contains(name)) {
                    guestsList.remove(name);
                } else {
                    System.out.println(name + " is not in the list!");
                }
            } else {
                if (guestsList.contains(name)) {
                    System.out.println(name + " is already in the list!");
                } else {
                    guestsList.add(name);
                }
            }
        }
        for (String guestName : guestsList) {
            System.out.println(guestName);
        }
    }
}