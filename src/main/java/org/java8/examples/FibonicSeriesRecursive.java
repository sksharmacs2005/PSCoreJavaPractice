package org.java8.examples;

public class FibonicSeriesRecursive {
    private static int fibonic(int num)
    {
        if(num<=1)
        {
            return num;
        }
        return fibonic(num -1) + fibonic(num - 2);
    }

    public static void main(String[] args) {
        int num=20;

        System.out.println("The faibonic number at position " + num + " is : " + fibonic(num));
    }
}
