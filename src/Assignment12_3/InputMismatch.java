/*
 *
 * Developed by Sara Sandager (sara590x@edu.easj.dk)
 * Licensed under the MIT License
 * 14/11/2020
 *
 */

package Assignment12_3;

/*
* The previous program works well as long as the user enters an integer. Otherwise, you may get another kind of exception.
* For instance, if you use nextInt() of Scanner, you could have an InputMismatchException. Modify it to prevent users
* entering anything other than an integer.
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatch {

    static String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
            "October", "November", "December" };
    static int[] dom = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter two numbers between 1 and 12: ");

        boolean continueInput = true;

        do {
            try {
                int userInput = input.nextInt();
                int userInput2 = input.nextInt();
                System.out.println("You entered: " + userInput + " and " + userInput2);
                System.out.println("Which is the month: " + months[userInput - 1] + " with " + dom[userInput - 1] + " number of days.");
                System.out.println("Which is the month: " + months[userInput2 - 1] + " with " + dom[userInput2 - 1] + " number of days.");

                continueInput = false;

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Wrong number");
                System.out.println("Please enter a number between 1 and 12");
            } catch (InputMismatchException e) {
                System.out.println("Try again. (Incorrect input: an integer is required)");
                input.nextLine(); // Discard input
            }
        } while (continueInput);
    }
}
