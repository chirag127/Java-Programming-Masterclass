/*
Keywords and Expressions

java have 51 keywords
abstract
assert
boolean
break
etc...

you don't have to memorize all of them
but you have to know the difference between keywords and expressions

Keywords are reserved words that have special meaning in java
Expressions are building blocks of all java programs
*/

public class KeywordsandExpressions {
    public static void main(String[] args) {
        // a mile is equal to 1.609344 kilometers
        double kilometers = (100 * 1.609344);

        System.out.println(kilometers);
        
        int highScore = 50;
        if (highScore == 50) {
            System.out.println("This is an expression");
        }
    }
}
