package org.java8.examples;

@FunctionalInterface
interface MyFunctionalInterface
{
     void show(String str);
}
public class CallFunctionalInterface {
    public static void main(String[] args) {

        MyFunctionalInterface obj=(name)-> System.out.println(" Hello " + name);
        obj.show("Sujeet ");
    }
}
