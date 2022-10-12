package midExamPreparation;



import java.util.Scanner;

public class BlackFlag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int dailyPlunder = Integer.parseInt(scanner.nextLine());

        double expectedPl = Double.parseDouble(scanner.nextLine());
        double collectedPl = 0;

        for (int i = 1; i <= days; i++) {
            collectedPl += dailyPlunder;

            if (i % 3 == 0) {
                collectedPl += dailyPlunder / 2.0;
            }

            if (i % 5 == 0) {
                collectedPl -= 0.3 * collectedPl;
            }
        }

        if (collectedPl >= expectedPl) {
            System.out.printf("Ahoy! %.2f plunder gained.", collectedPl);

        } else {
            double percent = collectedPl / expectedPl;
            System.out.printf("Collected only %.2f%% of the plunder.", percent * 100);
        }

    }


}

