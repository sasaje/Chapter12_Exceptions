/*
 *
 * Developed by Sara Sandager (sara590x@edu.easj.dk)
 * Licensed under the MIT License
 * 14/11/2020
 *
 */

package Assignment12_2;

/*
* Using the two arrays shown below, write a program that prompts the user to enter two integers between 1 and 12 and then
* displays the months and its number of days corresponding to the integer entered. Your program should display
* "wrong number" if the user enters a wrong number by catching ArrayIndexOutOfBoundsException.
*/

import java.util.Scanner;

public class ArrayIndexOutOfBounds {

    static String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
                        "October", "November", "December" };
    static int[] dom = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter two numbers between 1 and 12: ");

        try {
            int userInput = input.nextInt();
            int userInput2 = input.nextInt();
            System.out.println("You entered: " + userInput + " and " + userInput2);
            System.out.println("Which is the month: " + months[userInput-1] + " with " + dom[userInput-1] + " number of days.");
            System.out.println("Which is the month: " + months[userInput2-1] + " with " + dom[userInput2-1] + " number of days.");

        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Wrong number");
            System.out.println("Please enter a number between 1 and 12");
        }
    }
}
