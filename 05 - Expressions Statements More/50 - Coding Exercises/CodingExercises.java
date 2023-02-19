// // package 05 - Expressions Statements More.50 - Coding Exercises;

// public class CodingExercises {

//     public static void main(String[] args) {

//         System.out.println(calcFeetAndInchesToCentimeters(6, 0));
//         System.out.println(calcFeetAndInchesToCentimeters(7, 5));
//         System.out.println(calcFeetAndInchesToCentimeters(-10));

//         System.out.println(calcFeetAndInchesToCentimeters(157));

//     }

//     public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
//         if ((feet < 0) || ((inches < 0) || (inches > 12))) {
//             return -1;
//         }

//         double centimeters = (feet * 12) * 2.54;
//         centimeters += inches * 2.54;

//         return centimeters;
//     }

//     public static double calcFeetAndInchesToCentimeters(double inches) {
//         if (inches < 0) {
//             return -1;
//         }

//         double feet = (int) inches / 12;
//         double remainingInches = (int) inches % 12;

//         System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches");

//         return calcFeetAndInchesToCentimeters(feet, remainingInches);
//     }

// }

class CodingExercises {
    public static void main(String[] args) {

        // exercise 1
        // positive number or negative number or zero

        int number = 0;

        if (number > 0) {
            System.out.println("positive number");
        } else if (number < 0) {
            System.out.println("negative number");
        } else {
            System.out.println("zero");
        }

        // exercise 2

        // leap year

        int year = 2000;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("leap year");
                } else {
                    System.out.println("not a leap year");
                }
            } else {
                System.out.println("leap year");
            }
        } else {
            System.out.println("not a leap year");
        }

        // exercise 3

        // sum of first and last digit of a number

        int number1 = 1234;

        int lastDigit = number1 % 10;

        while (number1 >= 10) {
            number1 /= 10;
        }

        int firstDigit = number1;

        int sum = firstDigit + lastDigit;

        System.out.println("sum of first and last digit of a number is " + sum);

        // exercise 4

        // sum of even and odd digits of a number

        int number2 = 123456789;

        int evenSum = 0;

        int oddSum = 0;

        while (number2 > 0) {
            int lastDigit1 = number2 % 10;

            if (lastDigit1 % 2 == 0) {
                evenSum += lastDigit1;
            } else {
                oddSum += lastDigit1;
            }

            number2 /= 10;
        }

        System.out.println("sum of even digits is " + evenSum);

        System.out.println("sum of odd digits is " + oddSum);

        // exercise 5

        // sum of digits of a number

        int number3 = 12345;

        int sum1 = 0;

        while (number3 > 0) {
            int lastDigit2 = number3 % 10;

            sum1 += lastDigit2;

            number3 /= 10;
        }

        System.out.println("sum of digits of a number is " + sum1);

        // exercise 6

        // reverse a number

        int number4 = 12345;

        int reverse = 0;

        while (number4 > 0) {
            int lastDigit3 = number4 % 10;

            reverse = (reverse * 10) + lastDigit3;

            number4 /= 10;
        }

        System.out.println("reverse of a number is " + reverse);

        // exercise 7

        // number is palindrome or not

        int number5 = 12321;

        int reverse1 = 0;

        int temp = number5;

        while (temp > 0) {
            int lastDigit4 = temp % 10;

            reverse1 = (reverse1 * 10) + lastDigit4;

            temp /= 10;
        }

        if (number5 == reverse1) {
            System.out.println("palindrome");
        } else {
            System.out.println("not a palindrome");
        }

        // exercise 8

        // sum of first n natural numbers

        int n = 100;

        int sum2 = 0;

        for (int i = 1; i <= n; i++) {
            sum2 += i;
        }

        System.out.println("sum of first n natural numbers is " + sum2);

        // exercise 9

        // fibonacci series

        int n1 = 10;

        int first = 0;
        int second = 1;

        for (int i = 1; i <= n1; i++) {
            System.out.print(first + " ");

            int next = first + second;

            first = second;
            second = next;
        }

        System.out.println();

        // exercise 10

        // factorial of a number

        int n2 = 5;

        int factorial = 1;

        for (int i = 1; i <= n2; i++) {
            factorial *= i;
        }

        System.out.println("factorial of a number is " + factorial);

        // exercise 11

        // prime number or not

        int n3 = 7;

        boolean isPrime = true;

        for (int i = 2; i <= n3 / 2; i++) {
            if (n3 % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println("prime number");
        } else {
            System.out.println("not a prime number");
        }

    }
}
