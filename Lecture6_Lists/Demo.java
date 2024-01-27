package Lecture6_Lists;

import java.util.*;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        List<Integer> numbersList = new ArrayList<>();
//        int n = Integer.parseInt(scanner.nextLine());
//        for (int i = 0; i < n; i++) {
//            int currentNum = Integer.parseInt(scanner.nextLine());
//            numbersList.add(currentNum);
//        }

        String input = scanner.nextLine();
        List<Integer> numbersList = Arrays
                .stream(input.split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<String> wordsList = new ArrayList<>(Arrays.asList("Ivan", "Georgi", "Maria"));
        wordsList.add(2, "Stanislav");
        wordsList.remove("Maria");

        List<Integer> numsList = new ArrayList<>(Arrays.asList(10, 20 , 30, 40, 50));
        numsList.remove(30); //Ще даде грешка ако така искаме да махнем 30
        numsList.remove(Integer.valueOf(30)); //това е за махане на 30-ката в случая

        wordsList.add("Petar");

        if (wordsList.contains("Maria")) {
            System.out.println("Maria");
        }

        wordsList.remove(2);
        wordsList.set(2, "Raya");
        int listLength = wordsList.size(); // = 3;

        for (int i = 0; i < wordsList.size(); i++) {
//            String word = wordsList.get(i);
//            System.out.println(word);
            System.out.println(i + " -> " + wordsList.get(i));
        }

    }
}