package dataTypes.exercise;

import java.util.Scanner;

public class SumOfChars {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int countOfChars = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int i = 0; i < countOfChars; i++) {

            char ch = scanner.next().charAt(0);

            sum += ch;

        }

        System.out.printf("The sum equals: %d", sum);

    }
}

