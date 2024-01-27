package Lecture11_RegularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchFullName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        // Ivan Ivanov, Ivan ivanov, ivan Ivanov, IVan Ivanov, Georgi Georgiev, Ivan Ivanov

        String regex = "\\b[A-Z][a-z]+ [A-Z][a-z]+\\b"; //текст на шаблона
        Pattern pattern = Pattern.compile(regex); //шаблон
        Matcher matcher = pattern.matcher(text); //съвкупността от текстове, които отговарят на шаблона
        //matcher = {"Ivan Ivanov", "Georgi Georgiev"}

        //matcher.find() -> true ако имаме намерени текстове, или false ако няма

        while (matcher.find()) {
            System.out.print(matcher.group() + " ");
            //отпечатва и премахва
        }
    }
}