/*
Logical AND Operator

The logical AND operator is represented by &&. It is used to combine two boolean expressions. The result of the expression is true only if both the expressions are true. Otherwise, the result is false.

if (condition1 && condition2) {
    // code to be executed if condition1 and condition2 are true
}
*/


public class LogicalANDOperator {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        if (x < 20 && y == 20) {
            System.out.println("This is if statement");
        }
    }
}

