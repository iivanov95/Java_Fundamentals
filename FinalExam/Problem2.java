package FinalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String regex = "([#|$|%|*|&])(?<name>[A-Za-z]+)\\1=(?<length>[0-9]+)!!(?<geohashcode>[\\S]+)";

        while (!input.equals(" ")) {
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                int length = Integer.parseInt(matcher.group("length"));
                String name = matcher.group("name");
                String geohashcode = matcher.group("geohashcode");
                if (length == geohashcode.length()) {
                    for (char symbol : geohashcode.toCharArray()) {
                        char newSymbol = (char) (symbol + length);
                        geohashcode = geohashcode.replace(symbol, newSymbol);
                    }
                    System.out.printf("Coordinates found! %s -> %s", name, geohashcode);
                    break;
                } else {
                    System.out.println("Nothing found!");
                }
            } else {
                System.out.println("Nothing found!");
            }
            input = scanner.nextLine();
        }
    }
}