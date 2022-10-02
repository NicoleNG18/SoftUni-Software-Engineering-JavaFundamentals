package stringBuilder.lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RepeatStrings {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] data = scanner.nextLine().split("\\s+");
        List<String> repeated = new ArrayList<>();

        for (String datum : data) {
            String newWord = String.valueOf(repeatedWord(datum, datum.length()));
            repeated.add(newWord);
        }

        System.out.println(String.join("", repeated));
    }

    private static StringBuilder repeatedWord(String data, int length) {
        StringBuilder rep = new StringBuilder();
        rep.append(String.valueOf(data).repeat(Math.max(0, length)));
        return rep;
    }


}
