/**
 * List and ArrayList Part 1
 *
 * what is a list?
 *
 * a list is a collection of objects that are ordered by index
 *
 * what is an arraylist?
 *
 * an arraylist is a list that is implemented using an array
 *
 * what are list interfaces
 *
 * List
 *
 * what are list implementations
 *
 * ArrayList
 *
 * what are the methods of the list interface
 *
 * add
 * addAll
 * clear
 * contains
 * get
 * indexOf
 * isEmpty
 * iterator
 * lastIndexOf
 * listIterator
 * remove
 * removeAll
 * retainAll
 * set
 * size
 * subList
 * toArray
 *
 * what are the methods of the arraylist class
 *
 * add
 * addAll
 * clear
 * contains
 * ensureCapacity
 * get
 * indexOf
 * isEmpty
 * iterator
 * lastIndexOf
 * listIterator
 * remove
 * removeAll
 * retainAll
 * set
 * size
 * subList
 * toArray
 * trimToSize
 *
 * what is autoboxing?
 *
 * autoboxing is the automatic conversion of primitive types to their object
 * wrapper class
 *
 * what is unboxing?
 *
 * unboxing is the automatic conversion of object wrapper classes to their
 * primitive types
 *
 * what is the autoboxing/unboxing feature?
 *
 * autoboxing/unboxing is the automatic conversion of primitive types to their
 * object wrapper class and vice versa
 *
 * what are the benefits of autoboxing/unboxing?
 *
 * autoboxing/unboxing removes the need for explicit conversion between
 * primitive types and their object wrapper classes
 *
 * what are the drawbacks of autoboxing/unboxing?
 *
 * autoboxing/unboxing is a feature that is only available in Java SE 5.0 and
 * later
 *
 * author: Chirag singhal
 *
 */

// let's write some code

public class ListandArrayListPart1 {

    public static void main(String[] args) {

        // create a list of grocery items
        Object[] groceryItems = new Object[10];

        // add some grocery items to the list
        groceryItems[0] = new GroceryItem("milk");
        groceryItems[1] = new GroceryItem("bread");
        groceryItems[2] = new GroceryItem("eggs");
        groceryItems[3] = new GroceryItem("cheese");
        groceryItems[4] = new GroceryItem("butter");
        groceryItems[5] = new GroceryItem("yogurt");
        groceryItems[6] = new GroceryItem("ice cream");
        groceryItems[7] = new GroceryItem("soda");
        groceryItems[8] = new GroceryItem("chips");
        groceryItems[9] = new GroceryItem("candy");

        // print the grocery items
        for (int i = 0; i < groceryItems.length; i++) {
            System.out.println(groceryItems[i]);
        }

    }

}