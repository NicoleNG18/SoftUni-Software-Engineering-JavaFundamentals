package midExam;

import java.util.Arrays;
import java.util.Scanner;

public class TheAngryCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt).toArray();

        int entryPoint = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();

        int leftSum = 0;
        int rightSum = 0;

        if (type.equals("cheap")) {

            for (int inLeft = 0; inLeft < entryPoint; inLeft++) {

                if (numbers[inLeft] < numbers[entryPoint]) {
                    leftSum += numbers[inLeft];
                }

            }

            for (int inRight = entryPoint + 1; inRight < numbers.length; inRight++) {

                if (numbers[inRight] < numbers[entryPoint]) {
                    rightSum += numbers[inRight];
                }

            }

        } else if (type.equals("expensive")) {

            for (int inLeft = 0; inLeft < entryPoint; inLeft++) {

                if (numbers[inLeft] >= numbers[entryPoint]) {
                    leftSum += numbers[inLeft];
                }

            }

            for (int inRight = entryPoint + 1; inRight < numbers.length; inRight++) {

                if (numbers[inRight] >= numbers[entryPoint]) {
                    rightSum += numbers[inRight];
                }

            }

        }

        if (leftSum >= rightSum) {
            System.out.printf("Left - %d", leftSum);

        } else {
            System.out.printf("Right - %d", rightSum);
        }
    }


}

