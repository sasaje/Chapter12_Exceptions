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

import java.util.ArrayList;
import java.util.Scanner;

public class ProcessLargeDataset {
    static ArrayList<FacultyMember> facultyMembersList = new ArrayList<>();
    static ArrayList<FacultyMember> associate = new ArrayList<>(); //empty at start
    static ArrayList<FacultyMember> assistant = new ArrayList<>(); //empty at start
    static ArrayList<FacultyMember> full = new ArrayList<>(); //empty at start

    public static void main(String[] args) throws Exception {

        //Create a File instance
        java.io.File file = new java.io.File("src/Assignment12_25/salary.txt");

        //Create a Scanner for the file
        Scanner input = new Scanner(file);

        //Read data from a file
        while(input.hasNext()) {
            String firstName = input.next(); //firstName
            String lastName = input.next(); //lastName
            String rank = input.next(); //rank
            String salary = input.next(); //salary InputMismatchException double type TODO

//          System.out.println(firstName + " " + lastName + " " + rank + " " + salary);
            facultyMembersList.add(new FacultyMember(firstName, lastName, rank, salary));
        }

        for (int i = 0; i < facultyMembersList.size(); i++) {
            if (facultyMembersList.get(i).rank.equals("associate")){
                associate.add(new FacultyMember(facultyMembersList.get(i).firstName, facultyMembersList.get(i).lastName, facultyMembersList.get(i).rank,facultyMembersList.get(i).salary));
            }
        }
        for (int i = 0; i < facultyMembersList.size(); i++) {
            if (facultyMembersList.get(i).rank.equals("assistant")){
                assistant.add(new FacultyMember(facultyMembersList.get(i).firstName, facultyMembersList.get(i).lastName, facultyMembersList.get(i).rank,facultyMembersList.get(i).salary));
            }
        }
        for (int i = 0; i < facultyMembersList.size(); i++) {
            if (facultyMembersList.get(i).rank.equals("full")){
                full.add(new FacultyMember(facultyMembersList.get(i).firstName, facultyMembersList.get(i).lastName, facultyMembersList.get(i).rank,facultyMembersList.get(i).salary));
            }
        }

        System.out.println("The number of facultyMembers: " + associate.size());
        System.out.println("The number of facultyMembers: " + facultyMembersList.size());
        System.out.println("Their data is: ");
        showFacultyMembers();

        System.out.println("Associate: " + associate.size());
        System.out.println("Assistant: " + assistant.size());
        System.out.println("Full: " + full.size());

        //Close the file
        input.close();
    }

    public static void showFacultyMembers(){
        // Printing every element's parameters as String
        for(int i = 0; i < facultyMembersList.size(); i++){
            int x=i+1;
            System.out.println(facultyMembersList.get(i).firstName+ " "  + facultyMembersList.get(i).lastName + " " + facultyMembersList.get(i).rank+ " " + facultyMembersList.get(i).salary);
        }
    }

    public String toString(String firstName, String lastName, String rank, String salary) {
        return firstName + lastName + rank + salary;
    }
}