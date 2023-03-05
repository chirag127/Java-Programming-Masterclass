/** LinkedList Part 2
 *
 * here we will look at the methods of the linkedlist class that are not in the list interface
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
 *
 * addFirst
 *
 * public void addFirst(E e)
 *
 * adds the specified element to the beginning of the list
 *
 * addLast
 *
 * public void addLast(E e)
 *
 * adds the specified element to the end of the list
 *
 * descendingIterator
 *
 * public Iterator<E> descendingIterator()
 *
 * returns an iterator over the elements in the list in reverse order
 *
 * element
 *
 * public E element()
 *
 * retrieves, but does not remove, the head of the list
 *
 * getFirst
 *
 * public E getFirst()
 *
 * retrieves, but does not remove, the first element of the list
 *
 * getLast
 *
 * public E getLast()
 *
 * retrieves, but does not remove, the last element of the list
 *
 * offerFirst
 *
 * public boolean offerFirst(E e)
 *
 * adds the specified element to the beginning of the list
 *
 * offerLast
 *
 * public boolean offerLast(E e)
 *
 * adds the specified element to the end of the list
 *
 * peekFirst
 *
 * public E peekFirst()
 *
 * retrieves, but does not remove, the first element of the list
 *
 * peekLast
 *
 * public E peekLast()
 *
 * retrieves, but does not remove, the last element of the list
 *
 * pollFirst
 *
 * public E pollFirst()
 *
 * retrieves and removes the first element of the list
 *
 * pollLast
 *
 * public E pollLast()
 *
 * retrieves and removes the last element of the list
 *
 * pop
 *
 * public E pop()
 *
 * retrieves and removes the first element of the list
 *
 * push
 *
 * public void push(E e)
 *
 * adds the specified element to the beginning of the list
 *
 * here is an example of using the peekFirst and peekLast methods
 *
 * here is an example of using the pollFirst and pollLast methods
 *
 * here is an example of using the push and pop methods
 *
 * here is an example of using the descendingIterator method
 *
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

 public class LinkedListPart2 {
     public static void main(String[] args) {
         LinkedList<String> list = new LinkedList<>();
         list.add("one");
         list.add("two");
         list.add("three");
         list.add("four");
         list.add("five");
         list.add("six");
         list.add("seven");
         list.add("eight");
         list.add("nine");
         list.add("ten");

         System.out.println("list: " + list);

         System.out.println("peekFirst: " + list.peekFirst());
         System.out.println("peekLast: " + list.peekLast());

         System.out.println("pollFirst: " + list.pollFirst());
         System.out.println("pollLast: " + list.pollLast());

         System.out.println("list: " + list);

         System.out.println("pop: " + list.pop());
         System.out.println("list: " + list);

         list.push("zero");
         System.out.println("list: " + list);

         System.out.println("descending iterator: ");
         for (String s : list) {
             System.out.println(s);
         }

         System.out.println("descending iterator: ");
         for (java.util.ListIterator<String> i = list.descendingIterator(); i.hasNext();) {
             System.out.println(i.next());
         }

     }
 }