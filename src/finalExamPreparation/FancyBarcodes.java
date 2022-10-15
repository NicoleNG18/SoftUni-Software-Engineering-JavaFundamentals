package finalExamPreparation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcodes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int countOfBarcodes = Integer.parseInt(scanner.nextLine());
        Pattern pattern = Pattern.compile("(@#+)(?<name>[A-Z][A-Za-z0-9]{4,}[A-Z])(@#+)");

        for (int i = 0; i < countOfBarcodes; i++) {

            String input = scanner.nextLine();
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {

                Pattern second = Pattern.compile("[0-9]");
                Matcher secondMatcher = second.matcher(input);

                StringBuilder sum = new StringBuilder();

                while (secondMatcher.find()) {
                    sum.append(secondMatcher.group());
                }

                if (sum.length() == 0) {
                    System.out.println("Product group: 00");

                } else {
                    System.out.printf("Product group: %s%n", sum);
                }

            } else {
                System.out.println("Invalid barcode");
            }
        }

    }


}

