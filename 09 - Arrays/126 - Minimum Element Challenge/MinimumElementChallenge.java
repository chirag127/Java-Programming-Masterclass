/** Minimum Element Challenge
 *
 * @author Chirag Singhal
 */

import java.util.Scanner;

public class MinimumElementChallenge {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        int min = findMin(myIntegers);
        System.out.println("Minimum value is " + min);
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.");
        System.out.println("the value should be separated by a space");

        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

}

/** Output
 *
 * Enter 5 integer values.
 * the value should be separated by a space
 * 1 2 3 4 5
 * Minimum value is 1
 */


/** Explanation
 *
 * The challenge is to write a method called readIntegers() with
 * a parameter called count that represents how many integers the
 * user needs to enter.
 *
 * The method needs to read from the console until all the numbers
 * are entered, and then return an array containing the numbers
 * entered.
 *
 * Write a method findMin() with the array as a parameter. The method
 * needs to return the minimum value in the array.
 * In the main() method read the count from the console and call the
 * method readIntegers() with the count parameter.
 * Then call the findMin() method passing the array returned from the
 * call to the readIntegers() method.
 * Finally, print the minimum element in the array.
 * Tips:
 * Assume that the user will only enter numbers, never letters
 * For simplicity, create a Scanner as a static field to help with
 * data input
 * Create a new console project with the name eMinElementChallengef
 */
