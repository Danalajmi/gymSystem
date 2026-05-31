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
public class Gym implements Serializable {

    private static ArrayList<Member> membersList = new ArrayList<>();
    private static ArrayList<Employee> employeesList = new ArrayList<>();

    public Gym() {

    }

    /**
     * Name: getMembersList
     *
     * @return gym's members
     */
    public static ArrayList<Member> getMembersList() {
        return membersList;
    }

    /**
     * Name setMembersList
     *
     * @param membersList
     */
    public static void setMembersList(ArrayList<Member> membersList) {
        Gym.membersList = membersList;
    }

    /**
     * Name: addMember
     *
     * @param newMember
     */
    public static void addMember(Member newMember) {
        membersList.add(newMember);
    }

    /**
     * Name: getEmployeesList
     *
     * @return employeesList
     */
    public static ArrayList<Employee> getEmployeesList() {
        return employeesList;
    }

    /**
     * name: setEmployeesList
     *
     * @param employeesList
     */
    public static void setEmployeesList(ArrayList<Employee> employeesList) {
        Gym.employeesList = employeesList;
    }

    /**
     * name: addEmployee Purpose: add employee to gym's list
     *
     * @param newEmployee
     */
    public static void addEmployee(Employee newEmployee) {
        employeesList.add(newEmployee);

    }

}
