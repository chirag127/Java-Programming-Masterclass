/**
 * Introduction to arrays.
 *
 * An array is a collection of elements of the same type.
 * The elements are stored in contiguous memory locations.
 * The elements can be accessed using an index.
 * The index of the first element is 0.
 * The index of the last element is the length of the array minus 1.
 * The length of the array is immutable.
 */

public class Introduction {

    public static void main(String[] args) {
        int[] myIntArray = new int[10];
        myIntArray[5] = 50;
        double[] myDoubleArray = new double[10];
        System.out.println(myIntArray[5]);
        System.out.println(myIntArray[0]);
        System.out.println(myIntArray[6]);
        System.out.println(myIntArray[7]);
        System.out.println(myIntArray[8]);
        System.out.println(myIntArray[9]);

        for (int i = 0; i < myIntArray.length; i++) {
            System.out.print(myDoubleArray[i]);

        }

        int[] myIntArray2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println(myIntArray2[0]);
        System.out.println(myIntArray2[1]);
        System.out.println(myIntArray2[2]);
        System.out.println(myIntArray2[3]);
        System.out.println(myIntArray2[4]);
        System.out.println(myIntArray2[5]);
        System.out.println(myIntArray2[6]);
        System.out.println(myIntArray2[7]);
        System.out.println(myIntArray2[8]);
        System.out.println(myIntArray2[9]);

        int[] myIntArray3 = new int[25];
        for (int i = 0; i < myIntArray3.length; i++) {
            myIntArray3[i] = i * 10;
        }
        printArray(myIntArray3);
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + ", value is " + array[i]);
        }
    }
}



/** Output
 *
 * 50
 * 0
 * 0
 * 0
 * 0
 * 0
 */