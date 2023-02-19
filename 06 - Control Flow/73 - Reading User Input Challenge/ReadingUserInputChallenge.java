/* Reading User Input Challenge
    * The Scanner class is used to read input from the keyboard
    * You'll be using an endless loop which:
    * • Prompts the user to enter a number, or any character to quit.
    * • Validates if the user-entered data really is a number, you can choose either an integer, or double validation method.
    * • If the user-entered data is not a number, quit the loop.
    */

import java.util.Scanner;

public class ReadingUserInputChallenge {
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
                System.out.println("number = " + number);

            } else {
                System.out.println("Invalid Number");
                break;
            }
            scanner.nextLine(); // handle input
        }

        scanner.close();

    }

}