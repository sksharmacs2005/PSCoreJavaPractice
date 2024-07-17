package org.java8.examples;

public class MyClass01 {
    public static void main(String[] args) {

        MyInterface01 myInterface01=()->{
            System.out.println("Hello Void method!!");

        };
        myInterface01.show();

    }
}
