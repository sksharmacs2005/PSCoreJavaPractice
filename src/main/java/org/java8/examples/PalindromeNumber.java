package org.java8.examples;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number :: ");
        int num=scanner.nextInt();
        if(checkPalidromeNumber(num)) //12344321 or 1001
        {
            System.out.println(" Palindrome Number ::: ");
        }else {
            System.out.println(" Not the Palidrome Number ::: ");
        }

    }

    private static boolean checkPalidromeNumber(int input)
    {
        int origionalNUmber=input;
        int reverseNumber=0;
        while(input>0)
        {
            int rem=input % 10;
            reverseNumber=reverseNumber *10 + rem;
            input/=10;

        }
        return origionalNUmber==reverseNumber;
    }
}
