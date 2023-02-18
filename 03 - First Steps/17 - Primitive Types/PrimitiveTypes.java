/*
Primitive Types

Primitive types are the most basic data types in Java. They are the building blocks of all other data types. There are eight primitive types in Java:

byte
short
int
long
float
double
boolean
char

The byte, short, int, and long types are used to represent whole numbers. The byte type is an 8-bit signed two's complement integer. It has a minimum value of -128 and a maximum value of 127 (inclusive). The short type is a 16-bit signed two's complement integer. It has a minimum value of -32,768 and a maximum value of 32,767 (inclusive). The int type is a 32-bit signed two's complement integer. It has a minimum value of -2^31 and a maximum value of 2^31-1 (inclusive). The long type is a 64-bit signed two's complement integer. It has a minimum value of -2^63 and a maximum value of 2^63-1 (inclusive). The float type is a single-precision 32-bit IEEE 754 floating point. The double type is a double-precision 64-bit IEEE 754 floating point. The boolean type has only two possible values: true and false. The char type is a single 16-bit Unicode character. It has a minimum value of '\u0000' (or 0) and a maximum value of '\uffff' (or 65,535 inclusive).

The default value for all the numeric types is 0. The default value for the boolean type is false. The default value for the char type is '\u0000' (or 0).

The following code shows how to declare and initialize variables of the primitive types:

byte b = 1;
short s = 1;
int i = 1;
long l = 1L;
float f = 1.0f;
double d = 1.0d;
boolean bool = true;
char c = 'a';

The L and l suffixes indicate that the value is a long literal, the f and F suffixes indicate that the value is a float literal, and the d and D suffixes indicate that the value is a double literal. The suffixes are not necessary for integral literals (byte, short, int, and long).

The following code shows how to declare and initialize variables of the primitive types in hexadecimal and binary format:

byte b = 0x1; // Hexadecimal for 1
short s = 0x1; // Hexadecimal for 1
int i = 0x1; // Hexadecimal for 1
long l = 0x1L; // Hexadecimal for 1
float f = 0x1p1f; // Hexadecimal for 1 * 2^1
double d = 0x1p1; // Hexadecimal for 1 * 2^1
boolean bool = true;
char c = 0x61; // Hexadecimal for 97

byte b = 0b1; // Binary for 1
short s = 0b1; // Binary for 1
int i = 0b1; // Binary for 1
long l = 0b1L; // Binary for 1
float f = 0b1.0p1f; // Binary for 1.0 * 2^1
double d = 0b1.0p1; // Binary for 1.0 * 2^1
boolean bool = true;
char c = 0b1100001; // Binary for 97

The 0x and 0b prefixes indicate that the value is a hexadecimal or binary literal respectively. The p and P suffixes indicate that the value is a power of 2. The f and F suffixes indicate that the value is a float literal, and the d and D suffixes indicate that the value is a double literal. The suffixes are not necessary for integral literals (byte, short, int, and long).

The following code shows how to declare and initialize variables of the primitive types using underscores in the literals:

byte b = 1_000_000;
short s = 1_000_000;
int i = 1_000_000;
long l = 1_000_000L;
float f = 1_000_000.0f;
double d = 1_000_000.0d;
boolean bool = true;
char c = 'a';

The _ character is allowed between digits in a number. It is ignored by the compiler. This feature is useful when you want to separate groups of digits in numeric literals to make large numeric values more readable.
*/

/*


minIntValue = -2147483648

maxIntValue = 2147483647

minByteValue = -128


*/

class PrimitiveTypes {
    public static void main(String args[]) {
        byte b = 1;
        short s = 1;
        int i = 1;
        long l = 1L;
        float f = 1.0f;
        double d = 1.0d;
        boolean bool = true;
        char c = 'a';
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(bool);
        System.out.println(c);

        int minIntValue = Integer.MIN_VALUE;
        int maxIntValue = Integer.MAX_VALUE;
        System.out.println("minIntValue = " + minIntValue);
        System.out.println("maxIntValue = " + maxIntValue);

        System.out.println("Busted MAX value = " + (maxIntValue + 1));

        System.out.println("Busted MIN value = " + (minIntValue - 1));

        System.out.println("range of int = " + (maxIntValue - minIntValue));

        System.out.println("maxIntValue + 1 = " + (maxIntValue + 1));

    }
}
