package org.example;

import java.util.Arrays;

public class MaxNumberFromArray {
    public static void main(String[] args) {
        Integer num[]={20,25,80,20,105,90,100,105};
        System.out.println(maxIntNum(num));
        Integer maxNum= Arrays.asList(num).stream().reduce(Integer::max).get();

        System.out.println(maxNum);

     }
     private static int maxIntNum(Integer num[])
     {
         int largest=num[0];
         for(int i=1;i<num.length;i++)
         {
             if(num[i]>largest)
             {
                 largest=num[i];
             }
         }
         return largest;
     }
}
