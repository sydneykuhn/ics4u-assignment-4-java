/*
* This program creates an hourglass using recursion.
*
* @author  Sydney Kuhn
* @version 1.0
* @since   2020-11-23
*/

// Import
import java.util.Scanner;

/**
 * This is the main hour glass.
 * Class Main
 */

final class Main {

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */

    private Main() {
        throw new IllegalStateException("Cannot be instantiated");

    }

    /**
     * This is the hour glass function.
     *
     * @param userInt length of the hourglass.
     * @param center middle of the hourglass.
     */
    static void hourglass(final int userInt, final int center) {

        String userHourglass = "";
        int counterOne;
        int counterTwo;

        for (counterOne = 0; counterOne < center; counterOne++) {
            userHourglass += " ";
        }

        for (counterTwo = 0; counterTwo < userInt; counterTwo++) {
            userHourglass += "* ";
        }
        System.out.println(userHourglass);

        if (userInt > 1) {
            hourglass(userInt - 1, center + 1);
        }
        System.out.println(userHourglass);
    }
    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */

    public static void main(final String[] args) {

        final Scanner userString = new Scanner(System.in);
        try {
            System.out.println("\nAssignment 4");
            System.out.print("Enter an integer : ");
            final int userInt = userString.nextInt();

            if (userInt <= 0) {
                System.out.println("\nInteger must be greater than 1.");
            } else {
                System.out.println("");
                hourglass(userInt, 0);
            }
        } catch (java.util.InputMismatchException ex) {
            System.out.println("\nInvalid input entered.");
        }
        System.out.println("\nDone.");
    }
}
