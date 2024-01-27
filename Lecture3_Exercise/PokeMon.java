package Lecture3_Exercise;

import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pokePowerN = Integer.parseInt(scanner.nextLine());
        int distanceBetweenTargetsM = Integer.parseInt(scanner.nextLine());
        int exhaustionFactorY = Integer.parseInt(scanner.nextLine());
        int powerConstant = pokePowerN;
        int pokeCount = 0;
        while (pokePowerN >= distanceBetweenTargetsM) {
            pokePowerN -= distanceBetweenTargetsM;
            pokeCount++;
            if (pokePowerN == powerConstant / 2) {
                if (exhaustionFactorY != 0) {
                    pokePowerN = pokePowerN / exhaustionFactorY;
                }
            }
        }
        System.out.println(pokePowerN);
        System.out.println(pokeCount);
    }
}