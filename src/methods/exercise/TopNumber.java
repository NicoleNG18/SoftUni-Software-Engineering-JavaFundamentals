package methods.exercise;

import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 8; i <= n; i++) {
            printTopNumber(i);
        }

    }

    private static void printTopNumber(int i) {

        int help = i;
        int sumDigits = 0;
        boolean check = false;

        while (i > 0) {

            sumDigits += i % 10;
            i = i / 10;

            if ((i % 10) % 2 != 0) {
                check = true;
            }

        }

        if (sumDigits % 8 == 0 && check) {
            System.out.println(help);
        }

    }


}

