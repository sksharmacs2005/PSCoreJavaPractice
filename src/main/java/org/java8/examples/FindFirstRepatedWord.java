package org.java8.examples;

import java.util.HashSet;
import java.util.Set;

public class FindFirstRepatedWord {
    public static void main(String[] args) {

        String input = "Ravi had been saying that he had been there";
        String firstReapted = findFirstReapted(input);

        System.out.println( "First Reapted words : "  + firstReapted);
    }

    private static String findFirstReapted(String input)
    {
        String[] sprlitData = input.split(" ");

        Set<String> set=new HashSet<>();

        for(String words:sprlitData)
        {
            //If there are already words in set ,it's first reapted word
            if(!set.add(words))
            {
                return words;
            }
        }
        return "There are no any reapted words";

    }
}
