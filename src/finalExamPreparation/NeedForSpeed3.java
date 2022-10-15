package finalExamPreparation;

import java.util.*;

public class NeedForSpeed3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numOfCars = Integer.parseInt(scanner.nextLine());
        Map<String, Car> cars = new LinkedHashMap<>();

        for (int i = 0; i < numOfCars; i++) {

            String[] array = scanner.nextLine().split("\\|");
            cars.put(array[0], new Car(array[0], Integer.parseInt(array[1]), Integer.parseInt(array[2])));
        }

        String command = scanner.nextLine();

        while (!command.equals("Stop")) {

            String[] commandArr = command.split(" : ");
            String currentCar = commandArr[1];

            switch (commandArr[0]) {

                case "Drive":
                    Drive(cars, commandArr, currentCar);
                    break;

                case "Refuel":
                    RefuelCar(cars, commandArr, currentCar);
                    break;

                case "Revert":
                    Revert(cars, commandArr, currentCar);
                    break;

            }

            command = scanner.nextLine();
        }

        for (Map.Entry<String, Car> entry : cars.entrySet()) {
            System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n", entry.getKey(), entry.getValue().getMileage(), entry.getValue().getFuel());
        }

    }

    private static void Revert(Map<String, Car> cars, String[] commandArr, String currentCar) {

        int kilometers = Integer.parseInt(commandArr[2]);
        cars.get(currentCar).setMileage(cars.get(currentCar).getMileage() - kilometers);

        if (cars.get(currentCar).getMileage() < 10000) {
            cars.get(currentCar).setMileage(10000);

        } else {
            System.out.printf("%s mileage decreased by %d kilometers%n", cars.get(currentCar).getCar(), kilometers);
        }

    }

    private static void RefuelCar(Map<String, Car> cars, String[] commandArr, String currentCar) {

        int rFuel = Integer.parseInt(commandArr[2]);
        int additional = rFuel + cars.get(currentCar).getFuel();

        if (additional > 75) {
            additional = 75 - cars.get(currentCar).getFuel();

        } else {
            additional = rFuel;
        }

        cars.get(currentCar).setFuel(cars.get(currentCar).getFuel() + additional);
        System.out.printf("%s refueled with %d liters%n", cars.get(currentCar).getCar(), additional);

    }

    private static void Drive(Map<String, Car> cars, String[] commandArr, String currentCar) {

        int distance = Integer.parseInt(commandArr[2]);
        int dFuel = Integer.parseInt(commandArr[3]);

        if (dFuel > cars.get(currentCar).getFuel()) {
            System.out.println("Not enough fuel to make that ride");

        } else {
            cars.get(currentCar).setMileage(cars.get(currentCar).getMileage() + distance);
            cars.get(currentCar).setFuel(cars.get(currentCar).getFuel() - dFuel);

            System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n",
                    cars.get(currentCar).getCar(), distance, dFuel);

            if (cars.get(currentCar).getMileage() >= 100000) {
                System.out.printf("Time to sell the %s!%n", cars.get(currentCar).getCar());
                cars.remove(currentCar);
            }

        }

    }

    static class Car {
        private String car;
        private int mileage;
        private int fuel;

        public Car(String car, int mileage, int fuel) {
            this.car = car;
            this.mileage = mileage;
            this.fuel = fuel;
        }

        public String getCar() {
            return car;
        }

        public int getMileage() {
            return mileage;
        }

        public void setMileage(int mileage) {
            this.mileage = mileage;
        }

        public int getFuel() {
            return fuel;
        }

        public void setFuel(int fuel) {
            this.fuel = fuel;
        }
    }
}
