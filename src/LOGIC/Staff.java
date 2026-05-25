/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LOGIC;

/**
 *
 * @author danalajmi
 */
public class Staff extends Member {
    private String position;
    private String department;

    public Staff(String position, String department, String dateOfBirth, String gender, String type, String fName, String lName, String address, int phone) {
        super(dateOfBirth, gender, type, fName, lName, address, phone);
        this.position = position;
        this.department = department;
    }



    


    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    
    
}
