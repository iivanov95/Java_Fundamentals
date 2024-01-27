package Lecture7_ObjectAndClasses_Exercise.OrderByAge;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<PersonData> personDataList = new ArrayList<>();
        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String name = input.split(" ")[0];
            String id = input.split(" ")[1];
            int age = Integer.parseInt(input.split(" ")[2]);
            PersonData currentPerson = new PersonData(name, id, age);
            personDataList.add(currentPerson);
            input = scanner.nextLine();
        }
        Collections.sort(personDataList, Comparator.comparingInt(PersonData::getAge));
        for (PersonData person: personDataList) {
            System.out.println(person.toString());
        }
    }
}