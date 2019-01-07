package com.practice;
import java.util.*;

public class UpdateList {

    public ArrayList<String> Updation(ArrayList<String>list,int i,String str){

        if(str.equals(null))
        {
            return null;
        }

        else if(str.equals(" "))
        {
            return list;
        }

        else
            list.add(i, str);
        return list;
    }
}
