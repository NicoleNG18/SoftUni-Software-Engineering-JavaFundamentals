package finalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BossRush {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfInputs = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numOfInputs; i++) {

            String data = scanner.nextLine();

            Pattern pattern = Pattern.compile("(\\|)([A-Z]{4,})(\\|):(#)([A-Za-z]+ [A-Za-z]+)(#)");
            Matcher matcher = pattern.matcher(data);

            if (matcher.find()) {
                System.out.printf("%s, The %s%n", matcher.group(2), matcher.group(5));
                System.out.printf(">> Strength: %d%n", matcher.group(2).length());
                System.out.printf(">> Armor: %d%n", matcher.group(5).length());

            } else {
                System.out.println("Access denied!");
            }

        }
    }


}

