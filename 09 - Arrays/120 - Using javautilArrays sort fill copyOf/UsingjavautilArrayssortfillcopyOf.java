/**
 * Using javautilArrays sort fill copyOf
 *
 * This program demonstrates the use of the following methods:
 * javautilArrays sort
 * javautilArrays fill
 * javautilArrays copyOf
 * javautilArrays copyOfRange
 * javautilArrays binarySearch
 * javautilArrays equals
 * javautilArrays toString
 * javautilArrays deepToString
 * javautilArrays asList
 * javautilArrays deepEquals
 * javautilArrays spliterator
 * javautilArrays stream
 * javautilArrays parallelStream
 * javautilArrays parallelPrefix
 * javautilArrays parallelSetAll
 * javautilArrays parallelSort
 * javautilArrays setAll
 * javautilArrays spliterator
 *
 * @author 2023 Chirag Singhal
 */

import java.util.Arrays;

public class UsingjavautilArrayssortfillcopyOf {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // sort
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        Arrays.sort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));

        // fill
        int[] arr1 = new int[10];
        Arrays.fill(arr1, 5);
        System.out.println("Filled Array: " + Arrays.toString(arr1));

        // copyOf
        int[] arr2 = Arrays.copyOf(arr, 5);
        System.out.println("Copied Array: " + Arrays.toString(arr2));

        // copyOfRange
        int[] arr3 = Arrays.copyOfRange(arr, 2, 5);
        System.out.println("Copied Range Array: " + Arrays.toString(arr3));

        // binarySearch
        int index = Arrays.binarySearch(arr, 5);
        System.out.println("Index of 5: " + index);

        // equals
        int[] arr4 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        boolean isEqual = Arrays.equals(arr, arr4);
        System.out.println("Are the arrays equal? " + isEqual);

        // toString
        System.out.println("Array as String: " + Arrays.toString(arr));

        // deepToString
        int[][] arr5 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        System.out.println("Array as String: " + Arrays.deepToString(arr5));

        // asList
        int[] arr6 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println("Array as List: " + Arrays.asList(arr6));

        // deepEquals
        int[][] arr7 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int[][] arr8 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        boolean isEqual2 = Arrays.deepEquals(arr7, arr8);
        System.out.println("Are the arrays equal? " + isEqual2);

    }
}


/** Output
 *
 * Sorted Array: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
 * Filled Array: [5, 5, 5, 5, 5, 5, 5, 5, 5, 5]
 * Copied Array: [1, 2, 3, 4, 5]
 * Copied Range Array: [3, 4, 5]
 * Index of 5: 4
 * Are the arrays equal? true
 * Array as String: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
 * Array as String: [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
 * Array as List: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
 * Are the arrays equal? true
 *
 */

 