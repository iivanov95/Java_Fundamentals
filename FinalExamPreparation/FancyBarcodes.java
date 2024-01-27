package FinalExamPreparation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        StringBuilder sb = new StringBuilder();


        for (int i = 1; i <= n; i++) {
            String password = scanner.nextLine();
            String regex = "@(#+)(?<passwordText>[A-Z][A-Za-z0-9]{4,}[A-Z])@(#+)";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(password);
            if (matcher.find()) {
                String pass = matcher.group("passwordText");
                for (char symbol : pass.toCharArray()) {
                    if (Character.isDigit(symbol)) {
                        sb.append(symbol);
                    }
                }
                if (sb.length() == 0) {
                    System.out.println("Product group: 00");
                } else {
                    System.out.println("Product group: " + sb);
                    sb.delete(0, sb.length());
                }
            } else {
                System.out.println("Invalid barcode");
            }
        }
    }
}