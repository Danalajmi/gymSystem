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
public class Employee extends Person implements Serializable {
    //private static final long serialVersionUID = 1L;

    /**
     *
     * @param salary
     */

    public void setSalary(double salary) {
        this.salary = salary;
    }

    private int staffID;
    private static int ID = 100;
    private double salary;
    private String type;

    /**
     * @author Dana Alajmi Purpose: Employee constructor
     * @param salary
     * @param fName
     * @param lName
     * @param address
     * @param phone
     * @param type
     */
    public Employee(double salary, String fName, String lName, String address, int phone, String type) {
        super(fName, lName, address, phone);
        this.staffID = ID++;
        this.salary = salary;
        this.type = type;
    }

    /**
     * Purpose default constructor
     */
    public Employee() {
    }

    /**
     * Name: getStaffID
     *
     * @author Dana Alajmi Purpose/description: get employee id
     * @return int - staff id
     */
    public int getStaffID() {
        return staffID;
    }

    /**
     * Name: getSalary
     *
     * @author Dana Alajmi Purpose/description: get employee salary
     * @return double - employee salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Name: getTypr
     *
     * @author Fatima Hussain Purpose/description: get staff type
     * @return String - employee type: PT/E
     */
    public String getType() {
        return type;
    }

    /**
     * Name: setType
     *
     * @author Fatima Hussain Purpose/description: Change staff Type
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Name: getID
     *
     * @author Dana Alajmi Purpose/description: get static id to serialize
     * @return int - static id
     */
    public static int getID() {
        return ID;
    }

    /**
     * Name: setID
     *
     * @author Dana Alajmi Purpose/description: set static id in deserialisation
     * @param ID
     */
    public static void setID(int ID) {
        Employee.ID = ID;
    }

}
