/** String Manipulation Methods
 *
 * There are many methods that can be used to manipulate strings. Some of these methods are
 *
 * String toLowerCase() - Converts a string to all lower case characters
 * String toUpperCase() - Converts a string to all upper case characters
 * String trim() - Removes leading and trailing spaces from a string
 * String replace(char oldChar, char newChar) - Replaces all instances of
 * oldChar in the string with newChar
 * String replace(CharSequence target, CharSequence replacement) - Replaces
 * all instances of target in the string with replacement
 * String replaceAll(String regex, String replacement) - Replaces all
 * instances of regex in the string with replacement
 * String replaceFirst(String regex, String replacement) - Replaces the first
 * instance of regex in the string with replacement
 * String concat(String string) - Concatenates string to the end of the string
 * String join(CharSequence delimiter, CharSequence... elements) - Concatenates
 * the elements of the elements array using the delimiter between each element
 * String[] split(String regex) - Splits the string into an array of strings
 * using regex as the delimiter
 * boolean matches(String regex) - Returns true if the string matches the
 * regular expression regex
 * boolean contains(CharSequence s) - Returns true if the string contains
 * the sequence of characters specified by s
 * String strip() - Returns a string with leading and trailing whitespace
 * removed
 * String stripLeading() - Returns a string with leading whitespace removed
 * String stripTrailing() - Returns a string with trailing whitespace removed
 * String repeat(int count) - Returns a string that is a copy of the original
 * string repeated count times
 * static String format(String format, Object... args) - Returns a string
 * formatted using the specified format string and arguments
 * static String valueOf(Object obj) - Returns a string representation of
 * the object obj
 */

public class StringManipulationMethods {

    public static void main(String[] args) {

        String str = "Hello World";

        // 3.1. concat()
        System.out.println(str.concat("!!!"));

        // 3.2. replace()
        System.out.println(str.replace('o', 'a'));
        System.out.println(str.replace("World", "Universe"));

        // 3.3. matches()
        System.out.println(str.matches("Hello World"));
        System.out.println(str.matches("Hello Universe"));

        // 3.4. contains()
        System.out.println(str.contains("Hello"));
        System.out.println(str.contains("Universe"));

        // 3.5. split()
        String[] strings = str.split(" ");
        for (String s : strings) {
            System.out.println(s);
        }

        // 3.6. join()
        System.out.println(String.join(" ", strings));

        // 3.7. toLowerCase()
        System.out.println(str.toLowerCase());

        // 3.8. toUpperCase()
        System.out.println(str.toUpperCase());

        // 3.9. trim()
        System.out.println("   Hello World   ".trim());

        // 3.10. strip()
        System.out.println("   Hello World   ".strip());

        // 3.11. stripLeading()
        System.out.println("   Hello World   ".stripLeading());

        // 3.12. stripTrailing()
        System.out.println("   Hello World   ".stripTrailing());

        // 3.13. repeat()
        System.out.println(str.repeat(3));

        // 3.14. format()
        System.out.println(String.format("The value of pi is %.2f", Math.PI));

        // 3.15. valueOf()
        System.out.println(String.valueOf(Math.PI));
    }

}
