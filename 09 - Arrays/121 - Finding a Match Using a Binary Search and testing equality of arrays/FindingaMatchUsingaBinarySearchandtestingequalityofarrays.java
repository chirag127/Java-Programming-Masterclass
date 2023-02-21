/**
 * Finding a Match Using a Binary Search and testing equality of arrays
 *
 * This program demonstrates the use of the following methods:
 * javautilArrays binarySearch
 * javautilArrays equals
 *
 * @author 2023 Chirag Singhal
 */

import java.util.Arrays;

public class FindingaMatchUsingaBinarySearchandtestingequalityofarrays {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // binarySearch
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int index = Arrays.binarySearch(arr, 5);
        System.out.println("Index of 5: " + index);

        // equals
        int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        boolean isEqual = Arrays.equals(arr, arr1);
        System.out.println("Are the arrays equal? " + isEqual);
    }
}
