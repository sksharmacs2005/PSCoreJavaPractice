package org.java8.examples;

import java.util.Arrays;

public class SmallestAndLargestWord {
    public static void main(String[] args) {
        String input = "This is a test string";

        String[] smallestBiiger = findSmallestBiiger(input);

        System.out.println(" Sallelst word = " + smallestBiiger[0]);
        System.out.println(" Biggest word = " + smallestBiiger[1]);
    }

    private static String[] findSmallestBiiger(String input){

        String[] words = input.split(" ");

        if(words.length==0)
        {
            return new String[]{" "," "};
        }

        String smallestWord=words[0];
        String biggestWord=words[0];

        for(String data:words)
        {
            if(data.length()<smallestWord.length())
            {
                smallestWord=data;
            }
            if(data.length()>biggestWord.length())
            {
                biggestWord=data;
            }
        }
        return new String[]{smallestWord,biggestWord};
    }
}
