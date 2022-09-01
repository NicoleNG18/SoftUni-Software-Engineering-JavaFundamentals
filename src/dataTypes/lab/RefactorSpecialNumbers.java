package dataTypes.lab;

import java.util.Scanner;

public class RefactorSpecialNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        int helpNumber = 0;
        boolean isSpecialNumber = false;

        for (int i = 1; i <= num; i++) {

            helpNumber = i;

            while (i > 0) {

                sum += i % 10;
                i = i / 10;

            }

            isSpecialNumber = (sum == 5) || (sum == 7) || (sum == 11);

            if (isSpecialNumber) {
                System.out.printf("%d -> True%n", helpNumber);
            } else {
                System.out.printf("%d -> False%n", helpNumber);
            }

            sum = 0;
            i = helpNumber;

        }
    }
}

