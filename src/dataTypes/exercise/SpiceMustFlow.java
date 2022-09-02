package dataTypes.exercise;

import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int yield = Integer.parseInt(scanner.nextLine());

        int countDays = 0;
        int leftAmount = 0;

        if (yield >= 100) {

            while (yield >= 100) {

                countDays++;
                leftAmount += (yield - 26);
                yield -= 10;

            }

            System.out.println(countDays);
            System.out.println(leftAmount - 26);

        } else {

            System.out.println(countDays);
            System.out.println(leftAmount);

        }

    }
}

