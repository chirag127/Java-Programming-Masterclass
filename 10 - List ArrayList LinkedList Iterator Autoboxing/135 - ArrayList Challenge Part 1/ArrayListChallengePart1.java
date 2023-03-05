
/**
 * ArrayList Challenge Part 1
 *
 * @author  Chirag Singhal
 */

import java.util.ArrayList;

public class ArrayListChallengePart1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");
        list.add("G");
        list.add("H");
        list.add("I");
        list.add("J");
        list.add("K");
        list.add("L");
        list.add("M");
        list.add("N");
        list.add("O");
        list.add("P");
        list.add("Q");
        list.add("R");
        list.add("S");
        list.add("T");
        list.add("U");
        list.add("V");
        list.add("W");
        list.add("X");
        list.add("Y");
        list.add("Z");
        System.out.println("The list is: " + list);
        System.out.println("The list size is: " + list.size());
        list.remove("A");
        list.remove("E");
        list.remove("I");
        list.remove("O");
        list.remove("U");
        list.remove("Y");
        System.out.println("The list is: " + list);
        System.out.println("The list size is: " + list.size());
        list.remove(0);
        list.remove(1);
        list.remove(2);
        list.remove(3);
        list.remove(4);
        list.remove(5);
        System.out.println("The list is: " + list);
        System.out.println("The list size is: " + list.size());
        list.remove("B");
        list.remove("D");
        list.remove("F");
        list.remove("H");
        list.remove("J");
        list.remove("L");
        list.remove("N");
        list.remove("P");
        list.remove("R");
        list.remove("T");
        list.remove("V");
        list.remove("X");
        list.remove("Z");
        System.out.println("The list is: " + list);
        System.out.println("The list size is: " + list.size());
    }

}
