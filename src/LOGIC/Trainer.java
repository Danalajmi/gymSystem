/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LOGIC;
import java.util.ArrayList;

/**
 *
 * @author danalajmi
 */
public class Trainer extends Employee {
    
    private ArrayList<Member> assignedMembers;

    public Trainer(double salary, String fName, String lName, String address, int phone, boolean isTrainer) {
        super(salary, fName, lName, address, phone, isTrainer);
        this.assignedMembers = new ArrayList<>();
    }

    

    public ArrayList<Member> getAssignedMembers() {
        return assignedMembers;
    }

    public void setAssignedMembers(ArrayList<Member> assignedMembers) {
        this.assignedMembers = assignedMembers;
    }

    
   
    
    
    
}
