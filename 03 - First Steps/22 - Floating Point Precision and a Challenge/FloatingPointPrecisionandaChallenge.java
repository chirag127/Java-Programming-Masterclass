/*
Floating Point Precision and a Challenge

the challenge is to write a method called
calcFeetAndInchesToCentimeters
that has two parameters.
One of type feet of type double
and the other of type inches of type double.
You should validate that the first parameter feet is >= 0
and the second parameter inches is >= 0 and <= 12.

*/

class FloatingPointPrecisionandaChallenge {
    public static void main(String args[]) {
        // Casting a double to an int
        double myDouble = 9.78;
        int myInt = (int) myDouble; // Manual casting: double to int
        System.out.println(myDouble); // Outputs 9.78
        System.out.println(myInt); // Outputs 9
        // Casting a double to an int using the Math.round() method
        double mySecondNumber = 9.78;
        int mySecondInt = (int) Math.round(mySecondNumber);

        System.out.println(mySecondInt); // Outputs 10

        System.out.println(mySecondNumber); // Outputs 9.78

        // casting large numbers to a byte
        byte myByte = 127;
        int myIntForByte = 10000;
        byte myNewByte = (byte) (myByte + myIntForByte);
        System.out.println(myNewByte);

        // casting a String to an int
        String myString = "9";
        int myIntForString = Integer.parseInt(myString); // Casting String to int

        System.out.println(myIntForString);

        // casting a String to a double
        String mySecondString = "9.78";
        double myDoubleForString = Double.parseDouble(mySecondString); // Casting String to double

        System.out.println(myDoubleForString);

        // casting an int to a String
        int myIntForString2 = 9;
        String myStringForInt = Integer.toString(myIntForString2); // Casting int to String

        System.out.println(myStringForInt);

        // casting a double to a String
        double myDoubleForString2 = 9.78;
        String myStringForDouble = Double.toString(myDoubleForString2); // Casting double to String

        System.out.println(myStringForDouble);

        // casting a double to a String
        double myDoubleForString3 = 9.78;
        String myStringForDouble2 = String.valueOf(myDoubleForString3); // Casting double to String

        System.out.println(myStringForDouble2);

        // casting a String to a double
        String mySecondString2 = "9.78";
        double myDoubleForString4 = Double.valueOf(mySecondString2); // Casting String to double

        System.out.println(myDoubleForString4);

        // casting a String to a double using the parseDouble() method

        System.out.println(Double.parseDouble(mySecondString2));

    }

}
