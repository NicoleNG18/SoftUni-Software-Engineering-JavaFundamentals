package methods.moreExercise;

import java.util.Scanner;

public class LongerLine {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double x1 = Double.parseDouble(scanner.nextLine());
        double y1 = Double.parseDouble(scanner.nextLine());
        double x2 = Double.parseDouble(scanner.nextLine());
        double y2 = Double.parseDouble(scanner.nextLine());
        double x3 = Double.parseDouble(scanner.nextLine());
        double y3 = Double.parseDouble(scanner.nextLine());
        double x4 = Double.parseDouble(scanner.nextLine());
        double y4 = Double.parseDouble(scanner.nextLine());

        printLine(x1, y1, x2, y2, x3, y3, x4, y4);
    }

    private static void printLine(double x1, double y1, double x2, double y2, double x3, double y3,
                                  double x4, double y4) {

        if (pointDistance(x1, y1, x2, y2) >= pointDistance(x3, y3, x4, y4))
        {
            if (pointDistanceToCenter(x1, y1) > pointDistanceToCenter(x2, y2)) {
                System.out.printf("(%.0f, %.0f)(%.0f, %.0f)", x2, y2, x1, y1);

            } else {
                System.out.printf("(%.0f, %.0f)(%.0f, %.0f)", x1, y1, x2, y2);
            }

        } else {

            if (pointDistanceToCenter(x3, y3) > pointDistanceToCenter(x4, y4)) {
                System.out.printf("(%.0f, %.0f)(%.0f, %.0f)", x4, y4, x3, y3);

            } else {
                System.out.printf("(%.0f, %.0f)(%.0f, %.0f)", x3, y3, x4, y4);
            }
        }

    }

    private static double pointDistanceToCenter(double x, double y) {
        return Math.sqrt(Math.pow((x - 0), 2) + Math.pow((y - 0), 2));

    }

    private static double pointDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
    }


}

