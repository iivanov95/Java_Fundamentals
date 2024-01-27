package Lecture9_AssociativeArrays_Exercise;

import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        LinkedHashMap<String, List<String>> companyUsersMap = new LinkedHashMap<>();

        while (!input.equals("End")) {
            String companyName = input.split(" -> ")[0];
            String userID = input.split(" -> ")[1];

            if (!companyUsersMap.containsKey(companyName)) {
                companyUsersMap.put(companyName, new ArrayList<>());
            }

            if (!companyUsersMap.get(companyName).contains(userID)) {
                companyUsersMap.get(companyName).add(userID);
            }

            input = scanner.nextLine();
        }
        for (Map.Entry<String, List<String>> company : companyUsersMap.entrySet()) {
            System.out.println(company.getKey());
            for (String employee : company.getValue()) {
                System.out.println("-- " + employee);
            }
        }
    }
}