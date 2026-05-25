/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LOGIC;

<<<<<<< HEAD
=======
import java.io.Serializable;

>>>>>>> 3c2eb58ff75668cedddae4892cf3cb51a5dc68ba
/**
 *
 * @author danalajmi
 */
<<<<<<< HEAD
public class Student extends Member{
=======
public class Student extends Member implements Serializable{
>>>>>>> 3c2eb58ff75668cedddae4892cf3cb51a5dc68ba
    private String course;
    private String team;

    public Student(String course, String dateOfBirth, String gender, String type, String fName, String lName, String address, int phone) {
        super(dateOfBirth, gender, type, fName, lName, address, phone);
        this.course = course;
    }

    public Student(String course, String team, String dateOfBirth, String gender, String type, String fName, String lName, String address, int phone) {
        super(dateOfBirth, gender, type, fName, lName, address, phone);
        this.course = course;
        this.team = team;
    }


    

   

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
    
    
}
