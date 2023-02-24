/** Static vs Instance Methods
 *
 * 1. Static methods are methods that belong to the class, not to an instance of the class.
 * 2. Instance methods are methods that belong to an instance of the class.
 * 3. Static methods can be called without creating an instance of the class.
 * 4. Instance methods can only be called after creating an instance of the class.
 * 5. Static methods can only access static variables.
 * 6. Instance methods can access both static and instance variables.
 */


 public class StaticvsInstanceMethods {

    public static void main(String[] args) {

        StaticvsInstanceMethods staticvsInstanceMethods = new StaticvsInstanceMethods();
        staticvsInstanceMethods.printSomething();

        StaticvsInstanceMethods.printSomethingStatic();

    }

    public void printSomething() {
        System.out.println("printSomething");
    }

    public static void printSomethingStatic() {
        System.out.println("printSomethingStatic");
    }

}

