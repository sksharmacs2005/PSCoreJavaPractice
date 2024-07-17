package org.example;

import java.util.*;

public class CountListOfString {
    public static void main(String[] args) {

        List<String> list= Arrays.asList("Sujeet","Sharma","Sujeet","Jyoti","Harsh");
        getOccurence(list);
    }

    private static void getOccurence(List<String> list)
    {
        Map<String,Integer> map=new HashMap<>();
        for(String i: list)
        {
            Integer count=map.get(i);
            map.put(i,(count== null) ?1 : count+1);
        }
        for(Map.Entry<String,Integer> data : map.entrySet())
        {
            System.out.println(data.getKey()  + " : " + data.getValue());
        }
    }
}
