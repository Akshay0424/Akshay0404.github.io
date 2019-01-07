package com.practice;

import java.util.*;

public class SortedSet {

    public Set<String> SortedSet(Set<String> set) {

        List<String> list = new ArrayList<>();
        list.addAll(set);
        Collections.sort(list);

        System.out.print("Sorted set: ");
        for(int i=0;i<list.size();i++)
        {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

        Set<String> result=new LinkedHashSet<>(list);
        return result;
    }
}
