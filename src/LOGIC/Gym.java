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

    private ArrayList<Member> membersList;
    private ArrayList<Employee> employeesList;
 

    public Gym() {
        this.membersList = new ArrayList<>();
        this.employeesList = new ArrayList<>();

    }

    public ArrayList<Member> getMembersList() {
        return membersList;
    }

    public void setMembersList(ArrayList<Member> membersList) {
        this.membersList = membersList;
    }
    
    
    public void addMember(Member newMember){
        membersList.add(newMember);
    }
    
    
    public ArrayList<Employee> getEmployeesList() {
        return employeesList;
    }
    

    public void setEmployeesList(ArrayList<Employee> employeesList) {
        this.employeesList = employeesList;
    }
    public void addEmployee(Employee newEmployee){
        employeesList.add(newEmployee);
    }

  
}
