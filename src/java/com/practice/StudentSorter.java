package com.practice;

import java.util.Comparator;

public class StudentSorter implements Comparator<Student> {


    @Override
    public int compare(Student s1, Student s2) {

        if(s1.getAge() == s2.getAge()){
            if(s1.getName().equals(s2.getName())){
                return s2.getId() - s1.getId();
            }

            return s2.getName().compareTo(s1.getName());
        }
        return s2.getAge()- s1.getAge();

    }
}