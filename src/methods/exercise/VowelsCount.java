package methods.exercise;

import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        System.out.println(countVowels(input));
    }

    private static int countVowels(String input) {
        int count = 0;

        for (int i = 0; i < input.length(); i++) {

            if (isAVowel(input, i)) {
                count++;
            }

        }
        return count;
    }

    private static boolean isAVowel(String input, int i) {
        return input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i'
                || input.charAt(i) == 'o' || input.charAt(i) == 'u' || input.charAt(i) == 'A'
                || input.charAt(i) == 'E' || input.charAt(i) == 'I'
                || input.charAt(i) == 'O' || input.charAt(i) == 'U';
    }


}

