/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LOGIC;

/**
 *
 * @author danalajmi
 */
public class Member extends Person{
  
    private int membershipID;
    private static int ID = 100;
    private String dateOfBirth;
    private char gender;

    public Member() {
    }

    public Member(String dateOfBirth, char gender, String fName, String lName, String address, int phone) {
        super(fName, lName, address, phone);
        this.dateOfBirth = dateOfBirth;
        this.membershipID = ID++;
        this.gender = gender;
    }

   

   
    public int getMembershipID() {
        return membershipID;
    }


    public String getDateOfBirth() {
        return dateOfBirth;
    }

    
    public char getGender() {
        return gender;
    }
    
    
}
