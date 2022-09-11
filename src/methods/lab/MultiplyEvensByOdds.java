package methods.lab;

import java.util.Scanner;

public class MultiplyEvensByOdds {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        if (number > 0) {
            System.out.println(multipliedSum(number));

        } else if (number < 0) {
            System.out.println(multipliedSum(Math.abs(number)));
        }

    }

    private static int multipliedSum(int number) {
        return sumEven(number) * sumOdd(number);
    }

    private static int sumOdd(int number) {

        int sumOdd = 0;

        while (number > 0) {

            int digit = number % 10;

            if (digit % 2 != 0) {
                sumOdd += digit;
            }

            number /= 10;

        }

        return sumOdd;
    }

    private static int sumEven(int number) {

        int sumEven = 0;

        while (number > 0) {

            int digit = number % 10;

            if (digit % 2 == 0) {
                sumEven += digit;
            }

            number /= 10;

        }

        return sumEven;
    }

}

