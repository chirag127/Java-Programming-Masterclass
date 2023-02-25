/**
 * Casting with classes and using Object and var references
 *
 * @author Chirag Singhal
 */

// This is a class

public class CastingwithclassesandusingObjectandvarreferences {

    // This is a field
    private String name;

    // This is a constructor
    public CastingwithclassesandusingObjectandvarreferences(String name) {
        this.name = name;
    }

    // This is a method
    public String getName() {
        return name;
    }

    // This is a method
    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        // This is an object
        CastingwithclassesandusingObjectandvarreferences movie = new CastingwithclassesandusingObjectandvarreferences(
                "Movie");

        // This is a variable
        String movieName = movie.getName();

        // This is a variable
        Object movieObject = movie;

        // This is a variable
        CastingwithclassesandusingObjectandvarreferences movie2 = (CastingwithclassesandusingObjectandvarreferences) movieObject;

        // This is a variable
        String movieName2 = movie2.getName();

        System.out.println(movieName);
        System.out.println(movieName2);

    }

}
