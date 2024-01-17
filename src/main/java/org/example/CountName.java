package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class CountName {
    private static void getData(ArrayList<String> list)
    {
        Map<String,Integer> map=new HashMap<>();
        for(String i:list)
        {
            Integer count=map.get(i);
            map.put(i,(count == null)?1:count+1);
        }
        for(Map.Entry<String,Integer> occur:map.entrySet())
        {
            System.out.println(occur.getKey() + " ===> " + occur.getValue());
        }

    }

    public static void main(String[] args) {
        List<String> list= Arrays.asList("Sujeet","Harsh","Sujeet","Jyoti");
        getData(new ArrayList<>(list));

        Map<String,Long> countElement=list.stream()
                .collect(Collectors
                        .groupingBy(x->x,Collectors
                                .counting()));

        System.out.println("***********************************");
        System.out.println("Result====> " + countElement);

    }
}
