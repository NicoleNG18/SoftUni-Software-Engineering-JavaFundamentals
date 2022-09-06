package arrays.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] arrayAsInt = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int wantedNumber = Integer.parseInt(scanner.nextLine());

        for (int j = 0; j < arrayAsInt.length - 1; j++) {

            if (arrayAsInt[j] + arrayAsInt[j + 1] == wantedNumber) {
                System.out.println(arrayAsInt[j] + " " + arrayAsInt[j + 1]);
            }

        }

    }
}

