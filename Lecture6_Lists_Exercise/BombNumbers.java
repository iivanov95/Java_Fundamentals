package Lecture6_Lists_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> twoNumbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int specialNumber = twoNumbers.get(0);
        int power = twoNumbers.get(1);
        // 1 2 2 4 2 2 2 9 --- 4 2
        // 1 7 7 1 2 3
        // 7 1
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == specialNumber) {
                int fromIndex = i - power;
                int toIndex = i + power + 1;
                if (toIndex <= numbers.size() - 1 && fromIndex >= 0) {
                    numbers.subList(fromIndex, toIndex).clear();
                } else if (toIndex > numbers.size() - 1 && fromIndex < 0) {
                    numbers.subList(0, numbers.size()).clear();
                } else if (fromIndex < 0 && toIndex <= numbers.size() - 1) {
                    numbers.subList(0, toIndex).clear();
                } else if (fromIndex >= 0 && toIndex > numbers.size() - 1) {
                    numbers.subList(fromIndex, numbers.size()).clear();
                }
            }
        }
        int sum = 0;
        for (int i = 0; i <= numbers.size() - 1; i++) {
            sum += numbers.get(i);
        }
        System.out.println(sum);
    }
}