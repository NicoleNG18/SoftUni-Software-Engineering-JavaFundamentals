package finalExamPreparation;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class PlantDiscovery {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        Map<String, Plant> plants = new LinkedHashMap<>();

        for (int i = 0; i < count; i++) {
            String[] command = scanner.nextLine().split("<->");

            plants.putIfAbsent(command[0], new Plant(command[0], Integer.parseInt(command[1]), 0, 0));
            plants.get(command[0]).setRarity(Integer.parseInt(command[1]));
        }

        String input = scanner.nextLine();

        while (!input.equals("Exhibition")) {

            String[] help = input.split("(: )|( - )");
            String plantName = help[1];

            if (plants.containsKey(plantName)) {

                if (help[0].equals("Rate")) {

                    double currentRating = Double.parseDouble(help[2]);

                    plants.get(plantName).setRating(plants.get(plantName).getRating() + currentRating);
                    plants.get(plantName).setCount(plants.get(plantName).getCount() + 1);

                } else if (help[0].equals("Update")) {

                    plants.get(plantName).setRarity(Integer.parseInt(help[2]));

                } else if (help[0].equals("Reset")) {

                    plants.get(plantName).setRating(0);
                    plants.get(plantName).setCount(0);

                }

            } else {
                System.out.println("error");
            }

            input = scanner.nextLine();
        }

        System.out.println("Plants for the exhibition:");

        for (Map.Entry<String, Plant> entry : plants.entrySet()) {
            double average = 0;

            if (entry.getValue().getRating() != 0 && entry.getValue().getCount() != 0) {
                average = entry.getValue().getRating() / entry.getValue().getCount();
            }

            System.out.printf("- %s; Rarity: %d; Rating: %.2f%n", entry.getKey(), entry.getValue().getRarity(), average);
        }

    }


    static class Plant {
        private String name;
        private int rarity;
        private double rating;
        private double count;

        public Plant(String name, int rarity, double rating, double count) {
            this.name = name;
            this.rarity = rarity;
            this.rating = rating;
            this.count = count;
        }

        public double getCount() {
            return count;
        }

        public void setCount(double count) {
            this.count = count;
        }

        public int getRarity() {
            return rarity;
        }

        public void setRarity(int rarity) {
            this.rarity = rarity;
        }

        public double getRating() {
            return rating;
        }

        public void setRating(double rating) {
            this.rating = rating;
        }
    }
}

