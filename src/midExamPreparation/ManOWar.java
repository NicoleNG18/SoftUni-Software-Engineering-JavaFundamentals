package midExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ManOWar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> pirateShip = Arrays.stream(scanner.nextLine().split(">"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> warShip = Arrays.stream(scanner.nextLine().split(">"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int maxHealthCap = Integer.parseInt(scanner.nextLine());

        boolean check = false;

        String command = scanner.nextLine();

        int count = 0;

        String output = "";

        while (!command.equals("Retire")) {

            String[] commandArray = command.split("\\s+");

            switch (commandArray[0]) {

                case "Fire":
                    int index = Integer.parseInt(commandArray[1]);
                    int damage = Integer.parseInt(commandArray[2]);

                    if (index >= 0 && index < warShip.size()) {

                        warShip.add(index, warShip.get(index) - damage);
                        warShip.remove(index + 1);

                        if (warShip.get(index) <= 0) {
                            output = "You won! The enemy ship has sunken.";
                            check = true;
                            break;
                        }

                    }
                    break;

                case "Defend":

                    int startIndex = Integer.parseInt(commandArray[1]);
                    int endIndex = Integer.parseInt(commandArray[2]);
                    int damageD = Integer.parseInt(commandArray[3]);

                    if (startIndex >= 0 && startIndex <= endIndex && endIndex < pirateShip.size()) {

                        for (int i = startIndex; i <= endIndex; i++) {

                            pirateShip.add(i, pirateShip.get(i) - damageD);
                            pirateShip.remove(i + 1);

                            if (pirateShip.get(i) <= 0) {
                                output = "You lost! The pirate ship has sunken.";
                                check = true;
                                break;
                            }

                        }

                    }
                    break;

                case "Repair":

                    int repIndex = Integer.parseInt(commandArray[1]);
                    int health = Integer.parseInt(commandArray[2]);

                    if (repIndex >= 0 && repIndex < pirateShip.size()) {

                        int repaired = pirateShip.get(repIndex) + health;

                        pirateShip.set(repIndex, Math.min(repaired, maxHealthCap));

                    }
                    break;

                case "Status":

                    double minimum = (maxHealthCap * 1.0 / 100) * 20;

                    for (Integer integer : pirateShip) {
                        if (integer < minimum) {
                            count++;
                        }
                    }

                    System.out.printf("%d sections need repair.%n", count);
                    break;

            }

            command = scanner.nextLine();
        }

        if (!check) {

            int sumFirst = 0;

            for (Integer integer : pirateShip) {
                sumFirst += integer;
            }

            System.out.printf("Pirate ship status: %d%n", sumFirst);
            int sumSecond = 0;

            for (Integer integer : warShip) {
                sumSecond += integer;
            }

            System.out.printf("Warship status: %d%n", sumSecond);

        } else {
            if (!output.equals("")) {
                System.out.println(output);
            }
        }

    }


}

