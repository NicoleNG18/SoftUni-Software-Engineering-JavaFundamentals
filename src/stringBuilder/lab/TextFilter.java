package stringBuilder.lab;

import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] bannedWords = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (String banned : bannedWords) {

            while (text.contains(banned)) {

                int i = 0;
                StringBuilder replace = new StringBuilder();
                int length = banned.length();

                while (i < banned.length()) {
                    replace.append("*");
                    i++;
                }

                text = text.replace(banned, String.valueOf(replace));
            }
        }

        System.out.println(text);
    }


}
