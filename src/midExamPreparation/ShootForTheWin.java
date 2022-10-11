package midExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShootForTheWin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> elements = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int shotTargets = 0;
        String command = scanner.nextLine();

        while (!command.equals("End")) {

            int index = Integer.parseInt(command);

            if (index >= 0 && index < elements.size()) {

                int elementAtIndex = elements.get(index);
                elements.set(index, -1);
                shotTargets++;

                for (int i = 0; i < elements.size(); i++) {

                    if (elementAtIndex < elements.get(i) && elements.get(i) != -1) {
                        elements.set(i, elements.get(i) - elementAtIndex);

                    } else if (elementAtIndex >= elements.get(i) && elements.get(i) != -1) {
                        elements.set(i, elements.get(i) + elementAtIndex);
                    }
                }

            }

            command = scanner.nextLine();
        }

        System.out.printf("Shot targets: %d -> ", shotTargets);

        for (Integer element : elements) {
            System.out.print(element + " ");
        }

    }


}

