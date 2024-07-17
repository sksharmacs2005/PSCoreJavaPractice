package org.java8.examples;

public class TestClass {
    public static String getData(String str)
    {
        return str.toUpperCase();
    }

    public static void main(String[] args) {
        String str="Sujeet Sharma";
        String dataResult = getData(str);

        System.out.println(dataResult);
    }
}
