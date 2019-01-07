package com.practice;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ManifestTest {

    private static Manifest manifest;

    @Before
    public void setUp() throws Exception {
        manifest = new Manifest();
    }

    @After
    public void tearDown() throws Exception {
        manifest = null;
    }

    @Test
    public void testCompareStudentsTest1() throws Exception{
        ArrayList<Student> expectedList = new ArrayList<Student>();
        expectedList.add(new Student(6,"Gogo", 27 ));
        expectedList.add(new Student(5,"Rohit", 26 ));
        expectedList.add(new Student(4,"Avinash", 25 ));
        expectedList.add(new Student(3,"Keshav", 24 ));
        expectedList.add(new Student(2,"Sujan", 23 ));
        expectedList.add(new Student(1,"Akshay", 22 ));

        ArrayList<Student> list = new ArrayList<Student>();
        list.add(new Student(1,"Akshay", 22 ));
        list.add(new Student(2,"Sujan", 23 ));
        list.add(new Student(3,"Keshav", 24 ));
        list.add(new Student(4,"Avinash", 25 ));
        list.add(new Student(5,"Rohit", 26 ));
        list.add(new Student(6,"Gogo", 27 ));

        assertEquals("error", expectedList.toString(), manifest.StudentsCompare(list).toString());


    }

    @Test
    public void testCompareStudentsTest2() throws Exception{
        ArrayList<Student> expectedList = new ArrayList<Student>();
        expectedList.add(new Student(4,"Pakki", 15 ));
        expectedList.add(new Student(5,"Navami", 15 ));
        expectedList.add(new Student(3,"Avani", 14 ));
        expectedList.add(new Student(2,"Nandan", 13 ));
        expectedList.add(new Student(1,"Avinash", 12 ));

        ArrayList<Student> list = new ArrayList<Student>();
        list.add(new Student(1,"Avinash", 12 ));
        list.add(new Student(2,"Nandan", 13 ));
        list.add(new Student(3,"Avani", 14 ));
        list.add(new Student(4,"Pakki", 15 ));
        list.add(new Student(5,"Navami", 15 ));

        assertEquals("error", expectedList.toString(), manifest.StudentsCompare(list).toString());


    }
}