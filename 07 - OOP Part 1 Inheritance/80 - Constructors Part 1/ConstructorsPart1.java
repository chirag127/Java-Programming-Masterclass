/** Constructors Part 1
 * Constructors are special methods that are called when an object is created.
 * The syntax of a constructor is:
 *      public <class-name>() {
 *          <statements>
 *      }
 * For example, a constructor for a class named Person would be:
 *      public Person() {
 *          <statements>
 *      }
 * A constructor is like a normal method except that it has no return type.
 * A constructor is used to initialize an object.
 * The constructor is public, so it can be called from anywhere.
 * The constructor is called when the new keyword is used to create an object.
 * A constructor is a public method that initializes an object.
 * The syntax of a constructor is:
 *      public <class-name>() {
 *          <statements>
 *      }
 */

public class ConstructorsPart1 {
    private String number;
    private String name;

    public ConstructorsPart1(String number, String name) {
        this.number = number;
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }
}
