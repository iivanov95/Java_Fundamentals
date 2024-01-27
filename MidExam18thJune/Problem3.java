package MidExam18thJune;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> books = Arrays.stream(scanner.nextLine()
                .split("&")).collect(Collectors.toList());
        String input = scanner.nextLine();
        while (!input.equals("Done")) {
            String[] command = input.split(" \\| ");
            String currentCommand = command[0];
            switch (currentCommand) {
                case "Add Book":
                    if (!books.contains(command[1])) {
                        books.add(0, command[1]);
                    }
                    break;
                case "Take Book":
                    if (books.contains(command[1])) {
                        books.remove(books.indexOf(command[1]));
                    }
                    break;
                case "Swap Books":
                    String book1 = command[1];
                    String book2 = command[2];
                    int indexBook1 = books.indexOf(command[1]);
                    int indexBook2 = books.indexOf(command[2]);
                    if (books.contains(book1) && books.contains(book2)) {
                        books.set(indexBook1, book2);
                        books.set(indexBook2, book1);
                    }
                    break;
                case "Insert Book":
                    if (!books.contains(command[1])) {
                        books.add(command[1]);
                    }
                    break;
                case "Check Book":
                    int index = Integer.parseInt(command[1]);
                    if (index >= 0 && index < books.size()) {
                        System.out.println(books.get(index));
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        for (int i = 0; i < books.size(); i++) {
            if (i == books.size() - 1) {
                System.out.println(books.get(i));
            } else {
                System.out.print(books.get(i) + ", ");
            }
        }
    }
}