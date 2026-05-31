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
public class Student extends Member implements Serializable{
    private String course;
    private String team;

    
    /**
     * custom constructor -- student isn't in a sports team
     * @param course
     * @param dateOfBirth
     * @param gender
     * @param type
     * @param fName
     * @param lName
     * @param address
     * @param phone 
     */
    public Student(String course, String dateOfBirth, String gender, String type, String fName, String lName, String address, int phone) {
        super(dateOfBirth, gender, type, fName, lName, address, phone);
        this.course = course;
    }
    
    /**
     * custom constructor -- student in a sports team
     * @param course
     * @param team
     * @param dateOfBirth
     * @param gender
     * @param type
     * @param fName
     * @param lName
     * @param address
     * @param phone 
     */

    public Student(String course, String team, String dateOfBirth, String gender, String type, String fName, String lName, String address, int phone) {
        super(dateOfBirth, gender, type, fName, lName, address, phone);
        this.course = course;
        this.team = team;
    }
/**
 * name: getCourse
 * @return String course
 */
    public String getCourse() {
        return course;
    }
/**
 * name: setCourse
 * @param course 
 */
    public void setCourse(String course) {
        this.course = course;
    }

/**
 * name: getTeam
 * @return String team
 */    
    public String getTeam() {
        return team;
    }
/**
 * name: setTeam
 * @param team 
 */
    public void setTeam(String team) {
        this.team = team;
    }


}
