package finalExam;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class WildZoo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Animals> animals = new LinkedHashMap<>();
        Map<String, Integer> areas = new LinkedHashMap<>();

        while (!input.equals("EndDay")) {

            String[] help = input.split("((: )|[-])");
            String name = help[1];

            if (help[0].equals("Add")) {

                int neededFood = Integer.parseInt(help[2]);
                String area = help[3];

                if (animals.containsKey(name)) {
                    animals.get(name).setFoodLimit(animals.get(name).getFoodLimit() + neededFood);

                } else {
                    animals.put(name, new Animals(name, neededFood, area));

                    if (!areas.containsKey(area)) {
                        areas.put(area, 1);

                    } else {
                        areas.put(area, areas.get(area) + 1);
                    }

                }

            } else if (help[0].equals("Feed")) {

                int food = Integer.parseInt(help[2]);

                if (animals.containsKey(name)) {
                    animals.get(name).setFoodLimit(animals.get(name).getFoodLimit() - food);

                    if (animals.get(name).getFoodLimit() <= 0) {

                        System.out.printf("%s was successfully fed%n", animals.get(name).getName());

                        String currentArea = animals.get(name).getArea();
                        areas.put(currentArea, areas.get(currentArea) - 1);

                        if (areas.get(currentArea) == 0) {
                            areas.remove(currentArea);
                        }

                        animals.remove(name);
                    }

                }

            }

            input = scanner.nextLine();
        }

        System.out.println("Animals:");
        for (Map.Entry<String, Animals> entry : animals.entrySet()) {
            System.out.printf(" %s -> %dg%n", entry.getKey(), entry.getValue().getFoodLimit());
        }

        System.out.println("Areas with hungry animals:");
        for (Map.Entry<String, Integer> entry : areas.entrySet()) {
            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue());
        }

    }

    static class Animals {
        private String name;
        private int foodLimit;
        private String area;

        public Animals(String name, int foodLimit, String area) {
            this.name = name;
            this.foodLimit = foodLimit;
            this.area = area;
        }

        public String getName() {
            return name;
        }

        public int getFoodLimit() {
            return foodLimit;
        }

        public void setFoodLimit(int foodLimit) {
            this.foodLimit = foodLimit;
        }

        public String getArea() {
            return area;
        }

    }


}

