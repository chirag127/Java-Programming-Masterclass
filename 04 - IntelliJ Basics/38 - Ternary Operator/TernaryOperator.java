/*
Ternary Operator

Ternary Operator is used to assign a value to a variable based on a condition.

*/

class TernaryOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        int e = 50;

        System.out.println(a == b ? "a is equal to b" : "a is not equal to b"); // a is not equal to b
        System.out.println(b == c ? "b is equal to c" : "b is not equal to c"); // b is not equal to c
        System.out.println(c == d ? "c is equal to d" : "c is not equal to d"); // c is not equal to d
        System.out.println(d == e ? "d is equal to e" : "d is not equal to e"); // d is not equal to e
    }
}