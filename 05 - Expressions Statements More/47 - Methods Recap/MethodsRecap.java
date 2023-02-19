/*
Methods Recap

a method is a group of statements that are executed as a unit.

note: a method is also known as a function.

a method is a way of reducing code duplication.

a method is also used to make code easier to document.

a method is also used to make code easier to maintain.

a method is also used to make code easier to debug.

a method is also used to make code easier to reuse.

a method is also used to make code easier to test.

a method is also used to make code easier to understand.

a method is a way of hiding implementation details.

a method is a way of isolating code from the rest of the program.

a method is a way of naming a group of statements.

a method is a way of grouping together related statements.

a method is a way of passing data into a method.

a method is a way of returning data from a method.

a method can return a value.

a method can return a value of any type.

most common return types are int, double, boolean, and String.

place of return statement is important.

it must be the last statement in the method.

a method can return multiple values.

a method can return no value.

a method can return no value by using the void keyword.

- void is a keyword that means no value.

a method can have parameters.

a method can have zero or more parameters.

difference between a parameter and an argument.

- a parameter is a variable in a method definition.
- an argument is a value passed to a method.

a method can have zero or more arguments.

difference between a function and procedure.

- a function returns a value.
- a procedure does not return a value.

a method can have zero or more return statements.

*/

public class MethodsRecap {
    public static void main(String[] args) {
        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Bob", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Percy", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Gilbert", highScorePosition);
    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position " + highScorePosition + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500) {
            return 2;
        } else if (playerScore >= 100) {
            return 3;
        }

        return 4;
    }
}
