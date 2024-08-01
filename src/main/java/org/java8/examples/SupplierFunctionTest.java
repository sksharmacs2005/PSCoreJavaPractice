package org.java8.examples;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Supplier;

public class SupplierFunctionTest {
    public static void main(String[] args) {
        citySupplier();
    }
    @Test
    public static void citySupplier()
    {
        Supplier<String[]> cityList=()->
        {
          return new String[]{"New Delhi","Mumbai","Kolkatta","Chennai"};
        };
        Arrays.asList(cityList.get()).forEach(System.out::println);
    }
}
