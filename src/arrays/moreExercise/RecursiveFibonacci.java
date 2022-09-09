package arrays.moreExercise;

import java.util.Scanner;

public class RecursiveFibonacci {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int wantedFibonacci = Integer.parseInt(scanner.nextLine());

        if (wantedFibonacci == 1 || wantedFibonacci==2) {
            System.out.println("1");
        }  else {
            System.out.println(getFibonacci(wantedFibonacci));
        }

    }

    private static int getFibonacci(int num) {

        int previousFibonacci1 = 1;
        int previousFibonacci2 = 1;
        int newFibonacci = 0;

        for (int i = 3; i <= num; i++) {

            newFibonacci = previousFibonacci1 + previousFibonacci2;

            previousFibonacci2 = previousFibonacci1;
            previousFibonacci1 = newFibonacci;

        }

        return newFibonacci;
    }
}

