/*
Primitive Types Challenge

The challenge is to write a program
that reads 10 numbers from the console
entered by the user and
prints the sum of those numbers.

Create a Scanner like we did in the previous video.
Use the hasNextInt() method from the scanner to
check if the user has entered an int value.

If hasNextInt() returns false, print the message
"Invalid Number".
Continue reading until you have read
10 numbers.

Use the nextInt() method to get the number

and add it to the sum.

Before the user enters each number,

print the message "Enter number #x:" where x represents
the count, i.e. 1, 2, 3, 4, etc.

*/

import java.util.Scanner;


class PrimitiveTypesChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int sum = 0;
        while (counter < 10) {
            int order = counter + 1;
            System.out.println("Enter number #" + order + ":");
            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt) {
                int number = scanner.nextInt();
                counter++;
                sum += number;
            } else {
                System.out.println("Invalid Number");
            }
            scanner.nextLine();
        }
        System.out.println("sum = " + sum);
        scanner.close();
    }
}