/** Another Look at the String
 *
 * 1. String has more than
 * 60 methods
 * 2. String is immutable
 * index starts from 0
 * 3. String is a class
 * The categories of string methods are:
 * 1. String inspection methods
 * 2. String comparison methods
 * 3. String manipulation methods
 *
 * 1. String inspection methods
 * 1.1. length()
 * 1.2. isEmpty()
 * 1.3. charAt()
 * 1.4. codePointAt()
 * 1.5. codePointBefore()
 * 1.6. codePointCount()
 * 1.7. offsetByCodePoints()
 * 1.8. getChars()
 * 1.9. getBytes()
 * 1.10. toCharArray()
 * 1.11. equals()
 * 1.12. equalsIgnoreCase()
 * 1.13. compareTo()
 * 1.14. compareToIgnoreCase()
 * 1.15. regionMatches()
 * 1.16. startsWith()
 * 1.17. endsWith()
 * 1.18. indexOf()
 * 1.19. lastIndexOf()
 * 1.20. substring()
 * 1.21. subSequence()
 * 1.22. concat()
 * 1.23. replace()
 * 1.24. matches()
 * 1.25. contains()
 * 1.26. split()
 * 1.27. join()
 * 1.28. toLowerCase()
 * 1.29. toUpperCase()
 * 1.30. trim()
 * 1.31. strip()
 * 1.32. stripLeading()
 * 1.33. stripTrailing()
 * 1.34. repeat()
 * 1.35. format()
 * 1.36. valueOf()
 * 1.37. intern()
 * 1.38. toString()
 *
 * 2. String comparison methods
 * 2.1. equals()
 * 2.2. equalsIgnoreCase()
 * 2.3. compareTo()
 * 2.4. compareToIgnoreCase()
 * 2.5. regionMatches()
 * 2.6. startsWith()
 * 2.7. endsWith()
 * 2.8. indexOf()
 * 2.9. lastIndexOf()
 *
 * 3. String manipulation methods
 * 3.1. concat()
 * 3.2. replace()
 * 3.3. matches()
 * 3.4. contains()
 * 3.5. split()
 * 3.6. join()
 * 3.7. toLowerCase()
 * 3.8. toUpperCase()
 * 3.9. trim()
 * 3.10. strip()
 * 3.11. stripLeading()
 * 3.12. stripTrailing()
 * 3.13. repeat()
 * 3.14. format()
 * 3.15. valueOf()
 *
 */


public class AnotherLookattheString {

    public static void main(String[] args) {

        String str = "Hello World";

        // 1.1. length()
        System.out.println(str.length());

        // 1.2. isEmpty()
        System.out.println(str.isEmpty());

        // 1.3. charAt()
        System.out.println(str.charAt(0));

        // 1.4. codePointAt()
        System.out.println(str.codePointAt(0));

        // 1.5. codePointBefore()
        System.out.println(str.codePointBefore(1));

        // 1.6. codePointCount()
        System.out.println(str.codePointCount(0, 5));

        // 1.7. offsetByCodePoints()
        System.out.println(str.offsetByCodePoints(0, 5));

        // 1.8. getChars()
        char[] chars = new char[5];
        str.getChars(0, 5, chars, 0);
        System.out.println(chars);

        // 1.9. getBytes()
        byte[] bytes = str.getBytes();
        System.out.println(bytes);

        // 1.10. toCharArray()
        char[] chars1 = str.toCharArray();
        System.out.println(chars1);

        // 1.11. equals()
        System.out.println(str.equals("Hello World"));

        // 1.12. equalsIgnoreCase()
        System.out.println(str.equalsIgnoreCase("hello world"));

        // 1.13. compareTo()
        System.out.println(str.compareTo("Hello World"));

        // 1.14. compareToIgnoreCase()
        System.out.println(str.compareToIgnoreCase("hello world"));

        // 1.15. regionMatches()
        System.out.println(str.regionMatches(0, "Hello World", 0, 5));

        // 1.16. startsWith()
        System.out.println(str.startsWith("Hello"));

        // 1.17. endsWith()
        System.out.println(str.endsWith("World"));

        // 1.18. indexOf()
        System.out.println(str.indexOf("o"));

        // 1.19. lastIndexOf()
        System.out.println(str.lastIndexOf("o"));

        // 1.20. substring()
        System.out.println(str.substring(0, 5));

        // 1.21. subSequence()
        System.out.println(str.subSequence(0, 5));

        // 1.22. concat()
        System.out.println(str.concat("!!!"));

        // 1.23. replace()
        System.out.println(str.replace('o', 'a'));

        // 1.24. matches()
        System.out.println(str.matches("Hello World"));

        // 1.25. contains()
        System.out.println(str.contains("o"));

        // 1.26. split()
        String[] strings = str.split(" ");
        System.out.println(strings);

        // 1.27. join()
        System.out.println(String.join("-", strings));

        // 1.28. toLowerCase()
        System.out.println(str.toLowerCase());

        // 1.29. toUpperCase()
        System.out.println(str.toUpperCase());

        // 1.30. trim()
        System.out.println("    Hello World     ".trim());

        // 1.31. strip()
        System.out.println("    Hello World     ".strip());

        // 1.32. stripLeading()
        System.out.println("    Hello World     ".stripLeading());

        // 1.33. stripTrailing()
        System.out.println("    Hello World     ".stripTrailing());

        // 1.34. repeat()
        System.out.println("Hello World ".repeat(3));

        // 1.35. format()
        String name = "John";
        String surname = "Doe";
        int age = 30;
        System.out.println(String.format("Name: %s, Surname: %s, Age: %d", name, surname, age));

        // 1.36. valueOf()
        System.out.println(String.valueOf(123));

        // 1.37. intern()
        System.out.println(str.intern());

        // 1.38. toString()
        System.out.println(str.toString());

        // 2.1. equals()
        System.out.println(str.equals("Hello World"));

        // 2.2. equalsIgnoreCase()
        System.out.println(str.equalsIgnoreCase("hello world"));

        // 2.3. compareTo()
        System.out.println(str.compareTo("Hello World"));

        // 2.4. compareToIgnoreCase()
        System.out.println(str.compareToIgnoreCase("hello world"));

        // 2.5. regionMatches()
        System.out.println(str.regionMatches(0, "Hello World", 0, 5));

        // 2.6. startsWith()
        System.out.println(str.startsWith("Hello"));

        // 2.7. endsWith()
        System.out.println(str.endsWith("World"));

        // 2.8. indexOf()
        System.out.println(str.indexOf("o"));

        // 2.9. lastIndexOf()
        System.out.println(str.lastIndexOf("o"));

        // 3.1. concat()
        System.out.println(str.concat("!!!"));

        // 3.2. replace()
        System.out.println(str.replace('o', 'a'));

        // 3.3. matches()
        System.out.println(str.matches("Hello World"));

        // 3.4. contains()
        System.out.println(str.contains("o"));

        // 3.5. split()
        String[] strings1 = str.split(" ");
        System.out.println(strings1);

        // 3.6. join()
        System.out.println(String.join("-", strings1));

        // 3.7. toLowerCase()
        System.out.println(str.toLowerCase());

        // 3.8. toUpperCase()
        System.out.println(str.toUpperCase());

        // 3.9. trim()
        System.out.println("    Hello World     ".trim());

        // 3.10. strip()
        System.out.println("    Hello World     ".strip());

        // 3.11. stripLeading()
        System.out.println("    Hello World     ".stripLeading());

        // 3.12. stripTrailing()
        System.out.println("    Hello World     ".stripTrailing());

        // 3.13. repeat()
        System.out.println("Hello World ".repeat(3));

        // 3.14. format()
        String name1 = "John";
        String surname1 = "Doe";
        int age1 = 30;
        System.out.println(String.format("Name: %s, Surname: %s, Age: %d", name1, surname1, age1));

        // 3.15. valueOf()
        System.out.println(String.valueOf(123));

    }

}

// output
// 1.1. length()
// 11
// 1.2. isEmpty()
// false
// 1.3. charAt()
// H
// 1.4. codePointAt()
// 72
// 1.5. codePointBefore()
// 72
// 1.6. codePointCount()
// 11
// 1.7. offsetByCodePoints()
// 1
// 1.8. getChars()
// Hello World
// 1.9. getBytes()
// [B@1b6d3586
// 1.10. toCharArray()
// Hello World
// 1.11. equals()
// true
// 1.12. equalsIgnoreCase()
// true
// 1.13. compareTo()
// 0
// 1.14. compareToIgnoreCase()
// 0
// 1.15. regionMatches()
// true
// 1.16. startsWith()
// true
// 1.17. endsWith()
// true
// 1.18. indexOf()
// 4
// 1.19. lastIndexOf()
// 7
// 1.20. substring()
// Hello
// 1.21. subSequence()
// Hello
// 1.22. concat()
// Hello World!!!
// 1.23. replace()
// Hell World
// 1.24. matches()
// true
// 1.25. contains()
// true
// 1.26. split()
// [Ljava.lang.String;@4554617c
// 1.27. join()
// Hello-World
// 1.28. toLowerCase()
// hello world
// 1.29. toUpperCase()
// HELLO WORLD
// 1.30. trim()
// Hello World
// 1.31. strip()
// Hello World
// 1.32. stripLeading()
// Hello World
// 1.33. stripTrailing()
// Hello World
// 1.34. repeat()
// Hello World Hello World Hello World
// 1.35. format()
// Name: John, Surname: Doe, Age: 30
// 1.36. valueOf()
// 123
// 1.37. intern()
// Hello World
// 1.38. toString()
// Hello World
// 2.1. equals()
// true
// 2.2. equalsIgnoreCase()
// true
// 2.3. compareTo()
// 0
// 2.4. compareToIgnoreCase()
// 0
// 2.5. regionMatches()
// true
// 2.6. startsWith()
// true
// 2.7. endsWith()
// true
// 2.8. indexOf()
// 4
// 2.9. lastIndexOf()
// 7
// 3.1. concat()
// Hello World!!!
// 3.2. replace()
// Hell World
// 3.3. matches()
// true
// 3.4. contains()
// true
// 3.5. split()
// [Ljava.lang.String;@74a14482
// 3.6. join()
// Hello-World
// 3.7. toLowerCase()
// hello world
// 3.8. toUpperCase()
// HELLO WORLD
// 3.9. trim()
// Hello World
// 3.10. strip()
// Hello World
// 3.11. stripLeading()
// Hello World
// 3.12. stripTrailing()
// Hello World
// 3.13. repeat()
// Hello World Hello World Hello World
// 3.14. format()
// Name: John, Surname: Doe, Age: 30
// 3.15. valueOf()
// 123
