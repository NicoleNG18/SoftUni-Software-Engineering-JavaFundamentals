package basicSyntax.moreExercise;

import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());

        int highest = 0;
        int middle = 0;
        int lowest = 0;

        if (firstNum >= secondNum && firstNum >= thirdNum) {

            highest = firstNum;

            if (secondNum >= thirdNum) {

                middle = secondNum;
                lowest = thirdNum;

            } else {

                middle = thirdNum;
                lowest = secondNum;

            }
        }

        if (secondNum >= firstNum && secondNum >= thirdNum) {

            highest = secondNum;

            if (firstNum >= thirdNum) {

                middle = firstNum;
                lowest = thirdNum;

            } else {

                lowest = firstNum;
                middle = thirdNum;

            }

        }

        if (thirdNum >= firstNum && thirdNum >= secondNum) {

            highest = thirdNum;

            if (firstNum >= secondNum) {

                middle = firstNum;
                lowest = secondNum;

            } else {

                lowest = firstNum;
                middle = secondNum;

            }
        }

        System.out.println(highest);
        System.out.println(middle);
        System.out.println(lowest);

    }
}


