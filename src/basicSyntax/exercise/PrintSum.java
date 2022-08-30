package basicSyntax.exercise;

import java.util.Scanner;

public class PrintSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNum = Integer.parseInt(scanner.nextLine());
        int endNum = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int i = startNum; i <= endNum; i++) {

            System.out.print(i + " ");
            sum += i;

        }

        System.out.printf("%nSum: %d", sum);
    }
}

