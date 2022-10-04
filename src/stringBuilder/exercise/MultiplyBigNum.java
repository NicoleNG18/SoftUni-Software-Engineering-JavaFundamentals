package stringBuilder.exercise;

import java.util.Scanner;

public class MultiplyBigNum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        StringBuilder number = new StringBuilder(scanner.nextLine());
        int additional = 0;

        StringBuilder finalNum = new StringBuilder();
        int digit = Integer.parseInt(scanner.nextLine());

        for (int i = number.length() - 1; i >= 0; i--) {

            int multiplied = digit * Integer.parseInt(String.valueOf(number.charAt(i)));
            int product = multiplied + additional;

            if (product > 9) {
                finalNum.append(product % 10);
                additional = product / 10;
            } else {
                finalNum.append(product);
                additional = multiplied / 10;
            }

        }

        if (additional != 0) {
            finalNum.append(additional);
        }

        finalNum.reverse();

        while (finalNum.charAt(0) == 48 && finalNum.length() > 1) {
            finalNum.deleteCharAt(0);
        }

        System.out.println(finalNum);
    }

}

