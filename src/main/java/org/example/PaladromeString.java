package org.example;

public class PaladromeString {
    public static void main(String[] args) {

        String str1="apple";
        String str2="radar";
       // boolean result= checkPaladrom(str1);
        boolean result= checkPaladrom(str2);
        System.out.println(result);

    }
    private static boolean checkPaladrom(String input)
    {
        String reverStr="";
        for(int i=input.length() -1;i>=0;i--)
        {
            reverStr=reverStr+input.charAt(i);
        }
        return reverStr.equals(input);
    }
}
