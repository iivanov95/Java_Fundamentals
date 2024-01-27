package Lecture11_RegularExpressionsExercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            String password = scanner.nextLine();
            String regex = "_\\.+(?<passwordText>[A-Z][A-Za-z0-9]{4,}[A-Z])_\\.+";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(password);
            if (matcher.find()) {
                StringBuilder sbCategory = new StringBuilder();
                String textPass = matcher.group("passwordText");
                for (char symbol : textPass.toCharArray()) {
                    if (Character.isDigit(symbol)) {
                        sbCategory.append(symbol);
                    }
                }
                if (sbCategory.length() == 0) {
                    System.out.println("Group: default");
                } else {
                    System.out.println("Group: " + sbCategory);
                }
            } else {
                System.out.println("Invalid pass!");
            }
        }
    }
}