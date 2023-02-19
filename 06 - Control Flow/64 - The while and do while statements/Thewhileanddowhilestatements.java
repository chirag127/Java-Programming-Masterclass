/**
 * The while and do while statements
 *
 * The while statement is a control flow statement that allows code to be executed repeatedly based on
 * a boolean condition.
 *
 * The do while statement is a control flow statement that allows code to be executed repeatedly based
 * on a boolean condition.
 *
 * The while statement consists of a boolean expression and a statement or block of statements.
 *
 * The statement or block of statements will be executed repeatedly while the boolean expression is
 * true.
 *
 * The do while statement consists of a boolean expression and a statement or block of statements.
 *
 * The statement or block of statements will be executed repeatedly while the boolean expression is
 * true.
 *
 * The do while statement will always execute at least once, even if the boolean expression is false.
 */

public class Thewhileanddowhilestatements {
    public static void main(String[] args) {
        int count = 1;
        while (count != 6) {
            System.out.println("Count value is " + count);
            count++;
        }

        count = 1;
        do {
            System.out.println("Count value was " + count);
            count++;
        } while (count != 6);

        int number = 4;
        int finishNumber = 20;
        int evenNumbersFound = 0;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }

            System.out.println("Even number " + number);

            evenNumbersFound++;
            if (evenNumbersFound >= 5) {
                break;
            }
        }

        System.out.println("Total even numbers found = " + evenNumbersFound);
    }

    public static boolean isEvenNumber(int number) {
        if ((number % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }

}
