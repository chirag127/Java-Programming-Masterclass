/**
 * Exception Handling and Introduction to Scanner
 * The Scanner class is used to read input from the keyboard
 * The Scanner class is in the java.util package
 *  */

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingandIntroductiontoScanner {
    public static void main(String[] args) {
        int x = 98;
        int y = 0;
        System.out.println(divideLBYL(x, y));
        System.out.println(divideEAFP(x, y));
        System.out.println(divide(x, y));
        x = getIntEAFP();
        System.out.println("x is " + x);
    }

    private static int getIntEAFP() {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Please enter an integer: ");
            try {
                return s.nextInt();
            } catch (InputMismatchException e) {
                return 0;
            }
        }
    }

    private static int divideLBYL(int x, int y) {
        if (y != 0) {
            return x / y;
        } else {
            return 0;
        }
    }

    private static int divideEAFP(int x, int y) {
        try {
            return x / y;
        } catch (ArithmeticException e) {
            return 0;
        }
    }

    private static int divide(int x, int y) {
        return x / y;
    }
}