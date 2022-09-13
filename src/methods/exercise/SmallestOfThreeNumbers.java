package methods.exercise;

import java.util.Scanner;


public class SmallestOfThreeNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());

        System.out.println(getMin(getMin(firstNum, secondNum), thirdNum));
    }

    private static int getMin(int firstNum, int secondNum) {
        return Math.min(firstNum, secondNum);
    }

}

