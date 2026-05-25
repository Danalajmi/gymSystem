/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LOGIC;
<<<<<<< HEAD
=======
import java.io.Serializable;
>>>>>>> 3c2eb58ff75668cedddae4892cf3cb51a5dc68ba
import java.util.ArrayList;

/**
 *
 * @author danalajmi
 */
<<<<<<< HEAD
public class Trainer extends Employee {
=======
public class Trainer extends Employee implements Serializable{
>>>>>>> 3c2eb58ff75668cedddae4892cf3cb51a5dc68ba
    
    private ArrayList<Member> assignedMembers;

    public Trainer(double salary, String fName, String lName, String address, int phone, String type) {
        super(salary, fName, lName, address, phone, type);
        this.assignedMembers = new ArrayList<>();
    }

    

    public ArrayList<Member> getAssignedMembers() {
        return assignedMembers;
    }

    public void setAssignedMembers(ArrayList<Member> assignedMembers) {
        this.assignedMembers = assignedMembers;
    }

<<<<<<< HEAD
    
=======
    public void addMember(Member newMember){
        this.assignedMembers.add(newMember);
    }
>>>>>>> 3c2eb58ff75668cedddae4892cf3cb51a5dc68ba
   
    
    
    
}
