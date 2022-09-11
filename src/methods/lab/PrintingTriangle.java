package methods.lab;

import java.util.Scanner;

public class PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        printTriangle(Integer.parseInt(scanner.nextLine()));

    }

    public static void printTriangle(int number) {
        printIncreasing(number);
        printDecreasing(number);
    }

    public static void printIncreasing(int num) {

        for (int i = 1; i <= num; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();

        }

    }

    public static void printDecreasing(int number) {

        for (int i = number - 1; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();

        }

    }

}

