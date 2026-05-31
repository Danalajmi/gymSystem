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
public class Member extends Person implements Serializable {

    private int membershipID;
    private static int ID = 100;
    private String dateOfBirth;
    private String gender;
    private String type;

    /**
     *
     */
    public Member() {
    }

    /**
     * Purpose: custom constructor with these parameter
     *
     * @param dateOfBirth
     * @param gender
     * @param type
     * @param fName
     * @param lName
     * @param address
     * @param phone
     */
    public Member(String dateOfBirth, String gender, String type, String fName, String lName, String address, int phone) {
        super(fName, lName, address, phone);
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.type = type;
        this.membershipID = ID++;
    }

    /**
     * name: getType
     *
     * @return String type
     */
    public String getType() {
        return type;
    }

    /**
     * name: getMembershipID
     *
     * @return int - membership id
     */
    public int getMembershipID() {
        return membershipID;
    }

    /**
     * name: getDateOfBirth
     *
     * @return String Date of birth
     */
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * name getGender
     *
     * @return String gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * name: setDateOfBirth
     *
     * @param dateOfBirth
     */
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * name: setGender
     *
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * name: setType
     *
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * name: getID
     *
     * @return static ID
     */
    public static int getID() {
        return ID;
    }

    /**
     * name: setID
     *
     * @param ID
     */
    public static void setID(int ID) {
        Member.ID = ID;
    }

}
