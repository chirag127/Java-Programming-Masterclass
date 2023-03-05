/**
 * ArrayList Part 3
 *
 * here we discuss the methods of the list interface and the arraylist class that we have not yet discussed
 *
 * we can use the contains method to check if an item is in the list
 * we can use the indexOf method to find the index of an item in the list
 * we can use the isEmpty method to check if the list is empty
 * we can use the add method to add an item to the list
 * we can use the remove method to remove an item from the list
 * we can use the size method to find the size of the list
 * we can use the subList method to create a sublist from the list
 */

import java.util.List;

public class ArrayListPart3 {
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

