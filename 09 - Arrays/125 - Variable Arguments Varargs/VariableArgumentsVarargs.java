/** Variable Arguments Varargs
 *
 * @author: Chirag Singhal
 */

import java.util.Arrays;
import java.util.Scanner;

class VariableArgumentsVarargs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of integers you want to enter: ");
        int count = scanner.nextInt();
        int[] array = readIntegers(count);
        System.out.println("The minimum value is: " + findMin(array));
    }

    private static int[] readIntegers(int count) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[count];
        for (int i = 0; i < count; i++) {
            System.out.println("Enter a number: ");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    private static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}

/** Output:
 *
 * Enter the number of integers you want to enter:
 * 5
 * Enter a number:
 * 2
 * Enter a number:
 * 3
 * Enter a number:
 * 4
 * Enter a number:
 * 5
 * Enter a number:
 * 6
 * The minimum value is: 2
 */
