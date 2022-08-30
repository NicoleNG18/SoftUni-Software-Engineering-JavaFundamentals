package basicSyntax.exercise;

import java.util.Scanner;

public class StrongNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int help = num;
        int sumFac = 0;
        int fact = 1;
        while (num > 0) {

            int digit = num % 10;
            num = num / 10;

            for (int i = 1; i <= digit; i++) {
                fact *= i;
            }

            sumFac += fact;
            fact = 1;

        }

        if (help == sumFac) System.out.println("yes");

        else {
            System.out.println("no");
        }

    }
}

