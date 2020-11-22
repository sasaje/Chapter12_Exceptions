/*
 *
 * Developed by Sara Sandager (sara590x@edu.easj.dk)
 * Licensed under the MIT License
 * 14/11/2020
 *
 */

package Assignment12_25;
/*
* A university posts its employees' salaries at http://liveexample.pearsoncmg.com/data/Salary.txt.
* Each line in the file consists of a faculty member's first name, last name, rank, and salary (Se assignment 12.24).
* Write a program to display the total salary for assistant professors, associate professors, full professors, and
* faculty, respectively, and display the average salary for assistant professors, associate professors,
* full professors, and faculty, respectively.
*/

import java.util.Scanner;

public class ProcessLargeDataset {

    public static void main(String[] args) throws Exception {

        //Create a File instance
        java.io.File file = new java.io.File("src/Assignment12_25/salary.txt");

        //Create a Scanner for the file
        Scanner input = new Scanner(file);

        //Read data from a file
        while(input.hasNext()){
            String firstName = input.next(); //firstName
            String lastName = input.next(); //lastName
            String rank = input.next(); //rank
            String salary = input.next(); //salary double

            System.out.println(firstName + " " + lastName + " " + rank + " " + salary);
        }

        //Close the file
        input.close();
    }
}
