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
public class Employee extends Person implements Serializable{
    private static final long serialVersionUID = 1L;

    public void setSalary(double salary) {
        this.salary = salary;
    }


    private int staffID;
    private static int ID = 100;
    private double salary;
    private String type;
    /**
     *
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
     *
     */
    public Employee() {
    }

/**
 *
 * @return
 */
    public int getStaffID() {
        return staffID;
    }

    /**
     *
     * @return
     */
    public double getSalary() {
        return salary;
    }

    /**
     *
     * @return
     */
    public String getType() {
        return type;
    }
/**
 *
 * @param type
 */
    public void setType(String type) {
        this.type = type;
    }



}
