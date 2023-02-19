/**
 * Introduction to Classes and Objects
 *
 * Class is a user-defined blueprint or prototype from which objects are created.
 *
 * It represents the set of properties or methods that are common to all objects of one type.
 *
 * A class can have fields and methods to describe the behavior of an object.
 *
 * We can create as many objects as we want of a particular class.
 *
 * A class is like an object constructor, or a "blueprint" for creating objects.
 *
 *
 * Objects
 *
 * Object is a basic unit of Object Oriented Programming and represents the real-life entities.
 *
 * An object has state and behavior.
 *
 * Example: A dog has states - color, name, breed as well as behavior such as wagging the tail, barking, eating.
 *
 * An object is an instance of a class.
 *
 *
 * Class vs Object
 *
 * Class is a template or blueprint from which objects are created.
 *
 * Object is an instance of a class.
 *
 *
 * Class Declaration
 *
 * We use the class keyword to create a class.
 *
 * We use the public keyword, which is an access modifier, to make the class accessible by any other class.
 *
 * We then give the class a name, with the initial letter of the first word in Upper Case, and the remaining words in Lower Case.
 *
 * The main() method is the starting point of any Java program.
 *
 * The class keyword creates a class.
 *
 * The name of the class should start with an uppercase letter (e.g. Car rather than car).
 *
 * The curly braces hold the content of the class.
 *
 *
 * Fields
 *
 * Fields are the variables inside a class.
 *
 * Fields represent the state of an object.
 *
 * Fields are also known as attributes or properties.
 *
 *
 * Methods
 *
 * Methods are the functions inside a class.
 *
 * Methods represent the behavior of an object.
 *
 *
 * Creating an Object
 *
 * An object is created from a class.
 *
 * We use the new keyword to create an object.
 *
 * We use the new keyword to create an object of the Car class.
 *
 * We use the equal sign to assign the reference of the newly created object to the variable c.
 *
 *
 * Accessing Object Members
 *
 * We use the dot operator to access the object members.
 *
 * We use the dot operator to access the object members (fields and methods).
 *
 *
 * The this Keyword
 *
 * The this keyword refers to the current object.
 *
 * It is used to refer the current class instance variable.
 *
 * If there is ambiguity between the instance variables and parameters, this keyword resolves the problem of ambiguity.
 *
 * It is used to invoke current class method (implicitly).
 *
 * It is used to pass as an argument in the method call.
 *
 * It is used to return the current class instance
 *
 * It can be passed as an argument in the constructor call to invoke the constructor from the current class.
 *
 * It can be used to invoke the constructor from the current class.
 */

// Introduction to Classes and Objects
public class IntroductiontoClassesandObjects {
    // Fields
    int x = 5;

    // Methods
    public static void main(String[] args) {
        // Creating an Object
        IntroductiontoClassesandObjects myObj = new IntroductiontoClassesandObjects();

        // Accessing Object Members
        System.out.println(myObj.x);
    }
}

