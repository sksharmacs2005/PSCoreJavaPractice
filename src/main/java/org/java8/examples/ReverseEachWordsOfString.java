package org.java8.examples;

public class ReverseEachWordsOfString {
    public static void main(String[] args) {
        String str="Java is good programming langauges";
        reverseEachString(str);
    }
    private static void reverseEachString(String input)
    {
        String[] words = input.split(" ");
        String reverseString ="";
        for(int i=0;i<words.length;i++)
        {
            String word=words[i];
            String nstr ="";
            char ch;
            for(int j=0;j<word.length();j++)
            {
                ch=word.charAt(j);
                nstr= ch + nstr;
            }
            reverseString=reverseString + nstr + " ";

        }
        System.out.println(input);
        System.out.println(reverseString);


    }
}
