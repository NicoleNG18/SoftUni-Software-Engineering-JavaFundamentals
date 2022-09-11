package methods.lab;

import java.util.Scanner;


public class RepeatString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int repetitions = Integer.parseInt(scanner.nextLine());

        System.out.println(repeatedString(input, repetitions));
    }

    private static String repeatedString(String input, int repetititons) {
        String[] array = new String[repetititons];

        for (int i = 0; i < repetititons; i++) {
            array[i] = input;
        }

        return String.join("", array);
    }

}

