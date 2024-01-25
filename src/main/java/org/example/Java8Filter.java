package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Java8Filter {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("java","c","python");
        list.stream().filter(line->!"c".equals(line))
                .forEach(System.out::println);

        List<List<Integer>> listOfList=Arrays.asList(
                Arrays.asList(1,2,3),
                Arrays.asList(4,5,6),
                Arrays.asList(7,8,9,10));

        List<Integer> collectList = listOfList.stream().flatMap(x -> x.stream()).collect(Collectors.toList());
        System.out.println(collectList);

    }
}
