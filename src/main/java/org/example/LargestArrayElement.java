package org.example;

public class LargestArrayElement {
    public static void main(String[] args) {
        int arr[]={1,2,3,5,7,7};
        int largest = getLargest(arr);
        System.out.println(largest);
    }
    private static int getLargest(int arr[])
    {
        int largestElement=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] >largestElement)
            {
                largestElement=arr[i];
            }
       }
        return largestElement;
    }
}
