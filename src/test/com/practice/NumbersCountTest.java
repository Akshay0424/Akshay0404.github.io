package com.practice;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class NumbersCountTest {

    NumbersCount obj;
    @Before
    public void setUp() throws Exception {
        obj=new NumbersCount();
    }

    @After
    public void tearDown() throws Exception {
        obj=null;
    }

    @Test
    public void NumbersCountTest1() {
        String str="one one -one___two,,three?one @three*one?two";
        HashMap<String, Integer> map = new HashMap<>();
        map.put("one",5);
        map.put("two",2);
        map.put("three",2);

        assertEquals("error",map,obj.count(str));

    }

    @Test
    public void NumbersCountTest2() {
        String str="one two three two two three one";
        HashMap<String, Integer> map = new HashMap<>();
        map.put("one",2);
        map.put("two",3);
        map.put("three",2);

        assertNotNull("Error",obj.count(str));

    }
}