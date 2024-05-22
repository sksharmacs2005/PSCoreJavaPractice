package org.java8practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountFromString {
    public static void main(String[] args) {

        List<String> list= Arrays.asList("Sujeet","Ajeet","Sujeet","Harsh");

        Map<String,Integer> map=new HashMap<>();
        for(String data:list)
        {
            Integer count=map.get(data);
            map.put(data,(count==null)?1:count+1);
        }
        for(Map.Entry<String,Integer> mapData: map.entrySet())
        {
            System.out.println(mapData.getKey() + " :  " + mapData.getValue());
        }
    }
}
