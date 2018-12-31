package com.practice;
import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class UpdateList {

    public ArrayList<String> Updation(){

        ArrayList<String> fruitsnames1 = new ArrayList<String>();

        fruitsnames1.add("Apple");
        fruitsnames1.add("Grape");
        fruitsnames1.add("Melon");
        fruitsnames1.add("Berry");

        fruitsnames1.set(0,"Kiwi");
        fruitsnames1.set(2,"Mango");

        ArrayList<String> fruitsnames2= new ArrayList<String>();
        fruitsnames2=fruitsnames1;

        return(fruitsnames2);
    }


    public static void main(String[] args)
    {
        UpdateList obj = new UpdateList();
        ArrayList<String> str = obj.Updation();
        System.out.print(str);
    }


}
