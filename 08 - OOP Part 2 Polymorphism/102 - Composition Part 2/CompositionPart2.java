/** Composition Part 2
 *
 * @author Chirag Singhal
 */

class Product {
    private String model;
    private String Manufacturer;
    private Dimensions dimensions;

    public Product(String model, String manufacturer, Dimensions dimensions) {
        this.model = model;
        Manufacturer = manufacturer;
        this.dimensions = dimensions;
    }

}

class Monitor extends Product {
    private int size;
    private String resolution;

    public Monitor(String model, String manufacturer, int size, String resolution, Dimensions dimensions) {
        super(model, manufacturer, dimensions);
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

    public Motherboard(String model, String manufacturer, int ramSlots, int cardSlots, String bios, Dimensions dimensions) {
        super(model, manufacturer, dimensions);
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

public class CompositionPart2 {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Monitor monitor = new Monitor("27inch Beast", "Acer", 27, "1080p", dimensions);
        Motherboard motherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44", dimensions);

        System.out.println(monitor);
        System.out.println(motherboard);
    }
}

/** notes
 * 1. Composition is a form of aggregation in which the composed object is a part of the whole object
 * 2. Inheritance is a form of aggregation in which the derived class is a part of the whole object
 *
 * 3. Composition is a "has-a" relationship
 * 4. Inheritance is a "is-a" relationship
 *
 * 5. Composition is used when the composed object is a part of the whole object
 * 6. Inheritance is used when the derived class is a part of the whole object
 */
