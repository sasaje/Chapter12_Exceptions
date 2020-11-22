/*
 *
 * Developed by Sara Sandager (sara590x@edu.easj.dk)
 * Licensed under the MIT License
 * 22/11/2020
 *
 */

package Assignment12_25;

public class FacultyMember {
    String firstName;
    String lastName;
    String rank; //assistant, associate, full
    double salary;

    //constructor for adding a new facultyMember
    public void addFacultyMember(String firstName, String lastName, String rank, double salary){
        this.firstName = firstName;
        this.lastName = lastName;
        this.rank = rank;
        this.salary = salary;
    }
}
