/** Polymorphism Part 1
 *
 * @author Chirag Singhal
 */

class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "No plot here";
    }

    public String getName() {
        return name;
    }
}

public class PolymorphismPart1 {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            Movie movie = randomMovie();
            System.out.println("Movie #" + i + " : " + movie.getName() + "plot: " + movie.plot());

        }

    }

    public static Movie randomMovie() {
        int randomNumber = (int) (Math.random() * 5) + 1;
        System.out.println("Random number generated was: " + randomNumber);
        switch (randomNumber) {
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new Forgetable();
        }
        return null;
    }

}

class Jaws extends Movie {
    public Jaws() {
        super("Jaws");
    }

    public String plot() {
        return "A shark eats lots of people";
    }
}

class IndependenceDay extends Movie {
    public IndependenceDay() {
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Aliens attempt to take over planet earth";
    }
}

class MazeRunner extends Movie {
    public MazeRunner() {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Kids try and escape a maze";
    }
}

class StarWars extends Movie {
    public StarWars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Imperial forces try to take over the universe";
    }
}

class Forgetable extends Movie {
    public Forgetable() {
        super("Forgetable");
    }

    // No plot method
}

/** noteS
 *
 * 1. Polymorphism is the ability of an object to take on many forms
 * 2. The most common use of polymorphism in java is when a parent class
 * reference is used to refer to a child class object
 * 3. Any java object that can pass more than one IS-A
 * test is considered to be polymorphic
 * 4. In the following code we have created a Movie class which is a
 * parent class
 * 5. We have created 5 child classes which are Jaws, IndependenceDay,
 * MazeRunner, StarWars and Forgetable
 * 6. We have also created a randomMovie method which returns a movie object
 * 7. In the main method we have created a for loop which will call the
 * randomMovie method 10 times and print the name of the movie and the
 * plot of the movie
 * 8. In the randomMovie method we are generating a random number between
 * 1 and 5
 * 9. We are using a switch case to create a movie object based on the
 * random number generated
 * 10. We are returning the movie object
 * 11. In the main method we are calling the getName and the plot method on
 * the Movie object returned by the randomMovie method
 * 12. The getName method is called on the Movie class
 * 13. The plot method is called on the child class
 * 14. The Movie class does not have a plot method, so the plot method of
 * the child class is called
 * 15. The Movie class is the parent class and the child classes are the
 * derived classes
 * 16. The child classes are overriding the plot method of the parent class
 */

/** output
 *
 * Random number generated was: 3
 * Movie #1 : Maze Runnerplot: Kids try and escape a maze
 * Random number generated was: 1
 * Movie #2 : Jawsplot: A shark eats lots of people
 */