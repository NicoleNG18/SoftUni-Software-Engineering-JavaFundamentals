package midExamPreparation;

import java.util.Scanner;

public class GuineaPig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double food = Double.parseDouble(scanner.nextLine());
        double hay = Double.parseDouble(scanner.nextLine());
        double cover = Double.parseDouble(scanner.nextLine());
        double weight = Double.parseDouble(scanner.nextLine());

        double gramsFood = food * 1000;
        double gramsHay = hay * 1000;
        double gramsCover = cover * 1000;
        double gramsWeight = weight * 1000;

        for (int i = 1; i <= 30; i++) {

            if (gramsFood >= 0 && gramsHay >= 0 && gramsCover >= 0) {
                gramsFood -= 300;

                if (i % 2 == 0) {
                    gramsHay -= 0.05 * gramsFood;
                }

                if (i % 3 == 0) {
                    double help = (1 * 1.0 / 3) * gramsWeight;
                    gramsCover -= help;
                }

            } else {
                System.out.println("Merry must go to the pet store!");
                return;
            }

        }

        if (gramsFood > 0 && gramsCover > 0 && gramsHay > 0) {
            System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.",
                    gramsFood / 1000, gramsHay / 1000, gramsCover / 1000);

        } else {
            System.out.println("Merry must go to the pet store!");
        }
    }


}

