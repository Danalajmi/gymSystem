/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LOGIC;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author danalajmi
 */
public class Gym implements Serializable{

    private static ArrayList<Member> membersList = new ArrayList<>();
    private static ArrayList<Employee> employeesList = new ArrayList<>();


    public Gym() {
       
    }

    public static ArrayList<Member> getMembersList() {
        return membersList;
    }

    public static void setMembersList(ArrayList<Member> membersList) {
        Gym.membersList = membersList;
    }

    /**
     *
     * @param newMember
     */
    public static void addMember(Member newMember){
        membersList.add(newMember);
    }


    public static ArrayList<Employee> getEmployeesList() {
        return employeesList;
    }


    public static void setEmployeesList(ArrayList<Employee> employeesList) {
        Gym.employeesList = employeesList;
    }
    public static void addEmployee(Employee newEmployee){
        employeesList.add(newEmployee);
        
    }
    
  public static boolean deleteMemberById(int membershipId) {
    Member target = null;

    for (Member m : membersList) {
        if (m.getMembershipID() == membershipId) {
            target = m;
            break;
        }
    }

    if (target != null) {
        boolean removedFromTrainer = false;

        // Remove from trainers’ assigned lists
        for (Employee e : employeesList) {
            if (e instanceof Trainer) {
                Trainer t = (Trainer) e;
                if (t.getAssignedMembers().remove(target)) {
                    removedFromTrainer = true;
                }
            }
        }

        // Remove from members list
        membersList.remove(target);

        return removedFromTrainer;
    }
    return false;
}


}
