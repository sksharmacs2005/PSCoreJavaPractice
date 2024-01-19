package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Spliterator;

public class FindUniqueWords {
    public static void main(String[] args) {

        String str="I love India,i am intertested in Java programming.";
        String split[]=str.split(" ");
        Map<String,Integer> map=new HashMap<>();
        for(int i=0;i<split.length;i++)
        {
            if(map.containsKey(split[i]))
            {
                int count=map.get(split[i]);
                map.put(split[i],count+1);
            }else {
                map.put(split[i],1);
            }
        }
   for(Map.Entry<String,Integer> mapData:map.entrySet())
   {
       System.out.println(mapData.getKey() + ":" + mapData.getValue());
   }
    }
}
