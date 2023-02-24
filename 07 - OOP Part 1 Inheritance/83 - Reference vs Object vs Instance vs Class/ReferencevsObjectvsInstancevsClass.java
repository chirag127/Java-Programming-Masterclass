/**
 * Reference vs Object vs Instance vs Class
 * 1. Reference is a variable that holds the address of an object.
 * 2. Object is an instance of a class.
 * 3. Instance is a copy of an object.
 * 4. Class is a blueprint of an object.
 */

public class ReferencevsObjectvsInstancevsClass {

    public static void main(String[] args) {

        House blueHouse = new House("blue"); // blueHouse is a reference variable
        House anotherHouse = blueHouse; // anotherHouse is a reference variable

        System.out.println(blueHouse.getColor()); // blue
        System.out.println(anotherHouse.getColor()); // blue

        anotherHouse.setColor("yellow");
        System.out.println(blueHouse.getColor()); // yellow
        System.out.println(anotherHouse.getColor()); // yellow

        anotherHouse = null; // anotherHouse is no longer pointing to the object
        System.out.println(anotherHouse); // null

        House greenHouse = new House("green");
        blueHouse = greenHouse;
        System.out.println(blueHouse.getColor()); // green
        System.out.println(greenHouse.getColor()); // green

        blueHouse.setColor("blue");

        System.out.println(blueHouse.getColor()); // blue
        System.out.println(greenHouse.getColor()); // blue

    }

}

class House {

    private String color;

    public House(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
