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
abstract public class Person implements Serializable{
    private String fName;
    private String lName;
    private String address;
    private int phone;
/**
 * custom constructor
 * @param fName
 * @param lName
 * @param address
 * @param phone 
 */
    public Person(String fName, String lName, String address, int phone) {
        this.fName = fName;
        this.lName = lName;
        this.address = address;
        this.phone = phone;
    }

    /**
     *
     */
    public Person() {
    }

/**
 * name: getfName
 * @return String first name
 */
    public String getfName() {
        return fName;
    }
/**
 * name: setfName
 * @param fName 
 */
    public void setfName(String fName) {
        this.fName = fName;
    }
/**
 * name getlName
 * @return String last name
 */
    public String getlName() {
        return lName;
    }

/**
 * name: setlName
 * @param lName 
 */
    public void setlName(String lName) {
        this.lName = lName;
    }
/**
 * name: getAddress
 * @return String address
 */
    public String getAddress() {
        return address;
    }
/**
 * name: setAddress
 * @param address 
 */
    public void setAddress(String address) {
        this.address = address;
    }
/**
 * name: getPhone
 * @return int phone
 */
    public int getPhone() {
        return phone;
    }

/**
 * name: setPhone
 * @param phone 
 */
    public void setPhone(int phone) {
        this.phone = phone;
    }




}
