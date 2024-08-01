package org.java8.examples;

public class SearchElementInArray {
    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 6, 3};
        int target = 6;

        int arrayElement = findArrayElement(array, target);

        System.out.println("The Result of element : " + target + " position : " + arrayElement);

    }
    private static int findArrayElement(int arr[],int target)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==target)
            {
                return i;
            }

        }
        return -1;
    }
}
