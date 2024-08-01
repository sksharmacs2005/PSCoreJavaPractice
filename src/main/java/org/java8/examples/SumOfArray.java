package org.java8.examples;

public class SumOfArray {
    public static void main(String[] args) {

        //String[] array = {"5", "2", "9", "1", "1", "6", "2", "3"};
        String[] array = {};
        int sumOfElement = sumOfElement(array);
        System.out.println(" Result = : " + sumOfElement);
    }

    private static int sumOfElement(String[] arr)
    {
        if (arr == null || arr.length == 0 ) {
            throw new IllegalArgumentException("Array must not be empty");
        }
        int sum=0;
        for(String num:arr)
        {
            try{
                int number=Integer.parseInt(num);
                sum+=number;
            }catch (NumberFormatException e)
            {
                e.printStackTrace();
            }
        }
        return sum;
    }
}
