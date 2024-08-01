package org.java8.examples;

import java.util.Scanner;

public class NumberOfDigits {
    public static void main(String[] args) {
        int no=0,a=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number : " );
        no = scanner.nextInt();
        if(no<0)
        {
            no *= -1;
        } else if (no==0) {
            no=1;
        }
        while (no>0)
        {
            no/=10;
            a++;

        }
        System.out.println("The given number is = : " + a);

    }
}
