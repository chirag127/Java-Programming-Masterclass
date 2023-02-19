/**
 * Local variables and scope
 *
 * A variable is declared within the body of a method. The variable is only visible and accessible within that method
 *
 * A variable declared within the body of a method is called a local variable.
 *
 * The scope of a local variable is the part of the method where the variable is declared.
 *
 * A local variable is created when the method is called and destroyed when the method has completed.
 *
 *
 */

public class LocalVariablesandScope {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        calculateScore(gameOver, score, levelCompleted, bonus);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        calculateScore(gameOver, score, levelCompleted, bonus);
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

}