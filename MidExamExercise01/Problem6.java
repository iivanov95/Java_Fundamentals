package MidExamExercise01;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.DoubleFunction;
import java.util.stream.Collectors;

public class Problem6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int health = 100;
        int bitcoin = 0;
        List<String> rooms = Arrays.stream(scanner.nextLine()
                     .split("\\|")).collect(Collectors.toList());
        boolean isAlive = false;
        for (int i = 0; i < rooms.size(); i++) {
            String currentRoom = rooms.get(i);

            String[] commandParts = currentRoom.split(" ");
            String room = commandParts[0];
            switch (room) {
                case "potion":
                    int diff = 0;
                    int hp = Integer.parseInt(commandParts[1]);
                    if (health < 100) {
                        if (health + hp > 100) {
                            diff = hp - (health + hp - 100);
                            health += diff;
                            System.out.printf("You healed for %d hp.%n", diff);
                        } else {
                            health += hp;
                            System.out.printf("You healed for %d hp.%n", hp);
                        }
                        System.out.printf("Current health: %d hp.%n", health);
                    }
                    break;
                case "chest":
                    int currentBitcoins = Integer.parseInt(commandParts[1]);
                    bitcoin += currentBitcoins;
                    System.out.printf("You found %d bitcoins.%n", currentBitcoins);
                    break;
                default:
                    int attackPower = Integer.parseInt(commandParts[1]);
                    health -= attackPower;
                    if (health > 0){
                        System.out.printf("You slayed %s.%n", room);
                    } else {
                        System.out.printf("You died! Killed by %s.%n", room);
                        System.out.printf("Best room: %d", i + 1);
                        return;
                    }
                    break;
            }
        }
        if (health > 0) {
            isAlive = true;
        }
        if (isAlive) {
            System.out.println("You've made it!");
            System.out.printf("Bitcoins: %d%n", bitcoin);
            System.out.printf("Health: %d%n", health);
        }
    }
}