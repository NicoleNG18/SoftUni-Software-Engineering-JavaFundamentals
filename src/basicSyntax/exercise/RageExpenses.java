package basicSyntax.exercise;

import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGamesCount = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int countHeadset = 0;
        int countMouse = 0;
        int countKeyboard = 0;
        int countDisplay = 0;

        for (int i = 1; i <= lostGamesCount; i++) {

            if (i % 2 == 0) {
                countHeadset++;
            }

            if (i % 3 == 0) {
                countMouse++;
            }

            if (i % 2 == 0 && i % 3 == 0) {
                countKeyboard++;

                if (countKeyboard % 2 == 0 && countKeyboard != 0) {
                    countDisplay++;
                }

            }

        }

        double expenses = (countHeadset * headsetPrice) +
                (countMouse * mousePrice) +
                (countKeyboard * keyboardPrice) +
                (countDisplay * displayPrice);

        System.out.printf("Rage expenses: %.2f lv.", expenses);

    }
}

