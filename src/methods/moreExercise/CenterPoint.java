package methods.moreExercise;

import java.util.Scanner;

public class CenterPoint {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double x1 = Double.parseDouble(scanner.nextLine());
        double y1 = Double.parseDouble(scanner.nextLine());
        double x2 = Double.parseDouble(scanner.nextLine());
        double y2 = Double.parseDouble(scanner.nextLine());

        printClosestPoint(x1, y1, x2, y2);
    }

    private static void printClosestPoint(double x1, double y1, double x2, double y2) {

        if (pointDistance(x1, y1) < pointDistance(x2, y2)) {
            System.out.printf("(%.0f, %.0f)", x1, y1);

        } else if (pointDistance(x1, y1) == pointDistance(x2, y2)) {
            System.out.printf("(%.0f, %.0f)", x1, y1);

        } else {
            System.out.printf("(%.0f, %.0f)", x2, y2);
        }

    }

    private static double pointDistance(double x, double y) {
        return Math.sqrt(Math.pow((x - 0), 2) + Math.pow((y - 0), 2));
    }


}

