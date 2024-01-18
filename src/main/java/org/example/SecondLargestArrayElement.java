package org.example;

import java.util.Arrays;
import java.util.Collections;

public class SecondLargestArrayElement {
    public static void main(String[] args) {
        Integer arr[] = {12, 35, 1, 10, 34, 1};

        getSecondElement(arr, arr.length);

        System.out.println(second(arr));

        int arrData[]={23,14,56,77,66,67};
        System.out.println("Second Largest Element = > " + secondLargest(arrData));
    }

    private static void getSecondElement(Integer arr[], int arr_size) {
        //Sort the array
        Arrays.sort(arr, Collections.reverseOrder());
        for (int i = 1; i < arr_size; i++) {
            if (arr[i] != arr[0]) {
                System.out.println("Second Largest Element i ===> " + arr[i]);
                return;
            }
        }
        System.out.println("This is not second largest element!!");
    }
    private static int second(Integer arr[])
    {
        return Arrays.stream(arr).sorted().skip(arr.length-2).findFirst().get();
    }
    public static int secondLargest(int arr[]) {
        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
}
