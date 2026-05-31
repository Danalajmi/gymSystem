/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LOGIC;
import java.io.Serializable;
import java.util.ArrayList;


public class Trainer extends Employee implements Serializable{

    private ArrayList<Member> assignedMembers;
/**
 * custom constructor
 * @param salary
 * @param fName
 * @param lName
 * @param address
 * @param phone
 * @param type 
 */
    public Trainer(double salary, String fName, String lName, String address, int phone, String type) {
        super(salary, fName, lName, address, phone, type);
        this.assignedMembers = new ArrayList<>();
    }


/**
 * name: getAssignedMembers
 * @return ArrayList<Member>
 */
    public ArrayList<Member> getAssignedMembers() {
        return assignedMembers;
    }
/**
 * name: setAssignedMember
 * @param assignedMembers 
 */
    public void setAssignedMembers(ArrayList<Member> assignedMembers) {
        this.assignedMembers = assignedMembers;
    }

    /**
     * name: addMember
     * @param newMember 
     */
    public void addMember(Member newMember){
        this.assignedMembers.add(newMember);
    }




}
