package org.java8.examples;

public class ReverseStringWords {
    public static void main(String[] args) {
        String input = "I AM A TESTER";

        String result = gerReverseString(input);

        System.out.println("Reverse words = : " + result);
    }
    private static String gerReverseString(String input)
    {
        String[] words = input.split(" ");
        StringBuilder builder=new StringBuilder();
        for(int i=words.length -1;i>=0;i--)
        {

            builder.append(words[i]);
            if(i!=0)
            {
                builder.append(" ");
            }
        }
        return builder.toString();
    }
}
