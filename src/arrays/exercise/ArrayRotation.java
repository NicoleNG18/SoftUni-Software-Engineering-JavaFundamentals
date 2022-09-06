package arrays.exercise;

import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] arrayAsString = scanner.nextLine().split("\\s+");

        int rotations = Integer.parseInt(scanner.nextLine());

        for (int currentRotation = 0; currentRotation < rotations; currentRotation++) {

            String help = arrayAsString[0];

            for (int k = 0; k < arrayAsString.length - 1; k++) {
                arrayAsString[k] = arrayAsString[k + 1];
            }

            arrayAsString[arrayAsString.length - 1] = help;

        }

        for (int i = 0; i < arrayAsString.length; i++) {
            System.out.print(arrayAsString[i] + " ");
        }

    }
}

