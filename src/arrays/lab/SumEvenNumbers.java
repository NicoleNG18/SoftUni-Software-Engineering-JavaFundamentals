package arrays.lab;

import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] arrayAsInteger = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sum = 0;

        for (int j : arrayAsInteger) {

            if (j % 2 == 0) {
                sum += j;
            }

        }

        System.out.println(sum);

    }
}

