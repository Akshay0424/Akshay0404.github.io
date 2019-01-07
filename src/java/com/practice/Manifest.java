package com.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Manifest {

    public static ArrayList<Student> StudentsCompare(List<Student> students){

        ArrayList<Student> student = new ArrayList<Student>(students);
        Collections.sort(student, new StudentSorter());

        return student;
    }

    public static void main(String args[]){

        ArrayList<Student> listStudent = new ArrayList<Student>();

        listStudent.add(new Student(1,"Akshay", 22));
        listStudent.add(new Student(1,"Sujan", 23));
        listStudent.add(new Student(1,"Keshav", 24));
        listStudent.add(new Student(1,"Avinash", 25));
        listStudent.add(new Student(1,"Rohit", 26));
        listStudent.add(new Student(1,"Gogo", 27));


        Collections.sort(listStudent, new StudentSorter());

        for(int i=0;i<listStudent.size();i++){
            System.out.println(listStudent.get(i).toString());
        }


    }
}
