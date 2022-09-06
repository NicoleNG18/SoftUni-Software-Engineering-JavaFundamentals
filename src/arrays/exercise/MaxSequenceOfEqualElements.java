package arrays.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] arrayAsInt = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int currentCount = 1;
        int max = 1;
        int numberOfSequence = 0;

        for (int j = 0; j < arrayAsInt.length - 1; j++) {

            if (arrayAsInt[j] == arrayAsInt[j + 1]) {
                currentCount++;

                if (currentCount > max) {
                    max = currentCount;
                    numberOfSequence = arrayAsInt[j];
                }

            } else {
                currentCount = 1;
            }

        }

        for (int i = 0; i < max; i++) {
            System.out.print(numberOfSequence + " ");
        }

    }
}

