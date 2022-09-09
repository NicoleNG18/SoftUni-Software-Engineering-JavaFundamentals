package arrays.moreExercise;

import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[input][input];

        for (int row = 0; row < matrix.length; row++) {

            int currentRow = row + 1;

            for (int column = 0; column < matrix.length; column++) {

                int currentColumn = column + 1;

                if (currentColumn == 1) {
                    matrix[row][column] = 1;
                }

                if (currentRow == currentColumn) {
                    matrix[row][column] = 1;
                }

            }
        }

        for (int newRow = 2; newRow < matrix.length; newRow++) {

            for (int newCol = 1; newCol < newRow; newCol++) {

                matrix[newRow][newCol] = matrix[newRow - 1][newCol - 1] + matrix[newRow - 1][newCol];

            }
        }

        for (int[] currentElement : matrix) {

            for (int j = 0; j < matrix.length; j++) {

                if (currentElement[j] != 0) {
                    System.out.print(currentElement[j] + " ");
                }

            }
            System.out.println();
        }
    }
}

