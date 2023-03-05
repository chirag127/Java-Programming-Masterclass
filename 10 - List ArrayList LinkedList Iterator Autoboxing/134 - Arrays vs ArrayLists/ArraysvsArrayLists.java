/**
 * Arrays vs ArrayLists
 *
 * @author  Chirag Singhal
 */


import java.util.ArrayList;

public class ArraysvsArrayLists {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;
        System.out.println("Sum of the numbers in the array is: " + sum(numbers));
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("Sum of the numbers in the array is: " + sum(list));
    }

    public static int sum(int[] list) {
        int total = 0;
        for (int i = 0; i < list.length; i++) {
            total += list[i];
        }
        return total;
    }

    public static int sum(ArrayList<Integer> list) {
        int total = 0;
        for (int i = 0; i < list.size(); i++) {
            total += list.get(i);
        }
        return total;
    }
}


