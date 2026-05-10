/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LOGIC;

/**
 *
 * @author danalajmi
 */
public class Employee extends Person{
    

    private int staffID; 
    private static int ID = 100;
    private double salary;

    /**
     *
     * @param salary
     * @param fName
     * @param lName
     * @param address
     * @param phone
     */
    public Employee(double salary, String fName, String lName, String address, int phone) {
        super(fName, lName, address, phone);
        this.staffID = ID++;
        this.salary = salary;
    }

   
    
    public Employee() {
    }


    public int getStaffID() {
        return staffID;
    }


    public double getSalary() {
        return salary;
    }
    
    
}
