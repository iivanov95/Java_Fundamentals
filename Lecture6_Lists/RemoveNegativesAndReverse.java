package Lecture6_Lists;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        //премахване на елемент от листа ако елемента е отрицателен
        numbersList.removeIf(e -> e < 0);

        Collections.reverse(numbersList);

        if (numbersList.isEmpty()) {
            System.out.println("empty");
        } else {
            System.out.println(numbersList.toString().replaceAll("[\\[\\],]", ""));
        }
    }
}