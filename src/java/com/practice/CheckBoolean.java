package com.practice;
import java.util.HashMap;


    public class CheckBoolean {

        public static HashMap<String, Boolean> count(String[] str){

            HashMap<String, Boolean> mapcheck = new HashMap<String, Boolean>();

            for(int i=0;i<str.length;i++){

                if(mapcheck.get(str[i]) == null)
                {
                    mapcheck.put(str[i], false);
                }
                else
                {
                    mapcheck.put(str[i], true);
                }
            }

            return mapcheck;

        }

    }
