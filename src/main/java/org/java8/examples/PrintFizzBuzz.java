package org.java8.examples;

/**
 * Write the Java code Write a program to print numbers from 1 to 100.
 * Print fizz if number is multiple of 3.
 * Print buzz if number is multiple of 5. Print fizzbuzz if number is multiple of 3&5.
   **/
public class PrintFizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("fizzbuzz");
            } else if (i % 3 == 0) {
                System.out.println("fizz");
            } else if (i % 5 == 0) {
                System.out.println("buzz");
            } else {
                System.out.println(i);
            }
        }
    }

}
