package FinalExamPreparation;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class HeroesCodeLogic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> heroesHP = new LinkedHashMap<>();
        Map<String, Integer> heroesMP = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            String heroInfo = scanner.nextLine();
            String[] heroData = heroInfo.split("\\s+");
            String heroName = heroData[0];
            int hp = Integer.parseInt(heroData[1]);
            int mp = Integer.parseInt(heroData[2]);
            if (hp <= 100) {
                heroesHP.put(heroName, hp);
            }
            if (mp <= 200) {
                heroesMP.put(heroName, mp);
            }
        }
        String command = scanner.nextLine();
        while (!command.equals("End")) {
            String[] commandParts = command.split(" - ");
            String commandName = commandParts[0];
            String heroName = commandParts[1];
            switch (commandName) {
                case "CastSpell":
                    String spellName = commandParts[3];
                    int mpNeeded = Integer.parseInt(commandParts[2]);
                    int currentMP = heroesMP.get(heroName);
                    if (currentMP >= mpNeeded) {
                        int mpLeft = currentMP - mpNeeded;
                        heroesMP.put(heroName, mpLeft);
                        System.out.printf("%s has successfully cast %s and now has %d MP!%n", heroName, spellName, mpLeft);
                    } else {
                        System.out.printf("%s does not have enough MP to cast %s!%n", heroName, spellName);
                    }
                    break;
                case "TakeDamage":
                    int damage = Integer.parseInt(commandParts[2]);
                    String attackerName = commandParts[3];
                    int currentHP = heroesHP.get(heroName);
                    currentHP -= damage;
                    if (currentHP > 0) {
                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n", heroName, damage, attackerName, currentHP);
                        heroesHP.put(heroName, currentHP);
                    } else {
                        System.out.printf("%s has been killed by %s!%n", heroName, attackerName);
                        heroesHP.remove(heroName);
                        heroesMP.remove(heroName);
                    }
                    break;
                case "Recharge":
                    int rechargeAmount = Integer.parseInt(commandParts[2]);
                    int currentMPHero = heroesMP.get(heroName);
                    currentMPHero += rechargeAmount;
                    if (currentMPHero > 200) {
                        currentMPHero = 200;
                    }
                    System.out.printf("%s recharged for %d MP!%n", heroName, currentMPHero - heroesMP.get(heroName));
                    heroesMP.put(heroName, currentMPHero);
                    break;
                case "Heal":
                    int amountHeal = Integer.parseInt(commandParts[2]);
                    int currentHPHero = heroesHP.get(heroName);

                    currentHPHero += amountHeal;
                    if (currentHPHero > 100) {
                        currentHPHero = 100;
                    }
                    System.out.printf("%s healed for %d HP!%n", heroName, currentHPHero - heroesHP.get(heroName));
                    heroesHP.put(heroName, currentHPHero);
                    break;
            }
            command = scanner.nextLine();
        }
        for (Map.Entry<String, Integer> entry : heroesHP.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println("  HP: " + entry.getValue());
            System.out.println("  MP: " + heroesMP.get(entry.getKey()));
        }
    }
}