package Lecture6_Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //3 5 2 43 12 3 54 10 23
        //76 5 34 2 4 12

        List<Integer> firstList = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondList = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> resultList = new ArrayList<>();

        int minSize = Math.min(firstList.size(), secondList. size());

        for (int i = 0; i < minSize; i++) {
            int numFirstList = firstList.get(i);
            int numSecondList = secondList.get(i);

            resultList.add(numFirstList);
            resultList.add(numSecondList);

        }

        // List<Integer> sublist = firstList.subList();

        if (firstList.size() > secondList.size()) {
            List<Integer> sublist = firstList.subList(minSize, firstList.size());
            resultList.addAll(sublist);
        } else if (secondList.size() > firstList.size()) {
            List<Integer> sublist = secondList.subList(minSize, secondList.size());
            resultList.addAll(sublist);
        }

        System.out.println(resultList.toString().replaceAll("[\\[\\],]", ""));
    }
}
