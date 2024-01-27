package Lecture9_AssociativeArrays_Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        LinkedHashMap<Character, Integer> symbolsCountMap = new LinkedHashMap<>();

        for (char symbol: input.toCharArray()) {
            if (symbol == ' ') {
                continue;
            }
            if (symbolsCountMap.containsKey(symbol)) {
                int currentCount = symbolsCountMap.get(symbol);
                symbolsCountMap.put(symbol, currentCount + 1);
            } else {
                symbolsCountMap.put(symbol, 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : symbolsCountMap.entrySet()) {
            System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());
        }

        //ВАРИАНТ 2 ЗА ПЕЧАТАНЕ
        //symbolsCountMap.forEach((key, value) -> System.out.println(key + " -> " + value));
    }
}