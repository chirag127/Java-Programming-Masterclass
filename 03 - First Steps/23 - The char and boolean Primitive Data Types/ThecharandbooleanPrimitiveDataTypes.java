/*
The char and boolean Primitive Data Types

The char and boolean data types are not numeric types.

the char is a single 16-bit Unicode character.
It has a minimum value of '\u0000' (or 0) and
a maximum value of '\uffff' (or 65,535 inclusive).

it is a single 16-bit Unicode character.

why use the char type instead of the string type?

1. The char type is used to represent a character.
2. The string type is used to represent a sequence of characters.
3. The char type is a primitive type.
4. The string type is a reference type.
5. The char type is a single 16-bit Unicode character.
6. The string type is a sequence of characters.
7. The char type has a minimum value of '\u0000' (or 0) and
a maximum value of '\uffff' (or 65,535 inclusive).
8. The string type has a minimum value of "" (or 0) and
a maximum value of "" (or 65,535 inclusive).


go to unicode table
https://unicode-table.com/en/

we can see that the character 'a' is 97 in decimal
and 61 in hexadecimal

so we can use the char type to represent the character 'a'

char c = 'a';

"D" is "/u0044"
"e" is "/u0065"
"l" is "/u006c"
"i" is "/u0069"
"t" is "/u0074"
"e" is "/u0065"
"d" is "/u0064"

char c = '\u0044';
System.out.println(c);
*abstract

*/

public class ThecharandbooleanPrimitiveDataTypes {
    public static void main(String[] args) {
        char myChar = 'D';
        char myUnicodeChar = '\u0044';
        System.out.println(myChar);
        System.out.println(myUnicodeChar);
        char myCopyRightChar = '\u00A9';
        System.out.println(myCopyRightChar);
        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;
        boolean isCustomerOverTwentyOne = true;

        System.out.println(myTrueBooleanValue);
        System.out.println(myFalseBooleanValue);
        System.out.println(isCustomerOverTwentyOne);
    }
}
