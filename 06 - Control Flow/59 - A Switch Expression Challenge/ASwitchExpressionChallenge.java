/**
 * Write a switch statement that tests the value of the variable response and performs the following actions:
 *  If response is 1, print "You selected 1."
 *  If response is 2, print "You selected 2."
 *  If response is 3, print "You selected 3."
 *  If response is 4, print "You selected 4."
 *  If response is 5, print "You selected 5."
 *  If response is 6, print "You selected 6."
 *  If response is 7, print "You selected 7."
 *  If response is 8, print "You selected 8."
 *  If response is 9, print "You selected 9."
 *  If response is 10, print "You selected 10."
 *  If response is anything else, print "You selected an invalid response."
 *  Use a default case to print "You selected an invalid response."
 */

/**
 * "The switch statement is a multi-way branch statement that tests whether an expression matches one
 * of a number of constant integer values, and branches accordingly."
 *
 * The switch statement is a multi-way branch statement that tests whether an expression matches one of
 * a number of constant integer values, and branches accordingly
 */
public class ASwitchExpressionChallenge {
    public static void main(String[] args) {
        int response = 1;
        switch (response) {
            case 1:
                System.out.println("You selected 1.");
                break;
            case 2:
                System.out.println("You selected 2.");
                break;
            case 3:
                System.out.println("You selected 3.");
                break;
            case 4:
                System.out.println("You selected 4.");
                break;
            case 5:
                System.out.println("You selected 5.");
                break;
            case 6:
                System.out.println("You selected 6.");
                break;
            case 7:
                System.out.println("You selected 7.");
                break;
            case 8:
                System.out.println("You selected 8.");
                break;
            case 9:
                System.out.println("You selected 9.");
                break;
            case 10:
                System.out.println("You selected 10.");
                break;
            default:
                System.out.println("You selected an invalid response.");
        }
    }

}
