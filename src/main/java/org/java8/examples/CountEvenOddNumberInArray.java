package org.java8.examples;

public class CountEvenOddNumberInArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] intsResult = countEvenOdd(array);

        System.out.println("The Odd Number count : " + intsResult[0]);
        System.out.println("The Even Number count : " + intsResult[1]);


    }

    private static int[] countEvenOdd(int  arr[])
    {
        int count[]=new int[2]; // 0 for odd and 1 for even number

        for(int num:arr)
        {
            if(num % 2==0)
            {
                count[1]++;
            }else {
                count[0]++;
            }
        }
        return count;
    }
}
