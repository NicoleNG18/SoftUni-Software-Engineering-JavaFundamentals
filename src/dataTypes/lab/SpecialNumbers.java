package dataTypes.lab;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= number; i++) {

            int sum = 0;
            int num = i;

            while (num != 0) {

                int digit = num % 10;

                num /= 10;
                sum += digit;

            }

            if (sum == 5 || sum == 7 || sum == 11) {
                System.out.printf("%d -> True%n", i);
            } else {
                System.out.printf("%d -> False%n", i);
            }

        }
    }
}

