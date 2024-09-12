package com.association;

import java.util.List;


public class Student {

    private int rollNo;
    private String name;

    private Address address;

    private List<Subject> subjectsList;

    public Student() {
    }

    public Student(int rollNo, String name, Address address, List<Subject> subjectsList) {
        this.rollNo = rollNo;
        this.name = name;
        this.address = address;
        this.subjectsList = subjectsList;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Subject> getSubjectsList() {
        return subjectsList;
    }

    public void setSubjectsList(List<Subject> subjectsList) {
        this.subjectsList = subjectsList;
    }

    @Override
    public String toString() {
        return "Student [rollNo=" + rollNo + ", name=" + name + ", address=" + address + ", subjectsList="
                + subjectsList + "]";
    }


    
    

  
    
}
