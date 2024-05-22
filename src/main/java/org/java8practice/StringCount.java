package org.java8practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringCount {
    private static void countData(List<String> list)
    {
        List<String> listOfData=list;
        Map<String,Integer> map=new HashMap<>();

        for(String i:listOfData)
        {
            Integer count = map.get(i);
            map.put(i,(count==null)?1:count+1);
        }
        for(Map.Entry<String,Integer> mapData:map.entrySet())
        {
            System.out.println(mapData.getKey() + " : " + mapData.getValue());
        }
    }

    public static void main(String[] args) {
        List<String> list= Arrays.asList("Sujeet","Shilpa","Ash","Jyoti","Sujeet","Jyoti");
        countData(list);
    }
}
