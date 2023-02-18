/*
Casting in Java

Casting is the process of converting a variable from one data type to another.
For example, you can convert an int to a double, or a double to an int.
You can also convert a String to an int, or an int to a String.
Casting is useful when you want to perform an operation on two variables of different data types.
For example, you can add an int and a double,
but you must cast the int to a double before you can perform the addition.
You can cast a variable using the following syntax:
(type) variable

The following code shows how to cast a double to an int:
double myDouble = 9.78;
int myInt = (int) myDouble; // Manual casting: double to int

You can also cast a double to an int using the Math.round() method:
double myDouble = 9.78;
int myInt = (int) Math.round(myDouble);

The following code shows how to cast an int to a double:
int myInt = 9;
double myDouble = myInt; // Automatic casting: int to double

The following code shows how to cast a String to an int:
String myString = "9";
int myInt = Integer.parseInt(myString); // Casting String to int

The following code shows how to cast a String to a double:
String myString = "9.78";
double myDouble = Double.parseDouble(myString); // Casting String to double

The following code shows how to cast an int to a String:
int myInt = 9;
String myString = Integer.toString(myInt); // Casting int to String

The following code shows how to cast a double to a String:
double myDouble = 9.78;
String myString = Double.toString(myDouble); // Casting double to String

*/
class CastinginJava {
    public static void main(String args[]) {
        // Casting a double to an int
        double myDouble = 9.78;
        int myInt = (int) myDouble; // Manual casting: double to int
        System.out.println(myDouble);   // Outputs 9.78
        System.out.println(myInt);      // Outputs 9
        // Casting a double to an int using the Math.round() method
        double mySecondNumber = 9.78;
        int mySecondInt = (int) Math.round(mySecondNumber);

        System.out.println(mySecondNumber);   // Outputs 9.78

        // casting large numbers to a byte
        byte myByte = 127;
        int myIntForByte = 10000;
        byte myNewByte = (byte) (myByte + myIntForByte);
        System.out.println(myNewByte);

        // casting a String to an int
        String myString = "9";
        int myIntForString = Integer.parseInt(myString); // Casting String to int

        System.out.println(myIntForString);


    }

}
