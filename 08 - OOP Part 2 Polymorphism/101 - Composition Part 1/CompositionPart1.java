/**
 * Composition Part 1
 *
 * @author Chirag Singhal
 */

class Product {
    private String model;
    private String Manufacturer;
    private int width;
    private int height;
    private int depth;

    public Product(String model, String manufacturer) {
        this.model = model;
        Manufacturer = manufacturer;
    }

}

class Monitor extends Product {
    private int size;
    private String resolution;

    public Monitor(String model, String manufacturer, int size, String resolution) {
        super(model, manufacturer);
        this.size = size;
        this.resolution = resolution;
    }

    public void drawPixelAt(int x, int y, String color) {
        System.out.println("Drawing pixel at " + x + ", " + y + " in color " + color);
    }

}

class Motherboard extends Product {
    private int ramSlots;
    private int cardSlots;
    private String bios;

    public Motherboard(String model, String manufacturer, int ramSlots, int cardSlots, String bios) {
        super(model, manufacturer);
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }
}

class Dimensions {
    private int width;
    private int height;
    private int depth;

    public Dimensions(int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
}

class Case {
    private String model;
    private String manufacturer;
    private String powerSupply;
    private Dimensions dimensions;

    public Case(String model, String manufacturer, String powerSupply, Dimensions dimensions) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
        this.dimensions = dimensions;
    }

    public void pressPowerButton() {
        System.out.println("Power button pressed");
    }
}

class PC {
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }
}

/**
 * notes
 *
 * comparision in inheritance and composition
 *
 * Inheritance and composition are two programming techniques developers
 * use to establish relationships between classes and objects.
 * Whereas inheritance derives one class from another, composition
 * defines a class as the sum of its parts.
 *
 *
 * Classes and objects created through inheritance are tightly coupled b
 * ecause changing the parent or superclass in an inheritance relationship
 * risks breaking your code. Classes and objects created through composition
 * are loosely coupled, meaning that you can more easily change the component
 * parts without breaking your code.
 *
 *
 * Because loosely coupled code offers more flexibility, many developers
 * have learned that composition is a better technique than inheritance,
 * but the truth is more complex. Choosing a programming tool is similar to ch
 * oosing the correct kitchen tool: You wouldn't use a butter knife to cut veg
 * etables, and in the same way you shouldn't choose composition for every pro
 * gramming scenario.
 *
 *
 * In this Java Challenger you'll learn the difference between inheritan
 * ce and composition and how to decide which is correct for your program. Ne
 * xt, I'll introduce you to several important but challenging aspects of Java
 * inheritance: method overriding, the super keyword, and type casting. Finally
 * , you'll test what you've learned by working through an inheritance example
 * lin
 * e by line to determine what the output should be.
 *
 *
 * When to use inheritance in Java
 *
 * In object-oriented programming, we can use inheritance when we know t
 * here is an "is a" relationship between a child and its parent class. Some exa
 * mples would be:
 *
 *
 * A person is a human.
 *
 * A cat is an animal.
 *
 * A car is a vehicle.
 *
 * In each case, the child or subclass is a specialized version of the p
 * arent or superclass. Inheriting from the superclass is an example of code
 * reuse. To better understand this relationship, take a moment to study th
 * e Car class, which inherits from Vehicle:
 *
 *
 * class Vehicle {
 *
 * String brand;
 * String color;
 * double weight;
 * double speed;
 *
 * void move() {
 * System.out.println("The vehicle is moving");
 * }
 * }
 *
 * public class Car extends Vehicle {
 * String licensePlateNumber;
 * String owner;
 * String bodyStyle;
 *
 * public static void main(String... inheritanceExample) {
 * System.out.println(new Vehicle().brand);
 * System.out.println(new Car().brand);
 * new Car().move();
 * }
 * }
 * When you are considering using inheritance, ask yourself whether th
 * e subclass really is a more specialized version of the superclass. In t
 * his case, a car is a type of vehicle, so the inheritance relationship makes
 * sense.
 *
 *
 * When to use composition in Java
 * In object-oriented programming, we can use composition in cases where o
 * ne object "has" (or is part of) another object. Some examples would be:
 *
 * A car has a battery (a battery is part of a car).
 * A person has a heart (a heart is part of a person).
 * A house has a living room (a living room is part of a house).
 * To better understand this type of relationship, consider the compo
 * sition of a House:
 *
 *
 * public class CompositionExample {
 *
 * public static void main(String... houseComposition) {
 * new House(new Bedroom(), new LivingRoom());
 * // The house now is composed with a Bedroom and a LivingRoom
 * }
 *
 *
 * static class House {
 *
 * Bedroom bedroom;
 * LivingRoom livingRoom;
 *
 * House(Bedroom bedroom, LivingRoom livingRoom) {
 * this.bedroom = bedroom;
 * this.livingRoom = livingRoom;
 * }
 * }
 * static class Bedroom { }
 * static class LivingRoom { }
 * }
 * In this case, we know that a house has a living room and a bedroom, so w
 * e can use the Bedroom and LivingRoom objects in the composition of a House.
 */