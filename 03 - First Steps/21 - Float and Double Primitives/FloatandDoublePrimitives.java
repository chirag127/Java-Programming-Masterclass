/*
Float and Double Primitives

Float and double are two of the eight primitive types in Java.
The float and double types are used to represent floating-point numbers.
The float type is a single-precision 32-bit IEEE 754 floating point.
The double type is a double-precision 64-bit IEEE 754 floating point.

The default value for the float and double types is 0.0.
The float type is never used as a default for generic numbers
because it is not as precise as double.

The following code shows how to declare and initialize variables of the float and double types:
*/

class FloatandDoublePrimitives {
    public static void main(String[] args) {
        float f = 1.0f;
        double d = 1.0d;
        System.out.println("f = " + f);
        System.out.println("d = " + d);
    }
}