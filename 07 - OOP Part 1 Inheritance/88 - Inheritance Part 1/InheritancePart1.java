/**
 * Inheritance Part 1
 *
 * 1. Inheritance is a mechanism in which one class acquires the property of
 * another class.
 * 2. Inheritance is used to achieve reusability and it is one of the
 * fundamental concepts of OOP.
 */

public class InheritancePart1 {

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

        public Dog(String type, String size, double weight, String breed) {
            super(type, size, weight);
            this.breed = breed;
        }

        public String getBreed() {
            return breed;
        }

        public void setBreed(String breed) {
            this.breed = breed;
        }

        @Override
        public void makeNoise() {
            System.out.println("Dog is barking");
        }

    }

    public static void main(String[] args) {

        InheritancePart1 inheritancePart1 = new InheritancePart1();
        Dog dog = inheritancePart1.new Dog("mammal", "medium", 20, "German Shepherd");
        System.out.println(dog.getType());
        System.out.println(dog.getSize());
        System.out.println(dog.getWeight());
        System.out.println(dog.getBreed());
        dog.move("forward", 10);
        dog.makeNoise();

    }

}
