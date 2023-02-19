/**
 * While Loop and Do While Recap
 * While loop is used to execute a block of code while a condition is true.
 *
 * Do whiles are used to execute a block of code while a condition is true but
 * it runs at least once.
 *
 *
 */

public class WhileLoopandDoWhileRecap {
    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.println("i is " + i);
            i++;
        } while (i < 10);
    }

    @Override
    public String toString() {
        return "WhileLoopRecap []";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
