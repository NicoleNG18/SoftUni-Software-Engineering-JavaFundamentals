package dataTypes.lab;

import java.util.Scanner;

public class CenturiesToMinutes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int centuries = Integer.parseInt(scanner.nextLine());

        System.out.printf("%d centuries = %d years = %.0f days = %.0f hours = %.0f minutes",
                centuries, centuries * 100,
                centuries * 100 * 365.2422,
                centuries * 100 * 365.2422 * 24,
                centuries * 100 * 365.2422 * 24 * 60);
    }
}


