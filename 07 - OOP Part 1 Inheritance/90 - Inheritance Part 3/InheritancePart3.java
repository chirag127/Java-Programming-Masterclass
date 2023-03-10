/** Inheritance Part 3
 *
 * 1. Inheritance is a mechanism in which one class acquires the property of another class.
 * 2. Inheritance is used to achieve reusability and it is one of the fundamental concepts of OOP.
 *
 * adding more attributes to the dog class.
 */

 public class InheritancePart3 {

     public class Animal {

         private String type;
         private String size;
         private double weight;

         public Animal(String type, String size, double weight) {
             this.type = type;
             this.size = size;
             this.weight = weight;
         }

         public String getType() {
             return type;
         }

         public void setType(String type) {
             this.type = type;
         }

         public String getSize() {
             return size;
         }

         public void setSize(String size) {
             this.size = size;
         }

         public double getWeight() {
             return weight;
         }

         public void setWeight(double weight) {
             this.weight = weight;
         }

         public void move(String direction, double speed) {
             System.out.println("Animal is moving " + direction + " at " + speed + " mph");
         }

         public void makeNoise() {
             System.out.println("Animal is making noise");
         }

     }

     public class Dog extends Animal {

         private String breed;
         private int age;

         public Dog(String type, String size, double weight, String breed, int age) {
             super(type, size, weight);
             this.breed = breed;
             this.age = age;
         }

         public String getBreed() {
             return breed;
         }

         public void setBreed(String breed) {
             this.breed = breed;
         }

         public int getAge() {
             return age;
         }

         public void setAge(int age) {
             this.age = age;
         }

         public void bark() {
             System.out.println("Dog is barking");
         }

     }

     public static void main(String[] args) {
         InheritancePart3 main = new InheritancePart3();
         main.run();
     }

     private void run() {
            Dog dog = new Dog("Animal", "Large", 100, "Bulldog", 1);
         System.out.println(dog.getBreed());
         System.out.println(dog.getAge());
         dog.bark();
     }

 }