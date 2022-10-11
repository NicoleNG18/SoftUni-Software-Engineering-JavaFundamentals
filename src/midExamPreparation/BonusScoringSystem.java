package midExamPreparation;

import java.util.Scanner;

public class BonusScoringSystem {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int students = Integer.parseInt(scanner.nextLine());
        int lectures = Integer.parseInt(scanner.nextLine());
        int bonus = Integer.parseInt(scanner.nextLine());

        int maxAtt = 0;
        double maxBonus = 0;

        for (int i = 0; i < students; i++) {

            int attendance = Integer.parseInt(scanner.nextLine());
            double currentBonus = (attendance * 1.0 / lectures) * (5 + bonus);

            if (currentBonus > maxBonus) {
                maxBonus = currentBonus;
                maxAtt = attendance;
            }

        }

        System.out.println("Max Bonus: " + (int) Math.ceil(maxBonus) + ".");
        System.out.printf("The student has attended %d lectures.", maxAtt);
    }

}
