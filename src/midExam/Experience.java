package midExam;

import java.util.Scanner;

public class Experience {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double wantedExp = Double.parseDouble(scanner.nextLine());
        int battles = Integer.parseInt(scanner.nextLine());
        double experience = 0;

        for (int i = 1; i <= battles; i++) {

            double current = Double.parseDouble(scanner.nextLine());
            experience += current;

            if (i % 3 == 0) {
                experience += 0.15 * current;
            }

            if (i % 5 == 0) {
                experience -= 0.1 * current;
            }

            if (i % 15 == 0) {
                experience += 0.05 * current;
            }

            if (experience >= wantedExp) {
                System.out.printf("Player successfully collected his needed experience for %d battles.", i);
                return;
            }

        }

        System.out.printf("Player was not able to collect the needed experience, %.2f more needed.", wantedExp - experience);
    }


}

