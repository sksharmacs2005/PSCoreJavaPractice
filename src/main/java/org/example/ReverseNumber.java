package org.example;

public class ReverseNumber {
    public static void main(String[] args) {
        int number=12345;
        System.out.println(reverseNum(number));

    }
    private static int reverseNum(int num)
    {
        int reminder;
        int reverse=0;
        while(num>0)
        {
            reminder=num % 10;
            reverse=reverse * 10 + reminder;
            num =num/10;
        }
        return reverse;
    }
}
