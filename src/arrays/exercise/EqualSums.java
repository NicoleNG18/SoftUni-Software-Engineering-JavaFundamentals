package arrays.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] arrayAsInt = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        boolean check = false;

        for (int j = 0; j < arrayAsInt.length; j++) {

            int leftSum = 0;
            int rightSum = 0;

            for (int left = j; left >= 0; left--) {
                leftSum += arrayAsInt[left];
            }

            for (int right = j; right < arrayAsInt.length; right++) {
                rightSum += arrayAsInt[right];
            }

            if (leftSum == rightSum) {
                System.out.println(j);
                check = true;
                break;
            }

        }

        if (!check) {
            System.out.println("no");
        }

    }
}

