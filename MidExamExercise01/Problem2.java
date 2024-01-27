package MidExamExercise01;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int peopleWaiting = Integer.parseInt(scanner.nextLine());
        List<Integer> liftCabins = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        for (int i = 0; i < liftCabins.size(); i++) {
            int currentPeopleInsideCabin = liftCabins.get(i);
            if (currentPeopleInsideCabin < 4) {
                if (peopleWaiting < 4) {
                    liftCabins.set(i, peopleWaiting);
                } else {
                    liftCabins.set(i, 4);
                }
                peopleWaiting -= liftCabins.get(i) - currentPeopleInsideCabin;
            }
        }
        if (peopleWaiting > 0) {
            System.out.printf("There isn't enough space! %d people in a queue!%n", peopleWaiting);
            for (int i = 0; i < liftCabins.size(); i++) {
                if (i == liftCabins.size() - 1) {
                    System.out.print(liftCabins.get(i));
                } else {
                    System.out.print(liftCabins.get(i) + " ");
                }
            }
        }
        boolean isFull = false;
        for (int i = 0; i < liftCabins.size(); i++) {
            if (liftCabins.get(i) == 4) {
                isFull = true;
            } else {
                isFull = false;
            }
        }

        if (isFull && peopleWaiting == 0) {
            for (int i = 0; i < liftCabins.size(); i++) {
                if (i == liftCabins.size() - 1) {
                    System.out.print(liftCabins.get(i));
                } else {
                    System.out.print(liftCabins.get(i) + " ");
                }
            }
        }

        if (!isFull && peopleWaiting == 0) {
            System.out.println("The lift has empty spots!");
            for (int i = 0; i < liftCabins.size(); i++) {
                if (i == liftCabins.size() - 1) {
                    System.out.print(liftCabins.get(i));
                } else {
                    System.out.print(liftCabins.get(i) + " ");
                }
            }
        }
    }
}