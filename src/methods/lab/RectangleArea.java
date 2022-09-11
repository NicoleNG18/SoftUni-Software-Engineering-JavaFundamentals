package methods.lab;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double length = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());

        System.out.printf("%.0f", findArea(length, width));
    }

    private static double findArea(double length, double width) {
        return length * width;
    }

}

