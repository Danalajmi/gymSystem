/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LOGIC;

import java.io.Serializable;

/**
 *
 * @author danalajmi
 */
public class Member extends Person implements Serializable{
    
private static final long serialVersionUID = 3119492020456487270L;
    private int membershipID;
    private static int ID = 100;
    private String dateOfBirth;
    private String gender;
    private String type;

    public Member() {
    }

    public Member(String dateOfBirth, String gender, String type, String fName, String lName, String address, int phone) {
        super(fName, lName, address, phone);
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.type = type;
        this.membershipID = ID++;
    }

    public String getType() {
        return type;
    }




    public int getMembershipID() {
        return membershipID;
    }


    public String getDateOfBirth() {
        return dateOfBirth;
    }


    public String getGender() {
        return gender;
    }

    public void setMembershipID(int membershipID) {
        this.membershipID = membershipID;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setType(String type) {
        this.type = type;
    }

    
    
}
