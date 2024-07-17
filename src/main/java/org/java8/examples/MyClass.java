package org.java8.examples;

public class MyClass
{
    public static void main(String[] args) {
        MyInterface myData=()->{
            return "Hello Sujeet!!";
        };
        System.out.println(myData.getData());
    }

}
