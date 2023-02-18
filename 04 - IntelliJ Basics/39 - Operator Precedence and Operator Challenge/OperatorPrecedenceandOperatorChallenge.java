/*
Operator Precedence and Operator Challenge

Operator Precedence is used to determine the order of operations in an expression.

*/

class OperatorPrecedenceandOperatorChallenge {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        int e = 50;

        System.out.println(a + b * c); // 610
        System.out.println(a * b + c); // 230
        System.out.println(a + b / c); // 10
        System.out.println(a / b + c); // 30
        System.out.println(a + b % c); // 10
        System.out.println(a % b + c); // 30
        System.out.println(a + b * c / d); // 20
        System.out.println(a * b + c / d); // 230
        System.out.println(a + b * c / d % e); // 20
        System.out.println(a * b + c / d % e); // 230
    }
}