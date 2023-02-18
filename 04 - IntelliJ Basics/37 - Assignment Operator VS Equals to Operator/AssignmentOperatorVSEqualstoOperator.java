/*
Assignment Operator VS Equals to Operator

Assignment Operator is used to assign a value to a variable.
Equals to Operator is used to compare two values.

*/

class AssignmentOperatorVSEqualstoOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        int e = 50;

        System.out.println(a == b); // false
        System.out.println(b == c); // false
        System.out.println(c == d); // false
        System.out.println(d == e); // false

        System.out.println(a = b); // 20
        System.out.println(b = c); // 30
        System.out.println(c = d); // 40
        System.out.println(d = e); // 50
    }
}
