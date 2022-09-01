package dataTypes.lab;

import java.math.BigDecimal;
import java.util.Scanner;

public class PoundsToDollars {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        BigDecimal pound = new BigDecimal(scanner.nextLine());

        System.out.printf("%.3f", pound.multiply(BigDecimal.valueOf(1.36)));
    }
}

