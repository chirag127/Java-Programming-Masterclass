/**

 * In the last video, I introduced you to the Java array. I talked about how to declare an array, how to initialize the elements in an array, and how to access elements in it, using the square brackets and an index. An array is a special class in Java. It's still a class. The array, like all other classes, ultimately inherits from java. lang. Object. Getting back to the code, where we left off in the last video. In the ArraysProject, we used an array initializer to create an integer array, and set the elements in the array, to be the numbers from 5 down to 1. Now, instead of doing this, we can use a loop to assign all the values, with an expression or calculation. First, I'll comment out the statement with the array initializer. Then I'll create an uninitialized array: Let's run this. Here, you can see we get all zero's printed. When you don't use an array initializer statement, all array elements get initialized to the default value for that type. For primitive types, this is zero for any kind of numeric primitive, like int, double or short. For booleans, the default value will be false. And for any class type, the elements will be initialized to null. For our array, an integer array, zero gets assigned to each element in the array by default, and you can see that here, in the output. Now, let's use the basic for loop to assign the values, as we had them before, in reverse order. And I'll insert that before the loop that prints out the values. The loop set up is the same as before, but inside the loop, you can see we're assigning each element in the loop. We're using the square brackets and the loop variable, i, within the brackets, to assign a value to each array element. And it gets assigned whatever the value will be, when the current index is subtracted from the length of the array. When this is 0 to start, we get the length of the array as the first value, which is 5. And when we reach the max value, which I've said was 4, the element will get the value 1. Now, if I run it, You can see we get the numbers printed from 5 to 1. You can use a loop, to populate and initialize elements in an array as I did here. And I've used a traditional for loop to do that, as well as print out the elements. Java has another for statement, they call it the enhanced for loop, but it's also sometimes known as the for-each loop. I've mentioned this for loop, and I said I'd talk about it when we got to arrays and collections. This loop was designed to walk through elements in an array, or some other type of collection. It processes one element at a time, from the first element to the last. Here I show you the syntax for the two types of for loop statements, side by side. The enhanced for loop only has two components, vs. 3, defined in the parentheses after the for keyword. It's important to notice, that the separator character between components, is a colon, and not a semi-colon, for the Enhanced For Loop. The first part is a declaration expression, which includes the type and a variable name. This is usually a local variable with the same type as an element in the array. And the second component is the array, or some other collection variable. Let's see this for loop in action. Let's do what the last for loop did in our code, which was to loop through each element in the array, and print each value out. But this time, I'll use the for-each, or enhanced for loop, to do it: I'll call println to make some space And print out element using print with a space after it First, we just print a new line there, because the previous output didn't include it. Now we've got the enhanced for loop code. Notice that it looks similar to a traditional for loop, but it uses a colon, and not semi-colons, and expects only two components in the parentheses. The first component just needs to be a declared variable. In this case, we're looping through an array of integers, so we want to set this variable to an int type. And here, rather than just the letter i, I'm purposely using something more descriptive. This is because the variable is the actual element, it's not the array index we're looping through. And the second part, on the right side of the colon, in the parentheses, is the thing we're looping over. In this case, it's our integer array, newArray. And now, in the print statement, we don't have to use an index to get the element from the array. The enhanced for loop gets it for us, and stores it in that local variable, element. In this case, we don't have to know what the index is at all. If we wanted it or needed it, we'd probably use the traditional for loop. If I run that, we get the exact same output, the values 5 through 1 are printed out. That's rather a nice thing, because you don't have to deal with the array index position. The enhanced for loop gives you a simpler, less error-prone option, if all you need to do is process the elements from start to finish, and you aren't trying to set, swap, or sort elements. Ok, so you might be asking, can't we just print the whole array, using System. out. println? Let's try that next. Add a call to println to make some more space and print out new array And what happens if I run that? We get this strange thing printed out, and not a neatly formatted list of our array elements. Yours might look different from mine, but that's okay. I'll explain the numbers and letters shortly. You'll remember this is Java's toString method that gets called. And I've said our array, is really just a special Java class. But the array class doesn't print the elements out neatly for us, as we might hope. In other words, it doesn't override the toString method, so it uses java. lang. Object's toString method. And this gives us the left square bracket with a capital I, which means it's a primitive integer array, and then it's followed by the hexadecimal representation, of the hash code. This is not likely to be very helpful to you, as you examine and manipulate your array. However, Java does provide a helper class, which contains a lot of static methods, which we can use for arrays. And this class is the java. util. Arrays class. Java's array type is very basic, it comes with very little built-in functionality. It has a single property or field, named length. And it inherits java. util. Object's functionality. Java provides a helper class named java. util. Arrays, providing common functionality, you'd want for many array operations. These are static methods on Arrays, so are class methods, not instance methods. In the next video, we'll be looking at this class in a lot more detail. For now, we'll use one method on this class, to print out the elements in our array, and this method is Arrays. toString(). The toString method on this helper class, prints out all the array elements, comma delimited, and contained in square brackets The output from this method is shown here, conceptually. It prints the element at index 0 first, followed by a comma, then element at index 1 next, comma, and so on, until all elements are printed. Let's see what this looks like for our integer array. I'm going to replace that last System. out. println statement in our code, with a different one. And now, if I run that, we see that we get our 5 elements printed out, in square brackets, and comma delimited. That's a handy method, which may be all you need, if you just want your elements printed in a single string this way. One other thing, you should know, is that you can assign any array, to an Object variable. Let's look at this more closely. print out the string literal object variable is really an int array if that is the case In this code, we're assigning an integer array reference, to an object reference. And notice here, we can still use the instanceof operator, using an array type on the right side of the operand. This operand will test if our Object variable, is really an instance of an integer array. An array is a special class, recognized by Java through the use of the square brackets. It still inherits from the java. lang. Object class. You might ask, why we'd do something like this? Well, in fact, you could create an array of Objects, that supports any kind of type in Java. Let's look at that now: Set element zero of object array to the string literal Hello set element one of object array to a new instance of String builder initialized with string literal World In this code, we're creating an array of Objects, and this array will hold 3 object references. And now, we can assign any object reference, of any type, to the elements in this array. First, we assign it a String literal, and then we assign it a StringBuilder instance. You could assign an object, of any of your own classes, to this kind of array. This is one way of having an array of many different types. I'm not saying this is good practice, but I did want to point out that you could do this with arrays. Later, we'll learn more elegant ways, to support different types in arrays. And because we know an array is an object, you can assign an array to be an element, of this type of Object array: set element two of object array to new array We've got an array of Objects, and one of the elements is an array of integers. This is a nested array. We'll be looking at this in more detail, when I talk about multi-dimensional arrays. But what's important for you to understand right now is, an array can be treated like any other object instance in Java. So those are the basics, for the array. In the next video, we're going to discuss the java. util. Arrays class in more detail. This is a helper class you'll want to get to know better, because there's no need for you to write a lot of code, since Java provides so much functionality for us. I'll see you in that next video.

 */

public class ArraysPart2{

    public static void main(String[] args) {
        int[] myIntArray = new int[10];
        myIntArray[5] = 50;
        double[] myDoubleArray = new double[10];
        System.out.println(myIntArray[5]);
        System.out.println(myIntArray[0]);
        System.out.println(myIntArray[6]);
        System.out.println(myIntArray[7]);
        System.out.println(myIntArray[8]);
        System.out.println(myIntArray[9]);
        System.out.println();

        for (int i = 0; i < myIntArray.length; i++) {
            System.out.print(myDoubleArray[i]);

        }
        System.out.println();
        System.out.println();

        int[] myIntArray2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println(myIntArray2[0]);
        System.out.println(myIntArray2[1]);
        System.out.println(myIntArray2[2]);
        System.out.println(myIntArray2[3]);
        System.out.println(myIntArray2[4]);
        System.out.println(myIntArray2[5]);
        System.out.println(myIntArray2[6]);
        System.out.println(myIntArray2[7]);
        System.out.println(myIntArray2[8]);
        System.out.println(myIntArray2[9]);
        System.out.println();

        int[] myIntArray3 = new int[25];
        for (int i = 0; i < myIntArray3.length; i++) {
            myIntArray3[i] = i * 10;
        }
        printArray(myIntArray3);
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + ", value is " + array[i]);
        }
    }
}


/** Output:
 *
 * 50
 * 0
 * 0
 * 0
 * 0
 */

 