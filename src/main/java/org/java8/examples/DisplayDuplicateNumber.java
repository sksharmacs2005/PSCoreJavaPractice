package org.java8.examples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class DisplayDuplicateNumber {
    public static void main(String[] args) {

        List<Integer> numbers= Arrays.asList(2,4,2,8,10,5,7,10,8);

        HashSet<Integer> set=new HashSet<>();

        numbers.stream().filter(num->!set.add(num)).forEach(System.out::println);

        List<Integer> evenNumbers = numbers.stream().filter(num -> num % 2 == 0).distinct().collect(Collectors.toList());

       // System.out.println(evenNumbers);

        List<Integer> oddNumbers = numbers.stream().filter(num -> num % 2 != 0).distinct().collect(Collectors.toList());
        //System.out.println(oddNumbers);

        List<Integer> list=Arrays.asList(10,40,30);
        Integer i = list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
    }
}
