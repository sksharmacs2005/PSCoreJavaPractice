package org.java8.examples;

import java.util.Arrays;

public class FindMissingNumberFromArray {
    public static void main(String[] args) {
        int arr[]={1,4,5,3,7,2};

        findMissingArray(arr);
    }

    private static void findMissingArray(int[] arr) {
        int sum1= Arrays.stream(arr).sum();
        System.out.println("sum1 : " + sum1);
        int num= arr.length+1;
        int sum2=num*(num+1)/2;
        System.out.println("sum2 " + sum2);

        System.out.println("Missing Number : " + (sum2-sum1));
    }
}
