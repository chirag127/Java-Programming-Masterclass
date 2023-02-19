/*
Methods in Java

Methods are a way to organize code into logical units.
Methods are used to perform a specific task
Methods are also used to reuse code
Methods are also used to make code easier to read and understand.
Methods are also used to make code easier to maintain.
Methods are also used to make code easier to debug.
Methods are also used to make code easier to test.
Methods are also used to make code easier to reuse.
Methods are also used to make code easier to extend.
Methods are also used to make code easier to refactor.
Methods are also used to make code easier to understand.
Methods are also used to make code easier to document.
Methods are also used to make code easier to maintain.


A method is a group of statements that are executed as a unit.

note: a method is also known as a function.

a method is a way of reducing code dupelication.




*/

// public class MethodsinJava {
//     public static void main(String[] args) {
//         boolean gameOver = true;
//         int score = 800;
//         int levelCompleted = 5;
//         int bonus = 100;

//         if (gameOver) {
//             int finalScore = score + (levelCompleted * bonus);
//             System.out.println("Your final score was " + finalScore);
//         }

//         score = 10000;
//         levelCompleted = 8;
//         bonus = 200;

//         if (gameOver) {
//             int finalScore = score + (levelCompleted * bonus);
//             System.out.println("Your final score was " + finalScore);
//         }
//     }
// }

// using a method to reduce code duplication

// public class MethodsinJava {
//     public static void main(String[] args) {
//         boolean gameOver = true;
//         int score = 800;
//         int levelCompleted = 5;
//         int bonus = 100;

//         calculateScore(gameOver, score, levelCompleted, bonus);

//         score = 10000;
//         levelCompleted = 8;
//         bonus = 200;

//         calculateScore(gameOver, score, levelCompleted, bonus);
//     }

//     public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

//         if (gameOver) {
//             int finalScore = score + (levelCompleted * bonus);
//             finalScore += 2000;
//             System.out.println("Your final score was " + finalScore);
//             return finalScore;
//         }

//         return -1;

//     }
// }

// using parameters to send the values

public class MethodsinJava {
    public static void main(String[] args) {
        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println("Your final score was " + highScore);

        highScore = calculateScore(false, 10000, 8, 200);
        System.out.println("Your final score was " + highScore);

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Bob", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);

        highScorePosition = calculateHighScorePosition(50);

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score was " + finalScore);
            return finalScore;
        }

        return -1;

    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(
                playerName + " managed to get into position " + highScorePosition + " on the high score table");
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
