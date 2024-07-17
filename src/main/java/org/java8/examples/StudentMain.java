package org.java8.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentMain {
    public static void main(String[] args) {
        List<Student> list=new ArrayList<>();
        list.add(new Student(1,"Sujeet"));
        list.add(new Student(4,"Ajeet"));
        list.add(new Student(3,"Sandeep"));
        list.add(new Student(5,"Manish"));
        list.add(new Student(2,"Jyoti"));

        Collections.sort(list,(o1, o2) -> o2.getId() - o1.getId());
        System.out.println("The Student List = " + list);
    }
}
