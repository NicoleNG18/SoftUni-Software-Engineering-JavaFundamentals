package dataTypes.exercise;

import java.util.Scanner;

public class SnowBalls {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        double highestSnowball = 0;
        int highestSnow = 0;
        int highestTime = 0;
        int highestQuality = 0;

        for (int i = 0; i < input; i++) {

            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());
            double snowballValue = Math.pow((snowballSnow * 1.0 / snowballTime), snowballQuality);

            if (snowballValue >= highestSnowball) {

                highestSnowball = snowballValue;

                highestSnow = snowballSnow;

                highestTime = snowballTime;

                highestQuality = snowballQuality;

            }
        }

        System.out.printf("%d : %d = %.0f (%d)", highestSnow, highestTime, highestSnowball, highestQuality);

    }
}


