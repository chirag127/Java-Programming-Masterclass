/** Multidimensional Arrays
 *
 * @author Chirag Singhal
 */

import java.util.Scanner;

public class MultidimensionalArrays {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] myIntegers = getIntegers(2, 3);
        printArray(myIntegers);
    }

    public static int[][] getIntegers(int rows, int columns) {
        int[][] array = new int[rows][columns];
        System.out.println("Enter " + rows + " rows and " + columns + " columns: ");
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                array[row][column] = scanner.nextInt();
            }
        }
        return array;
    }

    public static void printArray(int[][] array) {
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                System.out.print(array[row][column] + "\t");
            }
            System.out.println();
        }
    }
}

