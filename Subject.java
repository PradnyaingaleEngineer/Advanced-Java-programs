package com.association;

public class Subject {

    private String subName;

    public Subject(String subName) {
        this.subName = subName;
    }

    public Subject() {
        //TODO Auto-generated constructor stub
    }

    public String getSubName() {
        return subName;
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }

    @Override
    public String toString() {
        return "Subject [subName=" + subName + "]";
    }

    
}
