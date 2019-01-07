package com.practice;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapObject {

    public LinkedHashMap<String,String> mapObject(LinkedHashMap<String,String> hashmap){

        Set set = hashmap.entrySet();
        Iterator itr = set.iterator();

        Map.Entry mapElement = (Map.Entry)itr.next();
        String key1=(String)mapElement.getKey();
        String value1=(String)mapElement.getValue();

        mapElement = (Map.Entry)itr.next();
        String key2=(String)mapElement.getKey();
        String value2;

        if(value1!=null)
        {
            value2 = value1;
            hashmap.put(key1," ");
            hashmap.put(key2,value2);
        }

        return hashmap;
    }
}
