package arrays.moreExercise;


import java.util.Scanner;
import java.util.Arrays;

public class EncryptSortPrint {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int countNames = Integer.parseInt(scanner.nextLine());
        int[] finalArray = new int[countNames];

        for (int j = 0; j < countNames; j++) {

            int sum = 0;
            String name = scanner.nextLine();
            char[] characterArray = new char[name.length()];

            for (int i = 0; i < characterArray.length; i++) {

                characterArray[i] = name.charAt(i);
                if (isCertainDigit(characterArray[i])) {
                    sum += characterArray[i] * name.length();
                } else {
                    sum += characterArray[i] / name.length();
                }

            }

            finalArray[j] = sum;

        }

        Arrays.sort(finalArray);

        for (int i : finalArray) {
            System.out.println(i);
        }

    }

    private static boolean isCertainDigit(char characterArray) {
        return characterArray == 65 || characterArray == 69 ||
                characterArray == 73 || characterArray == 79 ||
                characterArray == 85 || characterArray == 97 ||
                characterArray == 101 || characterArray == 105 ||
                characterArray == 111 || characterArray == 117;
    }
}

