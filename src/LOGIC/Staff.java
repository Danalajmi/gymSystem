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
public class Staff extends Member implements Serializable {

    private String position;
    private String department;

    /**
     * custom constructor
     *
     * @param position
     * @param department
     * @param dateOfBirth
     * @param gender
     * @param type
     * @param fName
     * @param lName
     * @param address
     * @param phone
     */
    public Staff(String position, String department, String dateOfBirth, String gender, String type, String fName, String lName, String address, int phone) {
        super(dateOfBirth, gender, type, fName, lName, address, phone);
        this.position = position;
        this.department = department;
    }

    /**
     * name: getPosition
     *
     * @return String Position
     */
    public String getPosition() {
        return position;
    }

    /**
     * name: setPosition
     *
     * @param position
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * name: getDepartment
     *
     * @return String department
     */
    public String getDepartment() {
        return department;
    }

    /**
     * name: setDepartment
     *
     * @param department
     */
    public void setDepartment(String department) {
        this.department = department;
    }

}
