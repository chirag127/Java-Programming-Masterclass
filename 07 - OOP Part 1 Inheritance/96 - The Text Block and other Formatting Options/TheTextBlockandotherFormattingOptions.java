/**
 * The Text Block and other Formatting Options
 *
 * The Text Block is a new feature in Java 13 that allows you to write a string
 * that contains multiple lines
 * without having to use the escape character (
 *
 * ) at the end of each line.
 *
 * The syntax is:
 * String textBlock = """
 * line 1
 * line 2
 * line 3
 * """;
 *
 * The Text Block is useful for writing strings that contain HTML or other
 * multi-line text.
 *
 * Java 13 also introduced the following formatting options:
 * 1. %d - to print an int value
 * 2. %f - to print a float value
 * 3. %s - to print a String value
 * 4. %n - to print a new line
 * 5. %b - to print a boolean value
 * 6. %x - to print a hexadecimal value
 * 7. %o - to print an octal value
 * 8. %e - to print a scientific notation value
 * 9. %g - to print a decimal or scientific notation value
 * 10. %c - to print a character
 *
 * The syntax is:
 * String formattedValue = String.format("the format option", value);
 *
 * For example:
 * int age = 30;
 * String formattedAge = String.format("I am %d years old.", age);
 *
 * The output will be:
 * I am 30 years old.
 */

public class TheTextBlockandotherFormattingOptions {

    public static void main(String[] args) {

        // String textBlock = """
        //         line 1
        //         line 2
        //         line 3
        //         """;

        // System.out.println(textBlock);

        int age = 30;
        String formattedAge = String.format("I am %d years old.", age);
        System.out.println(formattedAge);

        float pi = 3.14159265358979323846f;
        String formattedPi = String.format("Pi is approximately %f.", pi);
        System.out.println(formattedPi);

        String name = "John";
        String formattedName = String.format("My name is %s.", name);
        System.out.println(formattedName);

        boolean isTrue = true;
        String formattedBoolean = String.format("The value of isTrue is %b.", isTrue);
        System.out.println(formattedBoolean);

        int hexValue = 0x10;
        String formattedHexValue = String.format("The value of hexValue is %x.", hexValue);
        System.out.println(formattedHexValue);

        int octalValue = 010;
        String formattedOctalValue = String.format("The value of octalValue is %o.", octalValue);
        System.out.println(formattedOctalValue);

        double scientificNotation = 1.23456789e+3;
        String formattedScientificNotation = String.format("The value of scientificNotation is %e.",
                scientificNotation);
        System.out.println(formattedScientificNotation);

        double decimalOrScientificNotation = 1.23456789e+3;
        String formattedDecimalOrScientificNotation = String.format("The value of decimalOrScientificNotation is %g.",
                decimalOrScientificNotation);
        System.out.println(formattedDecimalOrScientificNotation);

        char letter = 'A';
        String formattedLetter = String.format("The value of letter is %c.", letter);
        System.out.println(formattedLetter);
    }

}
