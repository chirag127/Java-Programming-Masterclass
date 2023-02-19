/**
 * Parsing Values and Reading Input using Systemconsole
 * The Scanner class is used to read input from the keyboard
 *
 * The Scanner class is in the java.util package
 *
*/

public class ParsingValuesandReadingInputusingSystemconsole {
    public static String getInputFromConsole(String prompt) {
        String name = System.console().readLine(prompt);
        return name;
    }

    public static void main(String[] args) {
        String name = getInputFromConsole("Enter your name: ");
        System.out.println("Your name is " + name);

        int age = Integer.parseInt(getInputFromConsole("Enter your age: "));
        System.out.println("Your age is " + age);

        double height = Double.parseDouble(getInputFromConsole("Enter your height: "));
        System.out.println("Your height is " + height);

        double weight = Double.parseDouble(getInputFromConsole("Enter your weight: "));

        double bmi = weight / (height * height);

        System.out.println("Your BMI is " + bmi);

        float f = Float.parseFloat("3.14");
        System.out.println(f);
        
    }

}
