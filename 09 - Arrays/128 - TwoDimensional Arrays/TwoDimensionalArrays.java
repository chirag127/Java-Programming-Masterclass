/** TwoDimensional Arrays
 *
 * @author Chirag Singhal
 */


public class TwoDimensionalArrays {
    public static void main(String[] args) {
        int[][] myArray = new int[10][10];
        int number = 0;
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                myArray[i][j] = number;
                number++;
                System.out.print(myArray[i][j] + "\t");
            }
            System.out.println();
        }
    }
}


/** Output
 * 0	1	2	3	4	5	6	7	8	9
 * 10	11	12	13	14	15	16	17	18	19
 * 20	21	22	23	24	25	26	27	28	29
 * 30	31	32	33	34	35	36	37	38	39
 * 40	41	42	43	44	45	46	47	48	49
 * 50	51	52	53	54	55	56	57	58	59
 * 60	61	62	63	64	65	66	67	68	69
 * 70	71	72	73	74	75	76	77	78	79
 * 80	81	82	83	84	85	86	87	88	89
 * 90	91	92	93	94	95	96	97	98	99
 */

/** Explanation
 *
 * 1. The outer loop iterates over the rows of the array.
 * 2. The inner loop iterates over the columns of the array.
 * 3. The inner loop is executed 10 times for each iteration of the outer loop.
 * 4. The outer loop is executed 10 times.
 * 5. The array is initialized with the numbers 0 to 99.
 * 6. The array is printed.
 */

