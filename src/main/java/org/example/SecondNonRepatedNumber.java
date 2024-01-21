package org.example;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SecondNonRepatedNumber {
    public static void main(String[] args) {
        String str="sujeet sharma";
        System.out.println(getFirstNonRepatedChar(str));
    }

    private static Character getFirstNonRepatedChar(String str) {
        Map<Character, Long> map = str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(i -> i, LinkedHashMap::new, Collectors.counting()));

        for (Map.Entry<Character, Long> unique : map.entrySet()) {
            if (unique.getValue() == 1) {
                return unique.getKey();
            }

        }
        return null;
    }
}