package arrays.lab;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] firstArray = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] secondArray = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        boolean check = false;
        int sum = 0;

        for (int i = 0; i < firstArray.length; i++) {

            if (firstArray[i] == secondArray[i]) {
                sum += firstArray[i];

            } else {

                System.out.printf("Arrays are not identical. Found difference at %d index.", i);

                check = true;
                break;

            }

        }

        if (!check) {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }
    }
}

