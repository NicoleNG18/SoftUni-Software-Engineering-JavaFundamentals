package finalExamPreparation;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ThePianist {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numOfPieces = Integer.parseInt(scanner.nextLine());
        Map<String, Piece> pieces = new LinkedHashMap<>();

        for (int i = 0; i < numOfPieces; i++) {
            String[] commandArr = scanner.nextLine().split("\\|");

            Piece current = new Piece(commandArr[0], commandArr[1], commandArr[2]);
            pieces.put(commandArr[0], current);
        }

        String command = scanner.nextLine();

        while (!command.equals("Stop")) {

            String[] help = command.split("\\|");

            if (help[0].equals("Add")) {

                if (pieces.containsKey(help[1])) {
                    System.out.printf("%s is already in the collection!%n", help[1]);

                } else {
                    pieces.put(help[1], new Piece(help[1], help[2], help[3]));
                    System.out.printf("%s by %s in %s added to the collection!%n", help[1], help[2], help[3]);
                }

            } else if (help[0].equals("Remove")) {
                if (pieces.containsKey(help[1])) {
                    pieces.remove(help[1]);
                    System.out.printf("Successfully removed %s!%n", help[1]);

                } else {
                    System.out.printf("Invalid operation! %s does not exist in the collection.%n", help[1]);
                }

            } else if (help[0].equals("ChangeKey")) {

                if (pieces.containsKey(help[1])) {
                    pieces.get(help[1]).setKey1(help[2]);
                    System.out.printf("Changed the key of %s to %s!%n", help[1], help[2]);

                } else {
                    System.out.printf("Invalid operation! %s does not exist in the collection.%n", help[1]);
                }

            }
            command = scanner.nextLine();
        }

        for (Map.Entry<String, Piece> entry : pieces.entrySet()) {
            System.out.printf("%s -> Composer: %s, Key: %s%n", entry.getKey(), entry.getValue().getComposer(), entry.getValue().getKey1());
        }

    }


    static class Piece {
        private String name;
        private String composer;
        private String key1;

        public Piece(String name, String composer, String key) {
            this.name = name;
            this.composer = composer;
            this.key1 = key;
        }

        public String getComposer() {
            return composer;
        }

        public String getKey1() {
            return key1;
        }

        public void setKey1(String key1) {
            this.key1 = key1;
        }
    }
}

