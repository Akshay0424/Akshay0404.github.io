package com.practice;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.LinkedHashMap;

import static org.junit.Assert.*;

public class MapObjectTest {

    MapObject obj;
    @Before
    public void setUp() throws Exception {
        obj=new MapObject();
    }

    @After
    public void tearDown() throws Exception {
    }


    @Test
    public void MapObjectTest1() {
        LinkedHashMap<String,String> inputMap=new LinkedHashMap<String, String>();
        inputMap.put("val1","java");
        inputMap.put("val2","c++");
        LinkedHashMap<String,String> outputMap=new LinkedHashMap<String, String>();
        outputMap.put("val1"," ");
        outputMap.put("val2","java");
        assertEquals(outputMap,obj.mapObject(inputMap));
    }

    @Test
    public void MapObjectTest2(){
        LinkedHashMap<String,String> map=new LinkedHashMap<>();
        map.put("val1","football");
        map.put("val2","cricket");
        assertNotNull("Error",obj.mapObject(map));
    }

}