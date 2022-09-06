package arrays.exercise;

import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int countOfLines = Integer.parseInt(scanner.nextLine());

        int[] firstArray = new int[countOfLines];
        int[] secondArray = new int[countOfLines];

        for (int i = 0; i < countOfLines; i++) {

            String input = scanner.nextLine();
            String[] arr = input.split("\\s+");

            if (i % 2 == 0) {

                firstArray[i] = Integer.parseInt(arr[0]);
                secondArray[i] = Integer.parseInt(arr[1]);

            } else {

                firstArray[i] = Integer.parseInt(arr[1]);
                secondArray[i] = Integer.parseInt(arr[0]);

            }

        }

        for (int i = 0; i < countOfLines; i++) {
            System.out.print(firstArray[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < countOfLines; i++) {
            System.out.print(secondArray[i] + " ");
        }

    }
}

