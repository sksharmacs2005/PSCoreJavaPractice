package org.java8.examples;

public class FindSumOfTwoNumber {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 7, -1, 5 };
        int sum = 12;

        getSumOfTwoNumbers(arr,sum);

    }

    private static void getSumOfTwoNumbers(int num[],int sum)
    {
        for(int i=0;i<num.length;i++)
        {
            for(int j=i+1;j<num.length;j++)
            {
                if(num[i]+num[j] == sum)
                {
                    System.out.println("The Sum of given numbers are  : " + num[i] +","+ num[j]);
                }
            }
        }
    }
}
