package dataTypes.exercise;

import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int countBeerKegs = Integer.parseInt(scanner.nextLine());
        double biggestModel = 0;
        String nameBiggestModel = "";

        for (int i = 0; i < countBeerKegs; i++) {

            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double currentSize = Math.PI * radius * radius * height;

            if (currentSize >= biggestModel) {

                biggestModel = currentSize;
                nameBiggestModel = model;

            }
        }

        System.out.println(nameBiggestModel);

    }

}
