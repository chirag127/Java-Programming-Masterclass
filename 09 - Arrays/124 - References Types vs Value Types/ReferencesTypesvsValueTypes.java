/**
 * References Types vs Value Types
 *
 * @author: Chirag Singhal
 */

import java.util.Arrays;

class ReferencesTypesvsValueTypes {
    public static void main(String[] args) {
        int myIntValue = 10;
        int anotherIntValue = myIntValue;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);

        anotherIntValue++;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);

        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;

        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));

        anotherArray[0] = 1;

        System.out.println("after change myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("after change anotherArray = " + Arrays.toString(anotherArray));

        modifyArray(myIntArray);

        System.out.println("after modify myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("after modify anotherArray = " + Arrays.toString(anotherArray));

        anotherArray = new int[] { 4, 5, 6, 7, 8 };
        modifyArray(myIntArray);

        System.out.println("after modify myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("after modify anotherArray = " + Arrays.toString(anotherArray));
    }

    private static void modifyArray(int[] array) {
        array[0] = 2;
        array = new int[] { 1, 2, 3, 4, 5 };
    }

}

/**
 * Output
 *
 * myIntValue = 10
 * anotherIntValue = 10
 * myIntValue = 10
 * anotherIntValue = 11
 * myIntArray = [0, 0, 0, 0, 0]
 * anotherArray = [0, 0, 0, 0, 0]
 * after change myIntArray = [1, 0, 0, 0, 0]
 * after change anotherArray = [1, 0, 0, 0, 0]
 * after modify myIntArray = [2, 0, 0, 0, 0]
 * after modify anotherArray = [2, 0, 0, 0, 0]
 * after modify myIntArray = [2, 0, 0, 0, 0]
 * after modify anotherArray = [4, 5, 6, 7, 8]
 */

/**
 * Explanation
 *
 * In Java, there are two types of data types: value types and reference types.
 *
 * Value types are primitive data types like int, double, char, boolean, etc.
 *
 * Reference types are objects like String, Arrays, etc.
 *
 * In value types, the value is stored in the variable itself.
 *
 * In reference types, the value is stored in the memory location pointed by the
 * variable.
 *
 * In the above example, myIntValue is a value type variable.
 *
 * When we assign anotherIntValue = myIntValue, a new copy of the value is
 * created and stored in anotherIntValue.
 *
 * So, when we change the value of anotherIntValue, it does not affect the value
 * of myIntValue.
 */
