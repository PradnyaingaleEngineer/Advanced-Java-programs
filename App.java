package com.association;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        Student first = new Student();
        first.setRollNo(10);
        first.setName("ABC");

        Address address = new Address();
        address.setLaneNo(1);
        address.setLandMark("GB Road");
        address.setCity("Mumbai");
        address.setArea("Shelu");

        first.setAddress(address);

        List<Subject> subjectsList = new ArrayList<>();
        subjectsList.add(new Subject("Deep learning"));
        subjectsList.add(new Subject("Advace Artificial Intelligence"));
        subjectsList.add(new Subject("Quantum Computing"));
        subjectsList.add(new Subject("Social Media Analytic"));

        first.setSubjectsList(subjectsList);

        System.out.println(first);
    }
}
