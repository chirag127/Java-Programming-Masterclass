/**
 * Create a for statement using a range of numbers from 1 to 1000 inclusive.
 * Sum all the numbers that can be divided with both 3 and also with 5.
 * For those numbers that met the above conditions, print out the number.
 * break out of the loop once you find 5 numbers that met the above conditions.
 * After breaking out of the loop print the sum of the numbers that met the above conditions.
 *
 * Note: Type all code in main method
 *
 * HINT: Use the % operator
 */

/**
 * The following class prints out the first 5 numbers that are divisible by 3 and 5 and then prints out the
 * sum of those numbers
 */
public class Sum3and5ChallengeAndUsingIntelliJsDebugger {
    // The main method.
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;

        for(int i=1; i<=1000; i++) {
            if((i % 3 == 0) && (i % 5 == 0)) {
                count++;
                sum += i;
                System.out.println("Found number = " + i);
            }

            if(count == 5) {
                break;
            }
        }

        System.out.println("Sum = " + sum);
    }

}


/*
 * vs code debuger
 * https://code.visualstudio.com/docs/editor/debugging
 * https://code.visualstudio.com/docs/java/java-debugging
 * press F5 to start debuger
 *
 */

 /*
debuger result if we use break point by changing the code to printn instead of println
3and5ChallengeAndUsingIntelliJsDebugger
Exception in thread "main" java.lang.Error: Unresolved compilation problem:
        The method printn(String) is undefined for the type PrintStream

        at Sum3and5ChallengeAndUsingIntelliJsDebugger.main(Sum3and5ChallengeAndUsingIntelliJsDebugger.java:27)
while normal run it will print
Sum3and5ChallengeAndUsingIntelliJsDebugger.java:27: error: cannot find symbol
                System.out.printn("Found number = " + i);
                          ^
  symbol:   method printn(String)
  location: variable out of type PrintStream
1 error



we can stop on the break point by using the debuger and then we can step into the code and see the value of the variables



*/