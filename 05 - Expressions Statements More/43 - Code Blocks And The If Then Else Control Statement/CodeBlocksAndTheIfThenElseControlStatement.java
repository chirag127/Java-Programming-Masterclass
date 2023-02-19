/*
Code Blocks And The If Then Else Control Statement


A code block is a group of one or more statements between balanced braces and can be used anywhere in a program where a single statement is allowed. A code block is used to group together zero or more statements.

The if then else control statement is used to perform different actions based on different conditions.

*/

public class CodeBlocksAndTheIfThenElseControlStatement {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        if (score == 5000) {
            System.out.println("Your score was 5000");
        } else if (score < 5000) {
            System.out.println("Your score was less than 5000");
        } else {
            System.out.println("Got here");
        }

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }


        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
    }
}