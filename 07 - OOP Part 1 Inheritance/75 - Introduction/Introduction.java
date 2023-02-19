/**
 * Introduction to Inheritance in Java
 *
 * Inheritance is a mechanism in Java by which one class is allowed to
 * inherit the features(fields and methods) of another class.
 *
 * Benefits of Inheritance
 *
 * 1. It represents real-world relationships well.
 * 2. It provides re-usability of a code.
 * 3. It is transitive in nature, which means that if class B inherits from another class A,
 *    then all the subclasses of B would automatically inherit from class A.
 *
 * Types of Inheritance
 *
 * 1. Single Inheritance
 * 2. Multilevel Inheritance
 * 3. Hierarchical Inheritance
 * 4. Multiple Inheritance
 * 5. Hybrid Inheritance
 *
 * In Java, we can only implement Single Inheritance, Multilevel Inheritance and Hierarchical Inheritance.
 *
 * Single Inheritance
 *
 * When a class inherits the features of another class, it is known as Single Inheritance.
 *
 * Class A is the superclass, and Class B is the subclass.
 *
 * Class A is the base class or parent class, and Class B is the derived class, extended class or child class.
 *
 * Multilevel Inheritance
 *
 * When we have a child and grandchild relationship.
 *
 * In Multilevel Inheritance, more than one classes are involved in inheritance relationship.
 *
 * Class A is the superclass, Class B is the subclass of A and Class C is the subclass of B.
 *
 * Hierarchical Inheritance
 *
 * When more than one classes are being inherited from a single class.
 *
 * Class A is the superclass, Class B and Class C are the subclasses.
 *
 * Multiple Inheritance
 *
 * When a class is being inherited from more than one classes.
 *
 * In Java, we cannot implement multiple inheritance directly, but we can achieve this through interfaces.
 *
 * Hybrid Inheritance
 *
 * When a class is being inherited from more than one classes and it is also inheriting from another class.
 *
 * In Java, we cannot implement Hybrid Inheritance directly, but we can achieve this through interfaces.
 *
 * Java does not support multiple inheritance with classes, but it does support it with interfaces.
 *
 * In Java, we cannot extend more than one class, but we can implement more than one interface.
 *
 *
 */

public class Introduction {
    public static void main(String[] args) {
        System.out.println("Introduction to Inheritance in Java");
    }
}

/* Output
Introduction to Inheritance in Java
*/

