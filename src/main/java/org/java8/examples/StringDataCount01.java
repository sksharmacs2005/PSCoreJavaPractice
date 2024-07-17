package org.java8.examples;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StringDataCount01 {
    public static void main(String[] args) {
        String str = "aabbbcaaddddggggef";

        Map<Character, Long> charCount = findCharCount(str);
        System.out.println(" Result chars count : " +  charCount);
        // Convert string to list of characters
        List<Character> charList = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toList());

        // Use a StringBuilder to construct the output string
        StringBuilder result = new StringBuilder();

        // Initialize variables for the previous character and count
        char prevChar = charList.get(0);
        int count = 0;

        for (char c : charList) {
            if (c == prevChar) {
                count++;
            } else {
                result.append(prevChar).append(count);
                prevChar = c;
                count = 1;
            }
        }

        // Append the last character and its count
        result.append(prevChar).append(count);

        System.out.println("Result of String : aabbbcaaddddggggef : " + result.toString()); // Output: a2b3c1a2d4g4e1f1
    }

    private static Map<Character,Long> findCharCount(String input)
    {
        Map<Character, Long> collectResult = input.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(i -> i, Collectors.counting()));

        return collectResult;
    }
}
