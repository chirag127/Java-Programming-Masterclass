/** Static vs Instance variables
 *
 * 1. Static variables are variables that belong to the class, not to an instance of the class.
 * 2. Instance variables are variables that belong to an instance of the class.
 * 3. Static variables can be accessed without creating an instance of the class.
 * 4. Instance variables can only be accessed after creating an instance of the class.
 * 5. Static variables can only be accessed using the class name.
 * 6. Instance variables can only be accessed using an instance of the class.
 */


public class StaticvsInstanceVariables {

    public static void main(String[] args) {

        StaticvsInstanceVariables staticvsInstanceVariables = new StaticvsInstanceVariables();
        System.out.println(staticvsInstanceVariables.name);
        System.out.println(staticvsInstanceVariables.age);

        System.out.println(StaticvsInstanceVariables.nameStatic);
        System.out.println(StaticvsInstanceVariables.ageStatic);

    }

    private String name;
    private int age;

    private static String nameStatic;
    private static int ageStatic;

}

/** Output:
 * null
 * 0
 * null
 * 0
 */
