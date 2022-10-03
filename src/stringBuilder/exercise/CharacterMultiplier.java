package stringBuilder.exercise;

import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String first = scanner.next();
        String second = scanner.next();

        System.out.println(ReturnSum(first, second));
    }

    private static long ReturnSum(String first, String second) {

        long sum = 0;

        if (first.length() > second.length()) {

            for (int i = 0; i < second.length(); i++) {
                int result = first.charAt(i) * second.charAt(i);
                sum += result;
            }

            for (int i = second.length(); i < first.length(); i++) {
                sum += first.charAt(i);
            }

        } else if (first.length() < second.length()) {

            for (int i = 0; i < first.length(); i++) {
                int result = first.charAt(i) * second.charAt(i);
                sum += result;
            }

            for (int i = first.length(); i < second.length(); i++) {
                sum += second.charAt(i);
            }

        } else {

            for (int i = 0; i < first.length(); i++) {
                int result = first.charAt(i) * second.charAt(i);
                sum += result;
            }

        }
        return sum;
    }


}
