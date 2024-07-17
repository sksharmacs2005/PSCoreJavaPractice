package org.example;

import java.util.HashMap;
import java.util.Map;

public class CountCharacterInString {
    public static void main(String[] args) {
        String str = "egertgferterntirehtoeirtu9835kljnfgouig";
        Map<Character, Integer> characterIntegerMap = countCharacter(str);
        System.out.println(characterIntegerMap);

        String s = new String("5");
        System.out.println(1 + 10 + s + 1 + 10);

    }
    private static Map<Character, Integer> countCharacter(String str) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))) {
                Integer count = map.get(str.charAt(i));
                map.put(str.charAt(i), (count==null)?1:count + 1);
            } else {
                map.put(str.charAt(i), 1);
            }
        }
        return map;
    }
}