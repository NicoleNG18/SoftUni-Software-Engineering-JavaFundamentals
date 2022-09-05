package arrays.lab;

import java.util.Scanner;

public class PrintNumbersInReverseOrder {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int countOfNumbers = Integer.parseInt(scanner.nextLine());

        int[] array = new int[countOfNumbers];

        for (int i = 0; i < countOfNumbers; i++) {
            array[i] = Integer.parseInt(scanner.nextLine());
        }

        for (int i = countOfNumbers - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }

        System.out.println();

    }
}
