package org.java8.examples;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {

        String input1 = "apples";
        String input2 = "racecars";

        Character result1 = findtheFirstNonReaptedChar(input1);
        Character result2 = findtheFirstNonReaptedChar(input2);

        System.out.println("The first non-reapted character is \"" + input1 + "\" is : " + result1);
        System.out.println("The second non-reapted character is \"" + input2 + "\" is : " + result2);


    }

    private static Character findtheFirstNonReaptedChar(String input) {
        // Create a LinkedHashMap to maintain the order of characters
        Map<Character, Integer> map = new LinkedHashMap<>();

        // Iterate through the string to populate the frequency map
        for (char c : input.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        //Iterate through the string again to find the first non-repeating character
        for (char c : input.toCharArray()) {
            if (map.get(c) == 1) {
                return c;
            }
        }
        // Return null if no non-repeating character is found
        return null;
    }
}
