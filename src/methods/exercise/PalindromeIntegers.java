package methods.exercise;

import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("END")) {
            System.out.println(isPalindrome(input));
            input = scanner.nextLine();
        }

    }

    private static boolean isPalindrome(String input) {
        int numberLength = input.length();
        boolean check = true;

        if (numberLength % 2 == 0) {

            int j = numberLength - 1;

            for (int i = 0; i < numberLength / 2; i++) {

                if (input.charAt(i) != input.charAt(j)) {
                    check = false;
                    break;
                }

                j--;
            }

        } else {

            int j = numberLength - 1;

            for (int i = 0; i < numberLength / 2; i++) {

                if (input.charAt(i) != input.charAt(j)) {
                    check = false;
                    break;
                }

                j--;
            }

        }
        return check;
    }


}


