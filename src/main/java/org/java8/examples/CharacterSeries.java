package org.java8.examples;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterSeries {
    public static void main(String[] args) {
        // input: “SSSSSTTPPQ” Output:“5S2T2P1Q”.

        String input = "SSSSSTTPPQ";

        String output = comparingString(input);

        System.out.println("Result = : " + output);
    }

    private static String comparingString(String input)
    {
        Map<Character,Long> map=input.chars().mapToObj(c->(char) c).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        StringBuilder result=new StringBuilder();

        map.forEach((key,value)->result.append(value).append(key));

        return result.toString();
    }
}
