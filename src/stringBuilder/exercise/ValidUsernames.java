package stringBuilder.exercise;

import java.util.Scanner;

public class ValidUsernames {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] usernames = scanner.nextLine().split(", ");
        boolean check = false;

        for (String username : usernames) {

            if (username.length() >= 3 && username.length() <= 16) {

                for (int j = 0; j < username.length(); j++) {

                    if (checkChar(username, j)) {
                        check = false;

                    } else {

                        check = true;
                        break;
                    }

                }

                if (!check) {
                    System.out.println(username);
                }

            }
        }

    }

    private static boolean checkChar(String username, int j) {
        return Character.isLetter(username.charAt(j)) || Character.isDigit(username.charAt(j)) ||
                (username.charAt(j) == 45) || (username.charAt(j) == 95);
    }


}

