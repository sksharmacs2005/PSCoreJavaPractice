package org.java8.examples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindUniqueArrayElement {
    public static void main(String[] args) {
        int[] array = {1, 1, 2, 2, 3, 4, 5, 5, 6, 6};
        List<Integer> uniqueResult = getUniqueElement(array);
        System.out.println("The Unique Elemet of Array is : " + uniqueResult);
    }
    private static List<Integer> getUniqueElement(int num[])
    {
        Map<Integer,Integer> map=new HashMap<>();
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<num.length;i++)
        {
            //count the every elemets
            map.put(num[i],map.getOrDefault(num[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> e:map.entrySet())
        {
            if(e.getValue()==1)
            {
                list.add(e.getKey());
            }
        }
        return list;
    }
}
