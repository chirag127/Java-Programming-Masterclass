/**
 * Introduction to Classes Using Getter Methods
 *
 * Getters are methods that return the value of a field.
 *
 * A getter method is a method that returns the value of a field.
 * The syntax of a getter method is:
 *      public <field-type> get<field-name>() {
 *          return <field-name>;
 *      }
 *
 * For example, a getter method for a field named mHeight of type double
 * would be:
 *      public double getHeight() {
 *          return mHeight;
 *      }
 *
 * A getter method is like a normal method except that it has no parameters.
 * It also has the same return type as the field it is returning.
 *
 * A getter method is used to access the value of a private field.
 * The getter method is public, so it can be called from anywhere.
 * The getter method calls the private field, so it can access its value.
 *
 * A getter method is a public method that returns the value of a private field.
 * The syntax of a getter method is:
 *      public <field-type> get<field-name>() {
 *          return <field-name>;
 *      }
 */


 public class IntroductiontoClassesUsingGetterMethods {
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
