package finalExamPreparation;

import java.util.*;

public class Pirates {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, List<Integer>> cities = new LinkedHashMap<>();
        String input = scanner.nextLine();

        while (!input.equals("Sail")) {

            String[] inputArr = input.split("\\|\\|");

            int population = Integer.parseInt(inputArr[1]);
            int gold = Integer.parseInt(inputArr[2]);

            List<Integer> populationAndGold = new ArrayList<>();

            populationAndGold.add(population);
            populationAndGold.add(gold);

            if (cities.containsKey(inputArr[0])) {
                cities.get(inputArr[0]).set(0, cities.get(inputArr[0]).get(0) + population);
                cities.get(inputArr[0]).set(1, cities.get(inputArr[0]).get(1) + gold);

            } else {
                cities.put(inputArr[0], populationAndGold);
            }

            input = scanner.nextLine();
        }

        input = scanner.nextLine();

        while (!input.equals("End")) {

            String[] help = input.split("=>");

            if (help[0].equals("Plunder")) {

                int people = Integer.parseInt(help[2]);
                int gold = Integer.parseInt(help[3]);

                if (gold > 0) {

                    int newPeople = cities.get(help[1]).get(0) - people;
                    int newGold = cities.get(help[1]).get(1) - gold;

                    System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n", help[1], gold, people);

                    if (newPeople > 0 && newGold > 0) {

                        cities.get(help[1]).set(0, newPeople);
                        cities.get(help[1]).set(1, newGold);

                    } else {
                        System.out.printf("%s has been wiped off the map!%n", help[1]);
                        cities.remove(help[1]);
                    }

                } else {
                    System.out.println("Gold added cannot be a negative number!");
                }

            } else if (help[0].equals("Prosper")) {

                int gold = Integer.parseInt(help[2]);

                if (gold >= 0) {

                    int newGold = cities.get(help[1]).get(1) + gold;
                    cities.get(help[1]).set(1, newGold);
                    System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n", gold, help[1], newGold);

                } else {
                    System.out.println("Gold added cannot be a negative number!");
                }
            }

            input = scanner.nextLine();
        }

        if (cities.isEmpty()) {
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");

        } else {
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n", cities.size());

            for (Map.Entry<String, List<Integer>> entry : cities.entrySet()) {
                System.out.printf("%s -> Population: %d citizens, Gold: %d kg%n", entry.getKey(), entry.getValue().get(0), entry.getValue().get(1));
            }

        }

    }


}

