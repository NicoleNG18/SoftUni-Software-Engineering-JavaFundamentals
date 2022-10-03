package stringBuilder.exercise;

import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        StringBuilder newStr = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            int symbol = text.charAt(i);
            newStr.append(Character.valueOf((char) (symbol + 3)));
        }

        System.out.println(String.valueOf(newStr));
    }

}

