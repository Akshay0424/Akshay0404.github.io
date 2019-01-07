package com.practice;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class UpdateListTest {
    UpdateList obj;

    @org.junit.Before
    public void setUp() throws Exception {
        obj=new UpdateList();
    }

    @org.junit.After
    public void tearDown() throws Exception {
        obj = null;
    }

    @org.junit.Test

    public void UpdateListTest1() {

        ArrayList<String> list= new ArrayList<String>(Arrays.asList(new String[]{"Apple", "Grape", "Melon","Berry"}));

        assertEquals("Error",list,obj.Updation(list,0,"kiwi"));
        assertEquals("Error",list,obj.Updation(list,2,"Mango"));

    }

    @org.junit.Test

    public void UpdateListTest2() {

        ArrayList<String> list= new ArrayList<String>(Arrays.asList(new String[]{"Apple", "Grape", "Melon","Berry"}));

        assertEquals("Error",list,obj.Updation(list,0," "));

    }

    @org.junit.Test

    public void UpdateListTestFailure() {

        ArrayList<String> list= new ArrayList<String>(Arrays.asList(new String[]{"Apple", "Grape", "Melon","Berry"}));
        assertNotNull("Error",obj.Updation(list,0,"kiwi"));

    }

}