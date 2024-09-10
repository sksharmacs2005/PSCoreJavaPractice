package org.java8.examples;

public interface NonFunctionalInterface {
    default void defaultMethod() {
        System.out.println("Default method");
    }
}
