package dataTypes.exercise;

import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int i = 0; i < input; i++) {

            int newQuantity = Integer.parseInt(scanner.nextLine());
            sum += newQuantity;

            if (sum > 255) {

                System.out.println("Insufficient capacity!");
                sum -= newQuantity;

            }

        }

        System.out.println(sum);

    }
}

