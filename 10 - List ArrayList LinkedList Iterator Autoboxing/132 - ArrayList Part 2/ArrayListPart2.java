/**
 * ArrayList Part 2
 *
 * @author   Chirag Singhal
 */

import java.util.List;

public class ArrayListPart2 {
    public static void main(String[] args) {
        List<String> list = new java.util.ArrayList<>();
        list.add("London");
        list.add("Paris");
        list.add("New York");
        list.add("San Francisco");
        list.add("Beijing");
        list.add("New York");
        System.out.println("List: " + list);
        System.out.println("Is New York in the list? " + list.contains("New York"));
        System.out.println("The location of New York in the list? " + list.indexOf("New York"));
        System.out.println("Is the list empty? " + list.isEmpty());
        list.add(2, "Xian");
        System.out.println("List: " + list);
        list.remove("Beijing");
        System.out.println("List: " + list);
        list.remove(1);
        System.out.println("List: " + list);
        System.out.println("List size? " + list.size());
        List<String> subList = list.subList(1, 4);
        System.out.println("Sublist: " + subList);
    }
}

// Path: 10 - List ArrayList LinkedList Iterator Autoboxing/132 - ArrayList Part 2/ArrayListPart2.java
// we can use the contains method to check if an item is in the list
// we can use the indexOf method to find the index of an item in the list
// we can use the isEmpty method to check if the list is empty
// we can use the add method to add an item to the list
// we can use the remove method to remove an item from the list
// we can use the size method to find the size of the list
// we can use the subList method to create a sublist from the list

// Path: 10 - List ArrayList LinkedList Iterator Autoboxing/133 - LinkedList/LinkedList.java
// Compare this snippet from 10 - List ArrayList LinkedList Iterator Autoboxing/132 - ArrayList Part 2/ArrayListPart2.java:
//
// import java.util.List;
//
// public class ArrayListPart2 {
//     public static void main(String[] args) {
//         List<String> list = new java.util.ArrayList<>();
//         list.add("London");
//         list.add("Paris");
//         list.add("New York");
//         list.add("San Francisco");
//         list.add("Beijing");
//         list.add("New York");
//         System.out.println("List: " + list);
//         System.out.println("Is New York in the list? " + list.contains("New York"));
//         System.out.println("The location of New York in the list? " + list.indexOf("New York"));
//         System.out.println("Is the list empty? " + list.isEmpty());
//         list.add(2, "Xian");
//         System.out.println("List: " + list);
//         list.remove("Beijing");
//         System.out.println("List: " + list);
//         list.remove(1);
//         System.out.println("List: " + list);
//         System.out.println("List size? " + list.size());
//         List<String> subList = list.subList(1, 4);
//         System.out.println("Sublist: " + subList);
//     }
// }
//
// Compare this snippet from 10 - List ArrayList LinkedList Iterator Autoboxing/131 - List and ArrayList Part 1/GroceryItem.java:
//
// public class GroceryItem {
//
//     public GroceryItem(String string) {
//
//     }
//
// }
//
// Compare this snippet from 10 - List ArrayList LinkedList Iterator Autoboxing/131 - List and ArrayList Part 1/ListandArrayListPart1.java:
//  * clear
//  * contains
//  * ensureCapacity
//  * get
//  * indexOf