package org.java8.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableListExample {
    public static void main(String[] args) {

        ArrayList<String> mmutableList=new ArrayList<>();
        mmutableList.add("Sujeet");
        mmutableList.add("Manish");
        mmutableList.add("Sandeep");
        mmutableList.add("Harsh");
        mmutableList.add("Bhargav");

        System.out.println("Before Immutable class");

        System.out.println("Mutable List = : " + mmutableList);
        //Making ArrayList to immutable class
        List<String> immutableList = Collections.unmodifiableList(mmutableList);

        //After making ArrayList immutable class add somting

        System.out.println("After Immutable class");
        immutableList.add("newElement");


    }
}
