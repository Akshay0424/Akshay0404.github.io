package com.practice;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class UpdateListTest {

    @org.junit.Test

    public void Updation1() {

        ArrayList<String> expectedValue=new ArrayList<>();
        expectedValue.add("Kiwi");
        expectedValue.add("Grape");
        expectedValue.add("Mango");
        expectedValue.add("Berry");

        //Act
        UpdateList obj = new UpdateList();
        ArrayList<String> actualValue= obj.Updation();
        //Assert
        assertEquals(expectedValue, actualValue);

    }
}