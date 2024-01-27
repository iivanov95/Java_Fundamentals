package MidExamPreparationPart2;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SecondEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] targets = Arrays.stream(scanner.nextLine()
                      .split(" "))
                     .mapToInt(Integer::parseInt).toArray();

        String input = scanner.nextLine();
        int countShotTargets = 0;
        while (!input.equals("End")) {
            int shotIndex = Integer.parseInt(input);
            if (shotIndex >= 0 && shotIndex <= targets.length - 1) {
                int shotTarget = targets[shotIndex];

                for (int i = 0; i <= targets.length - 1; i++) {
                    int currentTarget = targets[i];
                    if (i != shotIndex && targets[i] != -1) {
                        if (currentTarget > shotTarget) {
                            currentTarget -= shotTarget;
                        } else {
                            currentTarget += shotTarget;
                        }
                    }
                    targets[i] = currentTarget;
                }
                targets[shotIndex] = -1;
                countShotTargets++;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Shot targets: " + countShotTargets + " -> ");
        for (int target : targets) {
            System.out.print(target + " ");
        }
    }
}