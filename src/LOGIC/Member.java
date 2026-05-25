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
public class Member extends Person{
=======
public class Member extends Person implements Serializable{
>>>>>>> 3c2eb58ff75668cedddae4892cf3cb51a5dc68ba
  
    private int membershipID;
    private static int ID = 100;
    private String dateOfBirth;
    private String gender;
    private String type;

    public Member() {
    }

<<<<<<< HEAD

=======
>>>>>>> 3c2eb58ff75668cedddae4892cf3cb51a5dc68ba
    public Member(String dateOfBirth, String gender, String type, String fName, String lName, String address, int phone) {
        super(fName, lName, address, phone);
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.type = type;
        this.membershipID = ID++;
    }

<<<<<<< HEAD
=======



>>>>>>> 3c2eb58ff75668cedddae4892cf3cb51a5dc68ba
   

   
    public int getMembershipID() {
        return membershipID;
    }


    public String getDateOfBirth() {
        return dateOfBirth;
    }

    
    public String getGender() {
        return gender;
    }
    
<<<<<<< HEAD

=======
    
>>>>>>> 3c2eb58ff75668cedddae4892cf3cb51a5dc68ba
}
