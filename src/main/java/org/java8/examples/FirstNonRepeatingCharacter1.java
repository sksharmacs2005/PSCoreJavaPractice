package org.java8.examples;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter1 {
    public static char findFirstNonRepeatingChar(String str) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Count the occurrences of each character in the string
        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Find the first character with a count of 1
        for (char c : str.toCharArray()) {
            if (charCountMap.get(c) == 1) {
                return c;
            }
        }

        // If no non-repeating character is found, return '0'
        return '0';
    }

    public static void main(String[] args) {
        String str1 = "aabdcce";
        String str2 = "aakreckee";
        String str3 = "aabbbccfff";

        System.out.println(findFirstNonRepeatingChar(str1)); // Output: b
        System.out.println(findFirstNonRepeatingChar(str2)); // Output: r
        System.out.println(findFirstNonRepeatingChar(str3)); // Output: 0
    }
}