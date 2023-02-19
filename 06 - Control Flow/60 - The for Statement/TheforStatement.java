/**
 * The for Statement
 *
 * The for statement is a control flow statement that allows code to be executed repeatedly based on a
 * boolean condition.
 *
 * The for statement consists of three expressions separated by semicolons:
 *  1. An initialization expression
 *  2. A termination expression
 *  3. An increment expression
 *
 * The initialization expression initializes the loop, and is executed once, as the loop begins.
 *
 * The termination expression is evaluated at the beginning of each loop iteration. If the value is
 * true, the loop will continue. If the value is false, the loop will terminate.
 *
 * The increment expression is invoked at the end of each loop iteration. This expression allows the
 * loop to eventually terminate, as failing to do so creates an infinite loop.
 *
 * The for statement is a compact way of writing the while statement, and is often used when the number
 * of iterations is known in advance.
 *
 * The for statement can also be used to loop through an array, as demonstrated in the following code
 * snippet:
 */

public class TheforStatement {
    public static void main(String[] args) {
        int[] myIntArray = new int[10];
        for (int i = 0; i < myIntArray.length; i++) {
            myIntArray[i] = i * 10;
        }
        printArray(myIntArray);
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + ", value is " + array[i]);
        }
    }

}
