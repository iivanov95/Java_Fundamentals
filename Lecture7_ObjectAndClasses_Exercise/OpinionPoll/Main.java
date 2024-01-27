package Lecture7_ObjectAndClasses_Exercise.OpinionPoll;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    //Тук е решението на задачата, тук ще се използва класа Person
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<Person> peopleList = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            String data = scanner.nextLine();
            String name = data.split(" ")[0];
            int age = Integer.parseInt(data.split(" ")[1]);
            if (age > 30) {
                Person person = new Person(name, age);
                peopleList.add(person);
            }
        }
        for (Person person : peopleList) {
            System.out.println(person.getName() + " - " + person.getAge());
        }
    }
}