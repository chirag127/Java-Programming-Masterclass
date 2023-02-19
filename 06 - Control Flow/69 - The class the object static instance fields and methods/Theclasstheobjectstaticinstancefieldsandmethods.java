/*
The class the object static instance fields and methods

the class is the blueprint for the object

the object is an instance of the class

static fields and methods belong to the class

instance fields and methods belong to the object

the static keyword

the static keyword is used to define static fields and methods

static fields are fields that belong to the class

static methods are methods that belong to the class

static fields

static fields are fields that belong to the class

static fields are declared using the static keyword

static fields are declared outside of any method

static fields are declared inside the class but outside of any method

static methods

static methods are methods that belong to the class

static methods are declared using the static keyword

static methods are declared outside of any method

static methods are declared inside the class but outside of any method

static methods can only access static fields

static methods can only access other static methods

*/

public class Theclasstheobjectstaticinstancefieldsandmethods {
    public static void main(String[] args) {
        Player player = new Player();
        player.name = "Tim";
        player.health = 20;
        player.weapon = "Sword";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());

        damage = 11;
        player.health = 200;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());
    }

    public static class Player {
        public String name;
        public int health;
        public String weapon;

        public void loseHealth(int damage) {
            this.health = this.health - damage;
            if (this.health <= 0) {
                System.out.println("Player knocked out");
                // Reduce number of lives remaining for the player
            }
        }

        public int healthRemaining() {
            return this.health;


        }
    }

}
