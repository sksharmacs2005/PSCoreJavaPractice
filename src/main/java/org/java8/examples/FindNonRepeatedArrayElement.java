package org.java8.examples;

import java.util.*;

public class FindNonRepeatedArrayElement {
    public static void main(String[] args) {
        int[] array = {1, 1, 2, 2, 3, 4, 5, 5, 6, 6};
        List<Integer> nonRepeatedElement = findNonRepeatedElement(array);

        System.out.println("The NonRepeated Element is : "  + nonRepeatedElement);

    }

    private static List<Integer> findNonRepeatedElement(int arr[])
    {
        Map<Integer,Integer> map=new HashMap<>();
        for(int num:arr)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        List<Integer> nonRepetedList=new ArrayList<>();
        for(Map.Entry<Integer,Integer> mapData:map.entrySet())
        {
            if(mapData.getValue()==1)
            {
                nonRepetedList.add(mapData.getKey());
            }
        }
        return nonRepetedList;
    }
}
