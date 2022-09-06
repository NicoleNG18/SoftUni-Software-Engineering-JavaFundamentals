package arrays.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] arrayAsInt = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int j = 0; j < arrayAsInt.length; j++) {

            boolean isItBigger = true;

            for (int k = j + 1; k < arrayAsInt.length; k++) {

                if (arrayAsInt[j] <= arrayAsInt[k]) {
                    isItBigger = false;
                }

            }

            if (isItBigger) {
                System.out.print(arrayAsInt[j] + " ");
            }

        }
    }
}

