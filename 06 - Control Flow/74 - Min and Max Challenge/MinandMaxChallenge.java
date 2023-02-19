/**
 * Min and Max Challenge
 *
 * The Scanner class is used to read input from the keyboard
 * You'll be using an endless loop which:
 * • Prompts the user to enter a number, or any character to quit.
 * • Validates if the user-entered data really is a number, you can choose either an integer, or double validation method.
 * • If the user-entered data is not a number, quit the loop.
 * • Keep track of the minimum number entered.
 * • Keep track of the maximum number entered.
 * If the user has previously entered a set of numbers (or even just one), display the minimum, and maximum number, which the user entered.
 *
 * The Scanner class is in the java.util package
 *
 */

import java.util.Scanner;

public class MinandMaxChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = 0;
        int max = 0;
        boolean first = true;

        while (true) {
            System.out.print("Enter number: ");
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int number = scanner.nextInt();

                if (first) {
                    first = false;
                    min = number;
                    max = number;
                }

                if (number > max) {
                    max = number;
                }

                if (number < min) {
                    min = number;
                }
            } else {
                System.out.println("Invalid Number");
                break;
            }
            scanner.nextLine(); // handle input
        }
        System.out.println("min = " + min + ", max = " + max);

        scanner.close();

    }

}
