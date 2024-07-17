package org.java8.examples;

public class FindThe2ndHighArrayNumber {
    public static void main(String[] args) {
        int arr[]={1,4,6,10,30,50};
        findtheSeconHighestNum(arr);
    }

    private static void findtheSeconHighestNum(int arr[]) {
        int highestNumber=Integer.MIN_VALUE;
        int secondHighest=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>highestNumber)
            {
                secondHighest=highestNumber;
                highestNumber=arr[i];
            } else if (arr[i]>secondHighest && arr[i]!=highestNumber){
                secondHighest=arr[i];
            }

        }
        System.out.println(secondHighest);
    }
}
