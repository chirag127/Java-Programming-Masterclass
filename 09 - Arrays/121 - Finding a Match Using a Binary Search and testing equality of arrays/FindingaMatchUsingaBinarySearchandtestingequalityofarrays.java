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



/** Output
 *
 * Index of 5: 4
 * Are the arrays equal? true
 *
 */

/** notes
 *
 * binarySearch
 *  - This method searches the specified array of ints for the specified value using the binary search algorithm.
 *  - The array must be sorted (as by the sort(int[]) method) prior to making this call.
 *  - If it is not sorted, the results are undefined.
 *  - If the array contains multiple elements with the specified value, there is no guarantee which one will be found.
 *  - This method runs in log(n) time for a "random access" array (like an array).
 *
 * equals
 *  - This method returns true if the two specified arrays of ints are equal to one another.
 *  - The two arrays are considered equal if both arrays contain the same number of elements, and all corresponding pairs of elements in the two arrays are equal.
 *  - Two elements e1 and e2 are considered equal if (e1 == e2).
 *  - This method also returns true if both arrays are null.
 *
 */