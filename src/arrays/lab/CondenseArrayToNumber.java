package arrays.lab;

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] inputArray = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        if (inputArray.length == 1) {
            System.out.print(inputArray[0]);

        } else {

            while (inputArray.length > 1) {

                int[] condensedArray = new int[inputArray.length - 1];

                for (int j = 0; j < inputArray.length - 1; j++) {

                    condensedArray[j] = inputArray[j] + inputArray[j + 1];

                }

                inputArray = condensedArray;

            }

            System.out.println(inputArray[0]);

        }
    }
}







