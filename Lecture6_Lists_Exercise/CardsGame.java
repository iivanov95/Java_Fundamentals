package Lecture6_Lists_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> firstDeck = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondDeck = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int initialDeckLength = firstDeck.size() - 1;

        while (firstDeck.size() != 0 || secondDeck.size() != 0) {
            int currentCardFirstDeck = firstDeck.get(0);
            int currentCardSecondDeck = secondDeck.get(0);
            if (currentCardFirstDeck > currentCardSecondDeck) {
                secondDeck.remove(secondDeck.indexOf(currentCardSecondDeck));
                firstDeck.remove(firstDeck.indexOf(currentCardFirstDeck));
                firstDeck.add(currentCardFirstDeck);
                firstDeck.add(currentCardSecondDeck);
            }
            if (currentCardSecondDeck > currentCardFirstDeck) {
                firstDeck.remove(firstDeck.indexOf(currentCardFirstDeck));
                secondDeck.remove(secondDeck.indexOf(currentCardSecondDeck));
                secondDeck.add(currentCardSecondDeck);
                secondDeck.add(currentCardFirstDeck);
            }
            if (currentCardSecondDeck == currentCardFirstDeck) {
                firstDeck.remove(0);
                secondDeck.remove(0);
            }
            if (firstDeck.size() == 0 || secondDeck.size() == 0) {
                break;
            }
        }
        System.out.println();
        int sum = 0;
        if (firstDeck.size() == 0) {
            for (int i = 0; i <= secondDeck.size() - 1; i++) {
                sum += secondDeck.get(i);
            }
            System.out.print("Second player wins! Sum: " + sum);
        } else {
            for (int i = 0; i <= firstDeck.size() - 1; i++) {
                sum += firstDeck.get(i);
            }
            System.out.print("First player wins! Sum: " + sum);
        }
    }
}