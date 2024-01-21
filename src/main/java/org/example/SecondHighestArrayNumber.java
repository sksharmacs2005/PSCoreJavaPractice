package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SecondHighestArrayNumber {
    public static void main(String[] args) {

        int arr[]={3,6,10,15,23,20};
        List<Integer> list= Arrays.stream(arr).boxed().collect(Collectors.toList());

        Integer secondHighest = list.stream().distinct().sorted((a, b) -> b.compareTo(a)).skip(1).findFirst().orElseThrow(() -> new IllegalArgumentException("Data not find"));
        System.out.println("Second Hishest Number = " + secondHighest);

        Integer secondHighestNumber = list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(null);

        System.out.println("Second Highest Number = " + secondHighestNumber);

    }
}
