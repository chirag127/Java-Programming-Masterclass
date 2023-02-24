/** Classes Using Setters and Creating Objects
 *
 * Setters are methods that set the value of a field.
 *
 * A setter method is a method that sets the value of a field.
 * The syntax of a setter method is:
 *      public void set<field-name>(<field-type> <field-name>) {
 *          this.<field-name> = <field-name>;
 *      }
 *
 * For example, a setter method for a field named mHeight of type double
 * would be:
 *      public void setHeight(double height) {
 *          mHeight = height;
 *      }
 *
 * A setter method is like a normal method except that it has a parameter.
 * It also has a void return type.
 *
 * A setter method is used to set the value of a private field.
 * The setter method is public, so it can be called from anywhere.
 * The setter method calls the private field, so it can set its value.
 *
 * A setter method is a public method that sets the value of a private field.
 * The syntax of a setter method is:
 *      public void set<field-name>(<field-type> <field-name>) {
 *          this.<field-name> = <field-name>;
 *      }
 */

public class ClassesUsingSettersandCreatingObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("John");
        person1.setAge(20);
        System.out.println(person1.getName());
        System.out.println(person1.getAge());
    }

}

class Person {
    private String mName;
    private int mAge;

    public void setName(String name) {
        mName = name;
    }

    public String getName() {
        return mName;
    }

    public void setAge(int age) {
        mAge = age;
    }

    public int getAge() {
        return mAge;
    }
}
