/*
byte short long and width

The following code shows how to declare and initialize variables of the primitive types:

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

The 0x and 0b prefixes indicate that the value is a hexadecimal or binary literal respectively. The p and P suffixes indicate that the value is a power of 2. The f and F suffixes indicate that the value is a float literal, and the d and D suffixes indicate that the value is

a double literal. The suffixes are not necessary for integral literals (byte, short, int, and long).


make a table

Data Type	Size (bits)	Range
byte	8	-128 to 127
short	16	-32,768 to 32,767
int	32	-2,147,483,648 to 2,147,483,647
long	64	-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

The following code shows how to declare and initialize variables of the primitive types using underscores in the literals:
*/



class PrimitiveTypes {
    public static void main(String[] args) {
        byte minByteValue = Byte.MIN_VALUE;
        byte maxByteValue = Byte.MAX_VALUE;
        System.out.println("minByteValue = " + minByteValue);
        System.out.println("maxByteValue = " + maxByteValue);

        short minShortValue = Short.MIN_VALUE;
        short maxShortValue = Short.MAX_VALUE;
        System.out.println("minShortValue = " + minShortValue);
        System.out.println("maxShortValue = " + maxShortValue);

        int minIntValue = Integer.MIN_VALUE;
        int maxIntValue = Integer.MAX_VALUE;
        System.out.println("minIntValue = " + minIntValue);
        System.out.println("maxIntValue = " + maxIntValue);

        long minLongValue = Long.MIN_VALUE;
        long maxLongValue = Long.MAX_VALUE;
        System.out.println("minLongValue = " + minLongValue);
        System.out.println("maxLongValue = " + maxLongValue);

        int myTotal = (minIntValue / 2);
        byte myNewByteValue = (byte) (minByteValue / 2);
        short myNewShortValue = (short) (minShortValue / 2);


        System.out.println("myTotal = " + myTotal);
        System.out.println("myNewByteValue = " + myNewByteValue);
        System.out.println("myNewShortValue = " + myNewShortValue);




    }
}