package midExamPreparation;

import java.util.Scanner;

public class MuOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int health = 100;
        int bitcoins = 0;
        String[] rooms = scanner.nextLine().split("\\|");

        for (int i = 0; i < rooms.length; i++) {

            String[] helpArr = rooms[i].split("\\s+");

            if (helpArr[0].equals("potion")) {

                int potion = Integer.parseInt(helpArr[1]);

                if (health + potion <= 100) {
                    health += potion;

                } else {
                    potion = 100 - health;
                    health = 100;
                }

                System.out.printf("You healed for %d hp.%n", potion);
                System.out.printf("Current health: %d hp.%n", health);

            } else if (helpArr[0].equals("chest")) {
                bitcoins += Integer.parseInt(helpArr[1]);
                System.out.printf("You found %d bitcoins.%n", Integer.parseInt(helpArr[1]));

            } else {
                int attack = Integer.parseInt(helpArr[1]);

                if (health - attack <= 0) {
                    System.out.printf("You died! Killed by %s.%n", helpArr[0]);
                    System.out.printf("Best room: %d%n", i + 1);
                    return;

                } else {
                    System.out.printf("You slayed %s.%n", helpArr[0]);
                    health -= attack;
                }

            }

        }

        if (health > 0) {
            System.out.println("You've made it!");
            System.out.printf("Bitcoins: %d%n", bitcoins);
            System.out.printf("Health: %d%n", health);
        }

    }


}

