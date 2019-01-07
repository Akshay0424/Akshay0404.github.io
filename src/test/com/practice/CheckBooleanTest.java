package com.practice;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class CheckBooleanTest {

    private static CheckBoolean character;

    @Before
    public void setUp() throws Exception {
        character = new CheckBoolean();
    }

    @After
    public void tearDown() throws Exception {
        character = null;
    }

    @Test
    public void CheckBooleanTest1() throws  Exception{

        HashMap<String, Boolean> expected = new HashMap<String, Boolean>();
        expected.put("a", false);
        expected.put("b", true);
        expected.put("c", true);
        String s[] = {"a","c","c","b","b","c","c"};
        assertEquals("Error",expected,character.count(s));
    }

    @Test
    public void CheckBooleanTest2() throws  Exception{

        HashMap<String, Boolean> expected = new HashMap<String, Boolean>();
        expected.put("a", false);
        expected.put("b", false);
        String s[] = {"a","b"};
        assertEquals("Error",expected,character.count(s));
    }

}