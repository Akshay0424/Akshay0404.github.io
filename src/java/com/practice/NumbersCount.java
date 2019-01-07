package com.practice;

import java.util.HashMap;

public class NumbersCount {

    public HashMap<String,Integer> count(String s){

        String result = s.replaceAll("[-+.^:,@___<>*?_]", " ");
        HashMap<String, Integer> hashMap = new HashMap<>();
        String []str=result.split(" ");

        for(int i=0;i<str.length;i++) {

            if (hashMap.containsKey(str[i]))
            {
                hashMap.put(str[i], hashMap.get(str[i]) + 1);
            }
            else
            {
                hashMap.put(str[i], 1);
            }
        }
        hashMap.remove("");

        return hashMap;
    }
}
