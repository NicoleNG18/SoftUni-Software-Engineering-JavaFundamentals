package regex.lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchPhoneNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> phoneNumbers = new ArrayList<>();
        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile("\\+(359)([ -])(2)\\2\\d{3}\\2\\d{4}\\b");
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            phoneNumbers.add(matcher.group());
        }

        System.out.println(String.join(", ", phoneNumbers));

    }


}
