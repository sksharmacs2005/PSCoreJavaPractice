package org.java8.examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReturnNumberStartWith1 {
    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(10,12,15,115,16,19,11);

        List<Integer> result = list.stream().filter(num -> String.valueOf(num).startsWith("1")).collect(Collectors.toList());

        System.out.println("Number start with 1 = " + result);
    }
}
