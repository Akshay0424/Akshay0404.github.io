package com.practice;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class SortedSetTest {
    SortedSet object;

    @Before
    public void setUp() throws Exception {
        object=new SortedSet();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void sortedSet() {
        Set<String> input=new HashSet<String>();
        input.add("Harry");
        input.add("Olive");
        input.add("Alice");
        input.add("Bluto");
        input.add("Eugene");

        Set<String> result=new HashSet<String>();
        result.add("Alice");
        result.add("Bluto");
        result.add("Eugene");
        result.add("Harry");
        result.add("Olive");
        assertEquals(result,object.SortedSet(input));
    }
}