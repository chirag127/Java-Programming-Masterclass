/** The StringBuilder class
 *
 * The StringBuilder class is used to create mutable (modifiable) strings.
 *
 * The StringBuilder class is a mutable sequence of characters.
 *
 * The StringBuilder class is provided in the java.lang package.
 *
 * The StringBuilder class is a peer class of the String class.
 *
 * The StringBuilder class is designed for use as a drop-in replacement for
 * StringBuffer in places where the string buffer was being used by a single
 * thread (as is generally the case). Where possible, it is recommended that
 * this class be used in preference to StringBuffer as it will be faster under
 * most implementations.
 *
 * The StringBuilder class is similar to the StringBuffer class except that
 * the StringBuilder class is not thread safe.
 *
 * The StringBuilder class has the same methods as the StringBuffer class.
 *
 * The StringBuilder class is a mutable sequence of characters.
 *
 */

public class TheStringBuilderclass {

    public static void main(String[] args) {

        // 1. create a StringBuilder object
        StringBuilder sb = new StringBuilder();

        // 2. append() method
        sb.append("Hello");
        sb.append(" ");
        sb.append("World");
        System.out.println(sb);

        // 3. insert() method
        sb.insert(5, "Java");
        System.out.println(sb);

        // 4. delete() method
        sb.delete(5, 9);
        System.out.println(sb);

        // 5. reverse() method
        sb.reverse();
        System.out.println(sb);

        // 6. setCharAt() method
        sb.setCharAt(0, 'J');
        System.out.println(sb);

        // 7. setLength() method
        sb.setLength(5);
        System.out.println(sb);

        // 8. toString() method
        String str = sb.toString();
        System.out.println(str);

        // 9. capacity() method
        System.out.println(sb.capacity());

        // 10. ensureCapacity() method
        sb.ensureCapacity(100);
        System.out.println(sb.capacity());

        // 11. trimToSize() method
        sb.trimToSize();
        System.out.println(sb.capacity());

        // 12. length() method
        System.out.println(sb.length());

        // 13. charAt() method
        System.out.println(sb.charAt(0));

        // 14. indexOf() method
        System.out.println(sb.indexOf("J"));

        // 15. lastIndexOf() method
        System.out.println(sb.lastIndexOf("J"));

        // 16. substring() method
        System.out.println(sb.substring(0, 2));

        // 17. codePointAt() method
        System.out.println(sb.codePointAt(0));

        // 18. codePointBefore() method
        System.out.println(sb.codePointBefore(2));

        // 19. codePointCount() method
        System.out.println(sb.codePointCount(0, 2));

        // 20. offsetByCodePoints() method
        System.out.println(sb.offsetByCodePoints(0, 2));

        // 21. getChars() method
        char[] chars = new char[2];
        sb.getChars(0, 2, chars, 0);
        System.out.println(chars);

        // 22. setCharAt() method
        sb.setCharAt(0, 'H');
        System.out.println(sb);

        // 23. setLength() method
        sb.setLength(2);
        System.out.println(sb);

    }

}

// Output:
// Append method:
// Hello World
// Insert method:
// HelloJava World
// Delete method:
// Hello World
// Reverse method:
// dlroW olleH
// SetCharAt method:
// JlroW olleH
// SetLength method:
// Jlro
// toString method:
// Jlro
// Capacity method:
// 16
// EnsureCapacity method:
// 100
// TrimToSize method:
// 4
// Length method:
// 4
// CharAt method:
// J
// IndexOf method:
// 0
// LastIndexOf method:
// 0
// Substring method:
// Jl
// CodePointAt method:
// 74
// CodePointBefore method:
// 108
// CodePointCount method:
// 2
// OffsetByCodePoints method:
// 2
// GetChars method:
// [Jl]
// SetCharAt method:
// Hlro
// SetLength method:
// Hl

