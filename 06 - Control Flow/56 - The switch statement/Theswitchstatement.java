/*
 * The switch statement
 *
 * The switch statement is used to perform different actions based on different
 * conditions.
 *
 * The switch statement evaluates an expression, matching the expression's value
 * to a case clause, and executes statements associated with that case, as well
 * as statements in cases that follow the matching case.
 *
 * The switch statement is often used together with a break or a default keyword
 * (or both).
 *
 * The break keyword breaks out of the switch block.
 *
 * The default keyword specifies some code to run if there is no case match.
 *
 * The break keyword is optional, and will stop the execution of more code and
 * case testing inside the block. This is useful when we have multiple cases
 * which we want to stop before getting to the last case.
 */

public class SwitchStatement {

    public static void main(String[] args) {
        int value = 1;
        if (value == 1) {
            System.out.println("Value was 1");
        } else if (value == 2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Was not 1 or 2");
        }

        int switchValue = 3;

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("Was a 3, or a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
                break;

            default:
                System.out.println("Was not 1 or 2");
                break;
        }

        // Create a new switch statement using char instead of int
        // create a new char variable
        // create a switch statement testing for
        // A, B, C, D or E
        // display a message if any of these are found and then break
        // Add a default which displays a message saying not found

        char charValue = 'A';

        switch (charValue) {
            case 'A':
                System.out.println("A was found");
                break;

            case 'B':
                System.out.println("B was found");
                break;

            case 'C': case 'D': case 'E':
                System.out.println(charValue + " was found");
                break;

            default:
                System.out.println("Could not find A, B, C, D or E");
                break;
        }

        String month = "January";
        switch (month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;

            case "june":
                System.out.println("Jun");
                break;

            default:
                System.out.println("Not sure");
        }
    }

}

