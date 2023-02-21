/**
 * Arrays Part 1
 *
 *
 * Lets look at ways to store, and manipulate,
 * multiple values of the same type.
 * The most common way to do this,
 * in Java, is with an array.
 * An array is a data structure, that allows you to
 * store a sequence of values, all of the same type.
 * You can have arrays for any primitive
 * type, like ints, doubles, booleans,
 * or any of the 8 primitives we've learned about.
 * You can also have arrays for any class.
 * Elements in an array are indexed, starting at 0.
 * If we have an array, storing five names,
 * conceptually it looks as shown here.
 * The first element is at index 0, and is Andy.
 * The last element in this array is at
 * index 4, and has the String value Eve.
 * When you declare an array, you first specify
 * the type of the elements you want in the array.
 *
 * Then you include square brackets in the
 * declaration, which is the key for Java,
 *
 * to identify the variable as an array.
 *
 * The square brackets can follow
 *
 * the type as shown in the first two examples.
 * This is much more common. And this is how I'll
 *
 * be declaring arrays in the code in this course.
 * The brackets can also be after the variable name,
 *
 * as shown in the last example. You may
 * see this in some code you run across.
 *
 * You don't specify a size, in the array
 * declaration itself (remember the declaration
 *
 * is usually to the left of an equals or
 * assignment operator, but not always).
 *
 * One way to instantiate the array, is
 * with the new keyword, much as we've seen,
 *
 * with most of the classes we've used
 * to date, with the exception of String.
 *
 * On this slide, we have an array declaration on the
 *
 * left of the equals sign, and then an array
 * creation expression on the right side.
 *
 * For comparison, I'm showing you a
 * typical array variable declaration,
 *
 * and a class instance, or object creation
 * expression, using the StringBuilder class.
 *
 * They look pretty similar, but
 * there are two major differences.
 *
 * Square brackets are required when using the new
 * keyword, and a size is specified between them.
 *
 * So in this example, there will
 * be 10 elements in the array.
 *
 * An array instantiation doesn't have a set of
 * parentheses, meaning we can't pass data to a
 *
 * constructor for an array.
 *
 * In fact, using parentheses with an array
 *
 * instantiation gives you a compiler error.
 *
 * Ok, that's a brief overview of what an array is.
 * Let's look at arrays in some code now.
 *
 * I've already created a
 * project, called ArraysProject,
 *
 * with the usual Main class and main method.
 * And I've put this class in the dev.lpa package,
 *
 * which I'll be doing from now on.
 * My class has this first statement,
 *
 * the package statement:
 *
 * I'll create an int array
 *
 * called my int array and
 * set it to have ten elements
 *
 * Like we do when we create any new
 * object, we use the new keyword.
 *
 * Underneath the covers, a Java
 * array, is just a specialized class,
 *
 * so the new keyword here, creates a new array.
 * And now we again need to specify the type,
 *
 * similar to the way we specify the
 * class, when creating a new instance.
 *
 * But this time, we specify
 * the type that all the array
 *
 * elements will be, so this will be int here.
 *
 * And next, we include the brackets again, but with
 * a number, the size of the array, in the brackets.
 *
 * This is the number of slots, or in this case, of
 * separate integers, that we want in this array.
 *
 * And it's important to know
 * that an array is not resizable.
 *
 * The size of an array, once created, is fixed.
 * In this case, integerArray will have 10 elements.
 *
 * You can't change the size of an array,
 * after the array is instantiated.
 *
 * We can't add or delete elements,
 *
 * we can only assign values to one of the ten
 * elements in this array, in this example.
 *
 * Now, in our code, let's see how we'd
 * go about accessing the array elements.
 *
 * I'll set element 6 of my int array to the
 * int value fifty
 *
 * This statement assigns the value fifty
 * to one of the array elements.
 *
 * You might assume
 *
 * that this code is assigning 50, to element
 * 5, but it's actually saving it to element 6.
 *
 * The reason for this is, as with all arrays
 * in Java, indexing starts with position 0,
 *
 * not 1, as I've stated on the slides.
 * And for the last element, it actually used index 9 in this case
 *
 * Instead of starting from 1, and finishing on 10
 * for this array, you start from 0, and finish on 9.
 *
 * This may be confusing at first, but you'll soon get used to it.
 * Arrays can be any primitive type,
 *
 * so we could create an array to contain doubles.
 * Let's do that next.
 *
 * double[] myDoubleArray = new double[10];
 *
 * And I'll the third element of my double
 * array to the value three point five
 *
 * And here, we're creating an array called
 * myDoubleArray, with room for 10 doubles.
 *
 * And we set the third element in that array, to
 * a floating point number, a decimal number, 3.5.
 *
 * Remember that any decimal number literal like
 * we're using here, is really a double in Java.
 *
 * Retrieving a value from the
 * array is done in the same way,
 *
 * using the position of the element, in the array.
 * Let's print out the third element, of the double
 *
 * array we just created.
 *
 * System.out.println(myDoubleArray[2]);
 * Again, we call it the third element,
 *
 * but we use index 2, because Java
 * starts counting at zero for arrays.
 *
 * And we get 3.5 printed out, which we
 * assigned to that element on line 11.
 *
 * Like any variable, whatever type you
 * define the variable to be, that's the
 *
 * type of data that can be assigned to that array.
 * You can't put a double into an integer array,
 *
 * in much the same way you can't assign
 * a double value, to an integer variable.
 *
 * Now, let's assign some more data, to the
 * first two elements, of the integer array.
 *
 * Set the first
 *
 * element of my int array to double
 * value forty five point zero
 *
 * And set the second element to string literal one
 *
 * In this code, I've purposely
 * created a couple of errors.
 *
 * I declared this array, to store integers,
 * and here, silly me, I'm trying to assign
 *
 * other types of values to the array elements.
 * You can see we have compiler errors here,
 *
 * because Java doesn't allow this.
 * In the first case, we have a double,
 *
 * and that can't be assigned to an int element.
 * In the second case, we're trying to assign a
 *
 * String literal to an int variable, which
 * is what each array element really is.
 *
 * Let's fix those:
 *
 * And that compiles, so that's good.
 * But imagine assigning values this way,
 *
 * one at a time like this, for the other 7 elements.
 * You can see this gets tedious really fast.
 *
 * Java provides another shortcut,
 * for creating an array.
 *
 * If we know the values for all the elements,
 *
 * at the time we create the array,
 * we can use an array initializer.
 *
 * An array initializer makes the job
 * of instantiating and initializing a
 *
 * small array, much easier.
 *
 * In this example, you can see we still use the new
 * keyword, and have int, with the square brackets.
 *
 * But here we specify the values, we
 * want the array to be initialized to,
 *
 * in a comma delimited list, in curly braces.
 * Because these values are specified,
 *
 * the length of the array can be determined, so we
 * don't specify the size in the square brackets.
 *
 * And actually, Java provides an
 * even simpler way to do this.
 *
 * Java allows us to drop new int[] with
 * brackets, from the expression, as we show here.
 *
 * This is known as an anonymous array.
 * Here we're showing examples for both an
 *
 *
 * int array, as well as a String array.
 *
 *
 * An anonymous array initializer,
 *
 *
 * can only be used in a declaration statement.
 * I'll explain what that means in a minute.
 *
 *
 * Ok, so getting back to our code,
 * let's create a new integer array.
 *
 *
 * This time, we'll use an array
 * initializer, to create an array,
 *
 *
 * with the values 1 through 10 in it.
 *
 *
 * I'll tell Java its an integer
 * array called first ten and assign the
 *
 *
 * values 1 through 10 in curly braces
 *
 *
 * I'll print out the firstTen arrays first elements value
 *
 *
 * Lets save first tens length to a
 * new int variable array length
 *
 *
 * and print it out using println
 *
 *
 * Ok, so now I've created a new integer array, and
 *
 *
 * I've actually defined the
 * numbers we want in that array.
 *
 *
 * The fact is, there's actually ten
 * elements in there, 1 through 10.
 *
 *
 * Java looks at that, and initializes
 * an integer array with 10 elements.
 *
 *
 * Then Java assigns each value, in this list, to
 * an array element, in the order we specify here.
 *
 *
 * Element 0 gets assigned the value 1, and
 * element 9 of the array, will get the value 10.
 *
 *
 * To confirm that, I'm printing out
 * the first element in this code.
 *
 *
 * And then, we access a field on the array, called
 * length, that tells us the length of the array.
 *
 *
 * Here, we assign it to a local variable
 * called arrayLength, and print that out.
 *
 *
 * If we run this code,
 *
 *
 * you can see we've got first = 1,
 *
 *
 * and length of array = 10.
 * But what happens, if we
 *
 *
 * want to get the last element, of an array?
 * Let's add another line of code, to get the
 *
 *
 * last element, using the length of the array.
 *
 *
 * I'll print the element
 *
 *
 * But if we run this though, we get an exception.
 *
 *
 * This is an ArrayIndexOutOfBoundsException, and
 *
 *
 * you can see the message, Index
 * 10 out of bounds for length 10.
 *
 *
 * This is a very common error to make.
 * We've been taught to think, starting with 1,
 *
 *
 * not 0, so it's easy to forget,
 * that Java starts indexing with 0.
 *
 *
 * Because it starts with 0, all
 * indices are shifted by one.
 *
 *
 * The last element in an array that
 * has 10 elements, is at index 9.
 *
 *
 * We need to subtract 1 from the
 * length, to get the last index.
 *
 *
 * Let's fix that.
 *
 *
 * I also hope you noticed that we
 * can use variables and expressions,
 *
 *
 * in the square brackets, to access an
 * array element, as we're showing here.
 *
 *
 * The expression or variable needs
 * to evaluate to an integer value.
 *
 *
 * And running that:
 *
 *
 * We get last = 10.
 *
 *
 * Now I've said this array initializer, can
 * only be used in declaration assignments,
 *
 *
 * or method arguments, so let's
 * review what that means for a moment.
 *
 *
 * int[] newArray;
 *
 *
 * And I'll attempt to set the
 *
 *
 * values one to 5 reversed as an array initializer
 *
 *
 * And now, with this code,
 * we've got a compiler error.
 *
 *
 * If we hover our mouse, over that statement, we
 * see that Array Initializer is not allowed here.
 *
 *
 * This means, you can't use the anonymous
 * version of the array initializer,
 *
 *
 * in a statement outside of a declaration statement.
 *
 *
 * But we can use the longer form, so I'll change
 * that now, including new int with square brackets,
 *
 *
 * before the values in curly braces.
 *
 *
 * And this code compiles.
 *
 *
 * Once you have an array, you
 * can loop through the elements,
 *
 *
 * retrieving each value, with the loop index.
 *
 *
 * We can do this with the traditional for loop:
 *
 *
 * for (int i = 0; i &lt; newArray.length; i++) {
 *
 *
 * and I call print on new array
 *
 *
 * element i and add a space after that
 * }
 *
 *
 * What we're doing there is, we're looping through
 * each element, starting from element zero.
 *
 *
 * We start with i = 0,
 *
 *
 * incrementing by one, while i is &lt; newArray.length.
 *
 *
 * And we print out each element, using the
 * loop index to get the current element.
 *
 *
 * We're just printing all of those on a
 * single line, with a space between each.
 *
 *
 * And running that,
 *
 *
 * we can see all the
 * elements in the array get printed
 *
 *
 * Ok, that's our introduction to the
 * basic array, declaring an array, and the
 *
 *
 * different ways to instantiate an array.
 *
 *
 * In the next video, we'll continue
 * to talk a bit more about the array type in Java.
 *
 */

public class ArraysPart1 {

    public static void main(String[] args) {

        // We can declare an array, using the new keyword,
        // and the type of the array, followed by square brackets.
        // Here we're declaring an integer array, called firstTen.
        int[] firstTen;

        // We can then instantiate the array, using the new keyword,
        // the type of the array, followed by square brackets,
        // and the size of the array, in this case 10.
        firstTen = new int[10];

        // We can then assign values to the array elements,
        // using the square brackets, and the index of the element.
        firstTen[0] = 1;
        firstTen[1] = 2;
        firstTen[2] = 3;
        firstTen[3] = 4;
        firstTen[4] = 5;
        firstTen[5] = 6;
        firstTen[6] = 7;
        firstTen[7] = 8;
        firstTen[8] = 9;
        firstTen[9] = 10;

        // We can then print out the first element in the array.
        System.out.println("first = " + firstTen[0]);

        // We can also get the length of the array, using the length field.
        int arrayLength = firstTen.length;
        System.out.println("length of array = " + arrayLength);

        // We can also get the last element, using the length of the array.
        System.out.println("last = " + firstTen[arrayLength - 1]);

        // We can also use an array initializer, to create an array,
        // with the values 1 through 10 in it.
        int[] firstTen2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        // I'll print out the firstTen arrays first elements value
        System.out.println("first = " + firstTen2[0]);

        // Lets save first tens length to a new int variable array length
        arrayLength = firstTen2.length;

        // and print it out using println
        System.out.println("length of array = " + arrayLength);

        // We can also use an anonymous array initializer,
        // to create an array
        int[] newArray = new int[] { 1, 2, 3, 4, 5 };

        // We can then loop through the elements, retrieving each value,
        // with the loop index.
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }

    }

}
