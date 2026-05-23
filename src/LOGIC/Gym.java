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
public class Gym {

    private static ArrayList<Member> membersList = new ArrayList<>();
    private static ArrayList<Employee> employeesList = new ArrayList<>();
 

    public Gym() {
        Gym.membersList = new ArrayList<>();
        Gym.employeesList = new ArrayList<>();

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

  
}
