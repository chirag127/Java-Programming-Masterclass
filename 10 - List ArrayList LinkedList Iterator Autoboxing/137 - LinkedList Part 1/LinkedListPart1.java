/** LinkedList Part 1
 *
 * what is a linkedlist?
 *
 * a linkedlist is a list that is implemented using a linked list
 *
 * what are the methods of the linkedlist class
 *
 * add
 * addAll
 * addFirst
 * addLast
 * clear
 * clone
 * contains
 * descendingIterator
 * element
 * get
 * getFirst
 * getLast
 * indexOf
 * iterator
 * lastIndexOf
 * listIterator
 * offer
 * offerFirst
 * offerLast
 * peek
 * peekFirst
 * peekLast
 * poll
 * pollFirst
 * pollLast
 * pop
 * push
 * remove
 * removeFirst
 * removeFirstOccurrence
 * removeLast
 * removeLastOccurrence
 * set
 * size
 * toArray
 *
 * what are the methods of the linkedlist class that are not in the list interface
 *
 * addFirst
 * addLast
 * descendingIterator
 * element
 * getFirst
 * getLast
 * offerFirst
 * offerLast
 * peekFirst
 * peekLast
 * pollFirst
 * pollLast
 * pop
 * push
 * removeFirst
 * removeFirstOccurrence
 * removeLast
 * removeLastOccurrence
 *
 * what are the methods of the linkedlist class that are not in the arraylist class
 *
 * addFirst
 * addLast
 * descendingIterator
 * element
 * getFirst
 * getLast
 * offerFirst
 * offerLast
 * peekFirst
 * peekLast
 * pollFirst
 * pollLast
 * pop
 * push
 * removeFirst
 * removeFirstOccurrence
 * removeLast
 * removeLastOccurrence
 *
 * what are the methods of the linkedlist class that are not in the deque interface
 *
 * addFirst
 * addLast
 * descendingIterator
 * element
 * getFirst
 * getLast
 * offerFirst
 * offerLast
 * peekFirst
 * peekLast
 * pollFirst
 * pollLast
 * pop
 * push
 * removeFirst
 * removeFirstOccurrence
 * removeLast
 * removeLastOccurrence
 *
 * what are the methods of the linkedlist class that are not in the queue interface
 *
 * addFirst
 * addLast
 * descendingIterator
 * element
 * getFirst
 * getLast
 * offerFirst
 * offerLast
 * peekFirst
 * peekLast
 * pollFirst
 * pollLast
 * pop
 * push
 * removeFirst
 * removeFirstOccurrence
 * removeLast
 * removeLastOccurrence
 *
 */

import java.util.LinkedList;

public class LinkedListPart1 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("London");
        list.add("Paris");
        list.add("New York");
        list.add("San Francisco");
        list.add("Beijing");
        list.add("New York");
        System.out.println("List: " + list);
        list.addFirst("Xian");
        System.out.println("List: " + list);
        list.addLast("Xian");
        System.out.println("List: " + list);
        list.removeFirst();
        System.out.println("List: " + list);
        list.removeLast();
        System.out.println("List: " + list);
        list.removeFirstOccurrence("New York");
        System.out.println("List: " + list);
        list.removeLastOccurrence("New York");
        System.out.println("List: " + list);
        System.out.println("First in list: " + list.getFirst());
        System.out.println("Last in list: " + list.getLast());
    }
}

// List: [London, Paris, New York, San Francisco, Beijing, New York]
// List: [Xian, London, Paris, New York, San Francisco, Beijing, New York]
// List: [Xian, London, Paris, New York, San Francisco, Beijing, New York, Xian]
// List: [London, Paris, New York, San Francisco, Beijing, New York, Xian]
// List: [London, Paris, New York, San Francisco, Beijing, New York]
// List: [London, Paris, San Francisco, Beijing, New York]
// List: [London, Paris, San Francisco, Beijing]
// First in list: London
// Last in list: Beijing
