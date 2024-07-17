package org.java8.examples;

import java.util.Arrays;
import java.util.Collections;

public class SortStringDescending {
    public static void main(String[] args) {
        String str = "mupursingh";

        String result = sortingString(str);

        System.out.println(" Input String : " + str + " and reverse string  : " + result);
    }

    private static String sortingString(String input) {

        //convert String to Character array

        Character charArray[] = new Character[input.length()];
        for (int i = 0; i < input.length(); i++) {
            charArray[i] = input.charAt(i);
        }
        //sort the Character array to reverse order

        Arrays.sort(charArray, Collections.reverseOrder());

        //Convert Character Array back to String

        StringBuilder builder = new StringBuilder();

        for (char c : charArray) {
            builder.append(c);
        }

        return builder.toString();

    }
}
