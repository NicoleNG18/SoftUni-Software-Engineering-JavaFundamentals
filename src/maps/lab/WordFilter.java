package maps.lab;

import java.util.Scanner;
import java.util.Arrays;

public class WordFilter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] array = Arrays.stream(scanner.nextLine().split("\\s+"))
                .filter(w -> w.length() % 2 == 0)
                .toArray(String[]::new);

        for (String s : array) {
            System.out.println(s);
        }

    }
}
