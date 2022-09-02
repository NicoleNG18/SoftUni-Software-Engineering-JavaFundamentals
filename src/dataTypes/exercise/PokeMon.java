package dataTypes.exercise;

import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int pokemonPower = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        int exhaustionFactor = Integer.parseInt(scanner.nextLine());

        int count = 0;
        double help = 0.5 * pokemonPower;

        while (pokemonPower >= distance) {

            pokemonPower -= distance;
            count++;

            if (pokemonPower == help) {

                if (exhaustionFactor != 0 && exhaustionFactor < pokemonPower) {

                    pokemonPower /= exhaustionFactor;

                }
            }
        }

        System.out.println(pokemonPower);
        System.out.println(count);

    }
}

