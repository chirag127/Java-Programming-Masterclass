/*
 * More switch statement
 * Compare this snippet from 06 - Control Flow/56 - The switch statement/Theswitchstatement.java:
 *         int value = 1;
 *         if (value == 1) {
 *             System.out.println("Value was 1");
 *         } else if (value == 2) {
 *             System.out.println("Value was 2");
 *         } else {
 *             System.out.println("Was not 1 or 2");
 *         }
 *
 *         int switchValue = 3;
 *
 *         switch (switchValue) {
 *             case 1:
 *                 System.out.println("Value was 1");
 *                 break;
 *
 *             case 2:
 *                 System.out.println("Value was 2");
 *                 break;
 *
 *             case 3: case 4: case 5:
 *                 System.out.println("Was a 3, or a 4, or a 5");
 *                 System.out.println("Actually it was a " + switchValue);
 *                 break;
 *
 *             default:
 *                 System.out.println("Was not 1 or 2");
 *                 break;
 *         }
 *
 *         // Create a new switch statement using char instead of int
 *         // create a new char variable
 *         // create a switch statement testing for
 *         // A, B, C, D or E
 *         // display a message if any of these are found and then break
 *         // Add a default which displays a message saying not found
 *
 *         char charValue = 'A';
 *
 *         switch (charValue) {
 *             case 'A':
 *                 System.out.println("A was found");
 *                 break;
 *
 *             case 'B':
 *                 System.out.println("B was found");
 *                 break;
 *
 *             case 'C': case 'D': case 'E':
 *                 System.out.println(charValue + " was found");
 *                 break;
 *
 *             default:
 *                 System.out.println("Could not find A, B, C, D or E");
 *                 break;
 *         }
 *
 *         String month = "January";
 *         switch (month.toLowerCase()) {
 *             case "january":
 */


public class MoreSwitchStatement {
    public static void main(String[] args) {
        int value = 1;
        if (value == 1) {
            System.out.println("Value was 1");
        } else if (value == 2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Was not 1 or 2");
        }

        int switchValue = 3;

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("Was a 3, or a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
                break;

            default:
                System.out.println("Was not 1 or 2");
                break;
        }

        // Create a new switch statement using char instead of int
        // create a new char variable
        // create a switch statement testing for
        // A, B, C, D or E
        // display a message if any of these are found and then break
        // Add a default which displays a message saying not found

        char charValue = 'A';

        switch (charValue) {
            case 'A':
                System.out.println("A was found");
                break;

            case 'B':
                System.out.println("B was found");
                break;

            case 'C': case 'D': case 'E':
                System.out.println(charValue + " was found");
                break;

            default:
                System.out.println("Could not find A, B, C, D or E");
                break;
        }

        String month = "January";
        switch (month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not sure");
        }


    }

    public static void getQuarters() {
        int month = 1;
        switch (month) {
            case 1: case 2: case 3:
                System.out.println("Q1");
                break;
            case 4: case 5: case 6:
                System.out.println("Q2");
                break;
            case 7: case 8: case 9:
                System.out.println("Q3");
                break;
            case 10: case 11: case 12:
                System.out.println("Q4");
                break;
            default:
                System.out.println("Invalid month");
        }
    }

    private static void enhancedGetQuartersSwitch(int month) {
        switch (month) {
            case 1: case 2: case 3:
                System.out.println("Q1");
                break;
            case 4: case 5: case 6:
                System.out.println("Q2");
                break;
            case 7: case 8: case 9:
                System.out.println("Q3");
                break;
            case 10: case 11: case 12:
                System.out.println("Q4");
                break;
            default:
                System.out.println("Invalid month");
        }
    }

    /**
     * Enhanced switch statement
     * @param month
     */
    public static void enhancedGetQuartersSwitchWithArrow(int month) {

        switch (month) {
            case 1, 2, 3 -> System.out.println("Q1");
            case 4, 5, 6 -> System.out.println("Q2");
            case 7, 8, 9 -> System.out.println("Q3");
            case 10, 11, 12 -> System.out.println("Q4");
            default -> System.out.println("Invalid month");
        }
    }


}
