package methods.moreExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TribonacciSequence {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        printResult(num);
    }

    private static void printResult(int num) {

        if (num >= 1 && num <= 3) {
            printResultUnder3(num);

        } else if (num > 3) {
            printResultAbove3(num);
        }
    }

    private static void printResultAbove3(int num) {

        List<Integer> tribonacci = new ArrayList<>();

        tribonacci.add(1);
        tribonacci.add(1);
        tribonacci.add(2);

        for (int i = 3; i < num; i++) {
            int newElement = tribonacci.get(i - 1) + tribonacci.get(i - 2) + tribonacci.get(i - 3);
            tribonacci.add(newElement);
        }

        for (int i = 0; i < tribonacci.size(); i++) {
            System.out.print(tribonacci.get(i) + " ");
        }

    }

    private static void printResultUnder3(int num) {
        if (num == 1) {
            System.out.println("1");

        } else if (num == 2) {
            System.out.println("1 1");

        } else {
            System.out.println("1 1 2");
        }
    }


}