/**
 * Introduction
 *
 * @author Chirag Singhal
 */

// we have covered inheritance and encapsulation in the previous section
// now we will learn about composition and polymorphism

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

    public Monitor(String model, String manufacturer) {
        super(model, manufacturer);
    }
}

class Motherboard extends Product {

    public Motherboard(String model, String manufacturer) {
        super(model, manufacturer);
    }
}

public class Introduction {
    public static void main(String[] args) {
        Product product = new Product("Model", "Manufacturer");
        Monitor monitor = new Monitor("Model", "Manufacturer");
        Motherboard motherboard = new Motherboard("Model", "Manufacturer");

        System.out.println(product);
        System.out.println(monitor);
        System.out.println(motherboard);

    }
}


/** notes
 *
 * 1. Composition is a form of aggregation in which the composed object is a part of the whole object
 * 2. Inheritance is a form of aggregation in which the derived class is a part of the whole object
 *
 * 3. Composition is a "has-a" relationship
 * 4. Inheritance is a "is-a" relationship
 *
 * 5. Composition is used when the composed object is a part of the whole object
 * 6. Inheritance is used when the derived class is a part of the whole object
 *
 * 7. Composition is used when we want to reuse the class
 * 8. Inheritance is used when we want to reuse the behavior
 *
 * 9. Composition is used when we want to reuse the class
 * 10. Inheritance is used when we want to reuse the behavior
 *
 * 11. Composition is used when we want to reuse the class
 * 12. Inheritance is used when we want to reuse the behavior
 *
 * 13. Composition is used when we want to reuse the class
 * 14. Inheritance is used when we want to reuse the behavior
 * */