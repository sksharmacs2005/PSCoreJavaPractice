package org.example;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberPrint {
    public static void main(String[] args) {

        List<Integer> list=new ArrayList<>();
        for(int i=0;i<1000;i++)
        {
            if(checkPrime(i))
            {
                list.add(i);
            }
        }
        for(Integer prime: list)
        {
            System.out.format("%s\t" , prime);
        }
        System.out.println("\nTotal = " + list.size());
    }
    private static boolean checkPrime(int num)
    {
        if(num == 0 || num ==1)
        {
            return false;
        }
        for(int i=2;i*i<=num;i++)
        {
            if(num %i ==0)
            {
                return false;
            }
        }
        return true;
    }

}
