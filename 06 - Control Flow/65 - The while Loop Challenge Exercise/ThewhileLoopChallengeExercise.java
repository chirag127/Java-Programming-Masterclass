/**
 * The while Loop Challenge Exercise
 * Write a method called isEvenNumber that takes a parameter of type int
 * Its purpose is to determine if the argument passed to the method is
 * an even number or not.
 * Return true if an even number, otherwise return false;
 *
 * Write another method called sumEvenNumber that has 2 parameters
 * 1. start - the starting number of the range
 * 2. end - the ending number of the range
 *
 * The method should use a for loop to sum all even numbers in that range
 * including the end and return the sum
 *
 * It should call the method isEvenNumber to determine if each number is even
 *
 * The parameter end needs to be greater than or equal to start and both start
 * and end parameters have to be greater than 0.
 * If those conditions are not satisfied return -1 from the method to indicate
 * invalid input
 *
 * TIPS:
 * Use the remainder operator to check if the number is even
 * 1 % 2 = 1 (not an even number)
 * 2 % 2 = 0 (even number)
 * 3 % 2 = 1 (not an even number)
 * 4 % 2 = 0 (even number)
 * 5 % 2 = 1 (not an even number)
 * 6 % 2 = 0 (even number)
 *
 * Create a while loop using a counter variable
 *
 * Make sure that you call the isEvenNumber method inside the while loop
 *
 * Be careful of the end condition
 *
 * It should execute once if both start and end are the same and both are even numbers
 *
 * TIPS:
 * Use the remainder operator to check if the number is even
 * 1 % 2 = 1 (not an even number)
 * 2 % 2 = 0 (even number)
 * 3 % 2 = 1 (not an even number)
 * 4 % 2 = 0 (even number)
 * 5 % 2 = 1 (not an even number)
 * 6 % 2 = 0 (even number)
 *
 * EXAMPLE INPUT/OUTPUT:
 *
 * * sumEvenNumber(1, 100); should return 2550
 * * sumEvenNumber(-1, 100); should return -1
 * * sumEvenNumber(100, 100); should return 2550
 * * sumEvenNumber(13, 13); should return 0 since 13 is an odd number
 * * sumEvenNumber(100, -100); should return -1
 * * sumEvenNumber(100, 1000); should return 247500
 *
 * NOTE: The method sumEvenNumber needs to be defined as public static like we have been doing so far in the course
 * NOTE: Do not add a main method to solution code
 */

public class ThewhileLoopChallengeExercise {
    public static void main(String[] args) {
        System.out.println(sumEvenNumber(1, 100));
        System.out.println(sumEvenNumber(-1, 100));
        System.out.println(sumEvenNumber(100, 100));
        System.out.println(sumEvenNumber(13, 13));
        System.out.println(sumEvenNumber(100, -100));
        System.out.println(sumEvenNumber(100, 1000));
    }

    public static boolean isEvenNumber(int number) {
        if(number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int sumEvenNumber(int start, int end) {
        int sum = 0;

        if((start < 0) || (end < 0) || (end < start)) {
            return -1;
        }

        while(start <= end) {
            if(isEvenNumber(start)) {
                sum += start;
            }

            start++;
        }

        return sum;
    }

}
