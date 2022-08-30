package basicSyntax.exercise;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder input = new StringBuilder(scanner.nextLine());
        String name=input.toString();
        String reversed = String.valueOf(input.reverse());

        String password = scanner.nextLine();
        int count = 0;
        boolean check = false;

        while (!(password.equals(reversed))) {

            if (count == 3) {

                System.out.printf("User %s blocked!", name);
                check = true;

                break;
            }

            System.out.println("Incorrect password. Try again.");

            count++;
            password = scanner.nextLine();
        }

        if (!check) {
            System.out.printf("User %s logged in.", name);
        }

    }
}

