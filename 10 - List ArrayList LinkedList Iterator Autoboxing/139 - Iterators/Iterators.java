
/** Iterators
 *
 * @author Chirag Singhal
 */

import java.util.ArrayList;
import java.util.Iterator;

public class Iterators {
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

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
            if (str.equals("A") || str.equals("E") || str.equals("I") || str.equals("O") || str.equals("U")
                    || str.equals("Y")) {
                iterator.remove();
            }
        }
        System.out.println("The list is: " + list);
        System.out.println("The list size is: " + list.size());

        Iterator<String> iterator2 = list.iterator();
        while (iterator2.hasNext()) {
            String str = iterator2.next();
            if (str.equals("B") || str.equals("D") || str.equals("F") || str.equals("H") || str.equals("J")
                    || str.equals("L") || str.equals("N")) {
                iterator2.remove();
            }
        }
        System.out.println("The list is: " + list);
        System.out.println("The list size is: " + list.size());

        Iterator<String> iterator3 = list.iterator();
        while (iterator3.hasNext()) {
            String str = iterator3.next();
            if (str.equals("C") || str.equals("G") || str.equals("K") || str.equals("M") || str.equals("P")
                    || str.equals("Q") || str.equals("R") || str.equals("S") || str.equals("T") || str.equals("V")
                    || str.equals("W") || str.equals("X") || str.equals("Z")) {
                iterator3.remove();
            }
        }
        System.out.println("The list is: " + list);
        System.out.println("The list size is: " + list.size());
    }

}
