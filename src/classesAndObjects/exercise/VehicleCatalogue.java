package classesAndObjects.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VehicleCatalogue {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        List<Vehicles> veh = new ArrayList<>();

        while (!command.equals("End")) {

            String[] commandArr = command.split("\\s+");

            Vehicles current = new Vehicles(commandArr[0], commandArr[1], commandArr[2], Integer.parseInt(commandArr[3]));
            veh.add(current);

            command = scanner.nextLine();
        }

        String input = scanner.nextLine();
        double carPower = 0;
        double truckPower = 0;
        int carCount = 0;
        int truckCount = 0;

        for (Vehicles v : veh) {

            if (v.getType().equals("car")) {
                carPower += v.getHorsePower();
                carCount++;

            } else {
                truckPower += v.getHorsePower();
                truckCount++;
            }
        }

        while (!input.equals("Close the Catalogue")) {

            for (Vehicles vehicles : veh) {

                if (vehicles.getModel().equals(input)) {
                    System.out.println(vehicles.toString());
                }
            }

            input = scanner.nextLine();

        }

        double average1 = 0;
        double average2 = 0;

        if (carCount != 0) {
            average1 = carPower / carCount;
        }

        if (truckCount != 0) {
            average2 = truckPower / truckCount;
        }

        System.out.printf("Cars have average horsepower of: %.2f.%n", average1);
        System.out.printf("Trucks have average horsepower of: %.2f.%n", average2);

    }

    static class Vehicles {
        private String type;
        private String model;
        private String color;
        private int horsePower;

        public Vehicles(String type, String model, String color, int horsePower) {
            this.type = type;
            this.model = model;
            this.color = color;
            this.horsePower = horsePower;
        }

        public String getType() {
            return this.type;
        }

        public String getModel() {
            return this.model;
        }

        public String getColor() {
            return this.color;
        }

        public int getHorsePower() {
            return this.horsePower;
        }

        @Override
        public String toString() {
            return "Type: " + getType().toUpperCase().charAt(0) + getType().substring(1) + '\n' +
                    "Model: " + this.getModel() + '\n' +
                    "Color: " + this.getColor() + '\n' +
                    "Horsepower: " + this.getHorsePower();
        }

    }
}

