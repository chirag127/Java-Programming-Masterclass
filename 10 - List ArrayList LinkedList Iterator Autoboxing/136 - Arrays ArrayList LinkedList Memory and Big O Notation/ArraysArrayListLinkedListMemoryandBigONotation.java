/**
 * Arrays ArrayList LinkedList Memory and Big O Notation
 *
 * @author  Chirag Singhal
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArraysArrayListLinkedListMemoryandBigONotation {

    public static void doTimings(String type, List<Integer> list) {
        for (int i = 0; i < 1E5; i++) {
            list.add(i);
        }
        long start = System.currentTimeMillis();
        // Add items at end of list
        for (int i = 0; i < 1E5; i++) {
            list.add(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("Time taken: " + (end - start) + " ms for " + type);
        // Add items elsewhere in list
        start = System.currentTimeMillis();
        for (int i = 0; i < 1E5; i++) {
            list.add(0, i);
        }
        end = System.currentTimeMillis();
        System.out.println("Time taken: " + (end - start) + " ms for " + type);
    }


    // The ArrayList class is part of the Java Collections Framework. It implements the List interface. ArrayLists are resizable arrays. They can be used to store any type of data. ArrayLists can grow dynamically in size. They are also called dynamic arrays.

    // The LinkedList class is part of the Java Collections Framework. It implements the List interface. LinkedLists are resizable arrays. They can be used to store any type of data. LinkedLists can grow dynamically in size. They are also called dynamic arrays.

    // The Iterator interface is part of the Java Collections Framework. It is used to iterate through collections. It is a part of the Iterator design pattern. It is used to traverse a container and access the container's elements. The Iterator interface has methods for traversing a collection, removing elements from the collection, and replacing elements in the collection.

    // Autoboxing is the automatic conversion that the Java compiler makes between the primitive types and their corresponding object wrapper classes. For example, converting an int to an Integer, a double to a Double, and so on. If the conversion goes the other way, this is called unboxing.

    // Arrays vs ArrayLists

    // Arrays store the data in a contiguous block of memory. Each element in the array is stored at a specific index. The index of the first element is 0. The index of the last element is the length of the array minus 1. Arrays are fixed in size. Once an array is created, it cannot be resized. The size of an array must be specified when the array is created. The size of an array cannot be changed after the array is created. Arrays are faster than ArrayLists. Arrays are not resizable. Arrays are not as flexible as ArrayLists. Arrays are not as easy to use as ArrayLists.

    // ArrayLists store the data in a contiguous block of memory. Each element in the ArrayList is stored at a specific index. The index of the first element is 0. The index of the last element is the size of the ArrayList minus 1. ArrayLists are resizable. Once an ArrayList is created, it can be resized. The size of an ArrayList can be changed after the ArrayList is created. ArrayLists are slower than arrays. ArrayLists are resizable. ArrayLists are more flexible than arrays. ArrayLists are easier to use than arrays.

    // LinkedLists store the data in a contiguous block of memory. Each element in the LinkedList is stored at a specific index. The index of the first element is 0. The index of the last element is the size of the LinkedList minus 1. LinkedLists are resizable. Once a LinkedList is created, it can be resized. The size of a LinkedList can be changed after the LinkedList is created. LinkedLists are slower than arrays. LinkedLists are resizable. LinkedLists are more flexible than arrays. LinkedLists are easier to use than arrays.

    // Memory and Big O Notation

    // Time taken: 13 ms for ArrayList
    // Time taken: 3288 ms for ArrayList
    // Time taken: 21 ms for LinkedList
    // Time taken: 41 ms for LinkedList

    // now measure memory

    public static void doMemory(String type, List<Integer> list) {
        for (int i = 0; i < 1E5; i++) {
            list.add(i);
        }
        long start = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        // Add items at end of list
        for (int i = 0; i < 1E5; i++) {
            list.add(i);
        }
        long end = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.println("Memory used: " + (end - start) + " bytes for " + type);
        // Add items elsewhere in list
        start = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        for (int i = 0; i < 1E5; i++) {
            list.add(0, i);
        }
        end = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.println("Memory used: " + (end - start) + " bytes for " + type);
    }
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        doTimings("ArrayList", arrayList);
        doTimings("LinkedList", linkedList);

        doMemory("ArrayList", arrayList);
        doMemory("LinkedList", linkedList);
    }

}