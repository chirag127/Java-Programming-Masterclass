/**
 * OOP Master Challenge Exercise Part 2
 *
 * @author Chirag Singhal
 */

class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String addition1Name;
    private double addition1Price;

    private String addition2Name;
    private double addition2Price;

    private String addition3Name;
    private double addition3Price;

    private String addition4Name;
    private double addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public void addHamburgerAddition1(String name, double price) {
        this.addition1Name = name;
        this.addition1Price = price;
    }

    public void addHamburgerAddition2(String name, double price) {
        this.addition2Name = name;
        this.addition2Price = price;
    }

    public void addHamburgerAddition3(String name, double price) {
        this.addition3Name = name;
        this.addition3Price = price;
    }

    public void addHamburgerAddition4(String name, double price) {
        this.addition4Name = name;
        this.addition4Price = price;
    }

    public double itemizeHamburger() {
        double hamburgerPrice = this.price;
        System.out.println(this.name + " hamburger " + " on a " + this.breadRollType + " roll "
                + "with " + this.meat + ", price is " + this.price);
        if (this.addition1Name != null) {
            hamburgerPrice += this.addition1Price;
            System.out.println("Added " + this.addition1Name + " for an extra " + this.addition1Price);
        }
        if (this.addition2Name != null) {
            hamburgerPrice += this.addition2Price;
            System.out.println("Added " + this.addition2Name + " for an extra " + this.addition2Price);
        }
        if (this.addition3Name != null) {
            hamburgerPrice += this.addition3Price;
            System.out.println("Added " + this.addition3Name + " for an extra " + this.addition3Price);
        }
        if (this.addition4Name != null) {
            hamburgerPrice += this.addition4Price;
            System.out.println("Added " + this.addition4Name + " for an extra " + this.addition4Price);
        }

        return hamburgerPrice;
    }

}

public class OOPMasterChallengeExercisePart2 {

    public static void main(String[] args) {
        // The purpose of the application is to help a ficticious company called Bills
        // Burgers to manage
        // their process of selling hamburgers.
        // Our application will help Bill to select types of burgers, some of the
        // additional items (additions) to
        // be added to the burgers and pricing.
        // We want to create a base hamburger, but also two other types of hamburgers
        // that are popular ones in
        // Bills store.
        // The basic hamburger should have the following items.
        // bread roll type, meat and up to 4 additional additions (things like lettuce,
        // tomato, carrot, etc) that
        // the customer can select to be added to the burger. Each one of these items
        // gets charged an additional
        // price so you need some way to track how many items got added and to calculate
        // the price (for the base
        // burger and all the additions).
        // This burger has a base price and the additions are all seperately priced.
        // Create a Hamburger class to deal with all the above.
        // The constructor should only include the roll type, meat and price.
        // Also create two extra varieties of Hamburgers (classes) to cater for
        // a) Healthy burger (on a brown rye bread roll), plus two addition items can be
        // added.
        // The healthy burger can have a total of 6 items (Additions) in total.
        // hint: you probably want to process the 2 additional items in this new class,
        // not the base class,
        // since the 2 additions are only appropriate for this new class.
        // b) Deluxe hamburger - comes with chips and drinks as additions, but no extra
        // additions are allowed.
        // hint: You have to find a way to automatically add these new additions at the
        // time the deluxe burger
        // object is created, and then prevent other additions being made.
        // All 3 classes should have a method that can be called anytime to show the
        // base price of the hamburger
        // plus all additionals, each showing the addition name, and addition price, and
        // a grand total for the
        // burger
        // For the two additional classes this may require you to be looking at the base
        // class for pricing and then
        // adding totals onto that.

        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.13);
        System.out.println("Total Burger price is " + hamburger.itemizeHamburger());

    }
}
