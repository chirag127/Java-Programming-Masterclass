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

        int health = 100;
        if (health == 100) {
            System.out.println("This is an expression");
        }

        if ((health == 100) && (highScore == 50)) {
            System.out.println("This is an expression");
        }

        // number of expresions in this code is 5 (including the 2 lines above)
        // they are
        // kilometers = (100 * 1.609344)
        // highScore == 50
        // health == 100
        // health == 100
        // highScore == 50

        // the code below is a statement
        // a statement is a complete unit of execution
        // a statement can be one or more expressions
        // a statement can be a keyword
        // a statement can be a variable declaration
        // a statement can be a method declaration
        // a statement can be a class declaration
        // a statement can be a loop
        // a statement can be a conditional

        
    }
}
