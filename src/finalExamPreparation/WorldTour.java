package finalExamPreparation;

import java.util.Scanner;

public class WorldTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder stops = new StringBuilder(scanner.nextLine());
        String input = scanner.nextLine();

        while (!input.equals("Travel")) {

            String[] help = input.split(":");

            if (help[0].equals("Add Stop")) {
                int index = Integer.parseInt(help[1]);

                if (index >= 0 && index < stops.length()) {
                    String str = help[2];
                    stops.insert(index, str);
                }

            } else if (help[0].equals("Remove Stop")) {

                int startIndex = Integer.parseInt(help[1]);
                int endIndex = Integer.parseInt(help[2]);

                if (startIndex >= 0 && endIndex >= 0 && startIndex < stops.length() && endIndex < stops.length()) {
                    stops.delete(startIndex, endIndex + 1);
                }

            } else if (help[0].equals("Switch")) {

                if (stops.toString().contains(help[1])) {
                    String data = stops.toString().replace(help[1], help[2]);

                    stops.setLength(0);
                    stops.append(data);
                }

            }

            System.out.println(stops);
            input = scanner.nextLine();
        }

        System.out.printf("Ready for world tour! Planned stops: %s%n", stops);
    }


}

