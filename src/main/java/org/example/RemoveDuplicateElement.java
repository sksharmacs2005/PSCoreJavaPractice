package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicateElement {
    public static void main(String[] args) {

       removeDuplicat();


    }
    private static void removeDuplicat()
    {
        List<Integer> list=new ArrayList<Integer>();
        list.add(1);
        list.add(1);
        list.add(5);
        list.add(5);
        list.add(3);
        list.add(2);
        list.add(6);
        list.add(7);

        Set<Integer> set=new TreeSet<>();
        for(int i=0; i<list.size(); i++)
        {
            set.add(list.get(i));
        }
        System.out.println("The sorted element are given below");
        for(Integer data: set)
        {
            System.out.println(data + " ");
        }
    }
}
