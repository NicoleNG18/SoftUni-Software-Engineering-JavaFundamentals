package methods.exercise;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        validatePassword(input);
    }

    public static void validatePassword(String input) {
        if (isValid(input)) {
            System.out.println("Password is valid");

        } else {

            if (!isBetween6and10Characters(input).equals("")) {
                System.out.println(isBetween6and10Characters(input));
            }

            if (!isFromLetterAndDigits(input).equals("")) {
                System.out.println(isFromLetterAndDigits(input));
            }

            if (!hasTwoDigits(input).equals("")) {
                System.out.println(hasTwoDigits(input));
            }

        }
    }

    private static boolean isValid(String input) {
        return isBetween6and10Characters(input).equals("") &&
                isFromLetterAndDigits(input).equals("") &&
                hasTwoDigits(input).equals("");
    }


    public static String isBetween6and10Characters(String s) {

        if (!(s.length() >= 6 && s.length() <= 10)) {
            return "Password must be between 6 and 10 characters";
        }

        return "";
    }

    public static String isFromLetterAndDigits(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!check(s, i)) {
                return "Password must consist only of letters and digits";
            }
        }
        return "";
    }

    private static boolean check(String s, int i) {
        return (s.charAt(i) >= 48 && s.charAt(i) <= 57) ||
                (s.charAt(i) >= 65 && s.charAt(i) <= 90) ||
                (s.charAt(i) >= 97 && s.charAt(i) <= 122);
    }

    public static String hasTwoDigits(String s) {

        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) >= 48 && s.charAt(i) <= 57) {
                count++;
            }

        }

        if (count < 2) {
            return "Password must have at least 2 digits";
        }

        return "";

    }


}

