package org.java8.examples;

import java.util.Scanner;

public class SumOfDigitNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println(" Enter the Number ::");

        int sumOfNumber=scanner.nextInt();
        int sumOfNumber1 = getSumOfNumber(sumOfNumber);
        System.out.println( "Sum of " + sumOfNumber  + " Number :: Total Sum is :: " + sumOfNumber1);

    }
    private static int getSumOfNumber(int num)
    {
        int sum=0;
        while(num>0)
        {
            int rem=num % 10; // get last digit number
            sum= sum  + rem;
            num/=10;
        }
        return sum;
    }
}
