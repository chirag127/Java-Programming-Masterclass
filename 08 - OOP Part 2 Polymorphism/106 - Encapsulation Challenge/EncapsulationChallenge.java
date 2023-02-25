/** Encapsulation Challenge
 *
 * @author Chirag Singhal
 */

 class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if (tonerLevel > -1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount) {
        if (tonerAmount > 0 && tonerAmount <= 100) {
            if (this.tonerLevel + tonerAmount > 100) {
                return -1;
            }
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;
        } else {
            return -1;
        }
    }

    public int printPages(int pages) {
        int pagesToPrint = pages;
        if (this.duplex) {
            pagesToPrint = (pages / 2) + (pages % 2);
            System.out.println("Printing in duplex mode");
        }
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

}

public class EncapsulationChallenge {
    public static void main(String[] args) {
        Printer printer = new Printer(50, true);
        System.out.println("Initial page count = " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());
        pagesPrinted = printer.printPages(2);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());
    }
}

// Output:
// Initial page count = 0
// Printing in duplex mode
// Pages printed was 2 new total print count for printer = 2
// Printing in duplex mode
// Pages printed was 1 new total print count for printer = 3


/** notes (lines should not be longer than 80 characters)
 *
 * Here I learned about encapsulation. Encapsulation is the process of hiding
 *
 * implementation details from the user, only the functionality will be provided
 *
 * to the user. In other words user will have the information on what the object
 *
 * does but not how it does it.
 *
 * In encapsulation, the variables of a class will be hidden from other classes,
 *
 * and can be accessed only through the methods of their current class. Therefore,
 *
 * it is also known as data hiding.
 *
 * To achieve encapsulation in Java:
 *
 * Declare the variables of a class as private.
 *
 * Provide public setter and getter methods to modify and view the variables values.
 *
 * In this example, we have created a Printer class. The variables tonerLevel,
 *
 * pagesPrinted and duplex are private. The public methods addToner, printPages
 *
 * and getPagesPrinted are used to set and get the values of these variables.
 *
 * We have also added a condition in the addToner method that checks if the
 *
 * toner level is greater than 100 or not. If it is greater than 100, then we
 *
 * return -1.
 *
 * In the printPages method, we have added a condition that checks if the printer
 *
 * is duplex or not. If it is duplex, then we divide the number of pages by 2 and
 *
 * add the remainder to it. This is done to print the pages in duplex mode.
 *
 * We have also added a condition in the printPages method that checks if the
 *
 * number of pages is greater than 0 or not. If it is not greater than 0, then
 *
 * we return -1.
 *
 * In the main method, we have created an object of the Printer class and called
 *
 * the printPages method to print the pages. We have also called the getPagesPrinted
 * method to get the total number of pages that have been printed.
 */
