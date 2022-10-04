package stringBuilder.exercise;

import java.util.Scanner;

public class ReplaceRepeatingChars {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder replaced = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {

            if (i != input.length() - 1) {

                replaced.append(input.charAt(i));
                int j = i + 1;

                while (input.charAt(i) == input.charAt(j) && j != input.length() - 1) {
                    j++;
                }

                i = j - 1;

            } else {

                if (input.charAt(i) != input.charAt(i - 1)) {
                    replaced.append(input.charAt(i));
                }

            }
        }

        System.out.println(replaced);
    }


}

