package stringBuilder.lab;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, String> values = new LinkedHashMap<>();

        while (!input.equals("end")) {

            StringBuilder reversed = new StringBuilder();

            for (int i = input.length() - 1; i >= 0; i--) {
                reversed.append(input.charAt(i));
            }

            values.put(input, String.valueOf(reversed));
            input = scanner.nextLine();
        }

        for (Map.Entry<String, String> entry : values.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

    }
}

