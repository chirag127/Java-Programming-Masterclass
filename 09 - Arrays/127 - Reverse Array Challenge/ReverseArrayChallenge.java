/** Reverse Array Challenge
 *
 * @author Chirag Singhal
 */

import java.util.Scanner;

public class ReverseArrayChallenge {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        printArray(myIntegers);
        reverse(myIntegers);
        printArray(myIntegers);
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.");

        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + ", typed value was " + array[i]);
        }
    }

    public static void reverse(int[] array) {
        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;
        for (int i = 0; i < halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }
    }

}

/*
 * Output:
 *
 * Enter 5 integer values. 1 2 3 4 5 Element 0, typed value was 1 Element 1, typed value was 2 Element 2, typed value was 3 Element 3, typed value was 4 Element 4, typed value was 5 Element 0, typed value was 5 Element 1, typed value was 4 Element 2, typed value was 3 Element 3, typed value was 2 Element 4, typed value was 1
 *
 */

/** Explanation
 *
 * The challenge is to write a method called reverse() with an int array as a parameter.
 * The method should not return any value. In other words, the method is allowed to modify the array parameter.
 * In main() test the reverse() method and print the array both reversed and non-reversed.
 *
 * To reverse the array, you have to swap the elements, so that the first element is swapped with the last element and so on.
 * For example, if the array is {1,2,3,4,5}, then the reversed array is {5,4,3,2,1}.
 *
 * Tip:
 * Create a new console project with the name eReverseArrayChallengef
 */

 
