/*
Primitive Types Recap and the String Data Type

The primitive data types are
1. byte
2. short
3. int
4. long
5. float
6. double
7. boolean
8. char

The byte data type is an 8-bit signed two's complement integer.
It has a minimum value of -128 and a maximum value of 127 (inclusive).
The byte data type can be useful for saving memory in large arrays,
where the memory savings actually matters.
They can also be used in place of int where their limits help to
clarify your code;
the fact that a variable's range is limited can serve as a form of
documentation.

The short data type is a 16-bit signed two's complement integer.
It has a minimum value of -32,768 and a maximum value of 32,767 (inclusive).
As with byte, the same guidelines apply: you can use a short to save memory
in large arrays, in situations where the memory savings actually matters.


*/

class PrimitiveTypesRecapandtheStringDataType {
    public static void main(String[] args) {
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);
        System.out.println("Busted MAX value = " + (myMaxByteValue + 1));
        System.out.println("Busted MIN value = " + (myMinByteValue - 1));

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);
        System.out.println("Busted MAX value = " + (myMaxShortValue + 1));
        System.out.println("Busted MIN value = " + (myMinShortValue - 1));

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Int Minimum Value = " + myMinIntValue);
        System.out.println("Int Maximum Value = " + myMaxIntValue);
        System.out.println("Busted MAX value = " + (myMaxIntValue + 1));
        System.out.println("Busted MIN value = " + (myMinIntValue - 1));

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);
        System.out.println("Busted MAX value = " + (myMaxLongValue + 1));
        System.out.println("Busted MIN value = " + (myMinLongValue - 1));

        int myTotal = (myMinIntValue / 2);
        byte myNewByteValue = (byte) (myMinByteValue / 2);
        short myNewShortValue = (short) (myMinShortValue / 2);

        System.out.println("myTotal = " + myTotal);
        System.out.println("myNewByteValue = " + myNewByteValue);
        System.out.println("myNewShortValue = " + myNewShortValue);

    }
}
