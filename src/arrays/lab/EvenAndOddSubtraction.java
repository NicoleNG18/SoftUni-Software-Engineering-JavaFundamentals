package arrays.lab;

import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOddSubtraction {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int[] array = Arrays.stream(input.split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sumEven = 0;
        int sumOdd = 0;

        for (int number : array) {

            if (number % 2 == 0) {

                sumEven += number;

            } else sumOdd += number;

        }

        System.out.println(sumEven - sumOdd);

    }
}

