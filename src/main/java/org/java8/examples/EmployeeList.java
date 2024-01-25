package org.java8.examples;

import java.util.ArrayList;
import java.util.List;

public class EmployeeList {
    public static List<Employee> getAllEmployeeList()
    {
        List<Employee> empList=new ArrayList<>();
        empList.add(new Employee(100,"Sujeet Sharma",39,"Male","IT Department",2010,50000));
        empList.add(new Employee(100,"Manjeeta Singh",25,"Female","IT Department",2019,30000));
        empList.add(new Employee(100,"Bob Welliom",32,"Male","Sells And Marketing",2011,35000));
        empList.add(new Employee(100,"Kerana Khan",31,"Female","HR Department",2014,10000));
        empList.add(new Employee(100,"General Bob",35,"Male","Infra Department",2013,9000));
        empList.add(new Employee(100,"Rockey Don",37,"Male","Security Department",2001,7000));
        empList.add(new Employee(100,"Polly Beer",29,"Female","HR Department",2015,150000));
        empList.add(new Employee(100,"Sir Don",42,"Male","Sells And Marketing",2009,20000));
        empList.add(new Employee(100,"Jelly Fish",45,"Male","HR Department",2001,25000));
        empList.add(new Employee(100,"Pom Selly",39,"Male","IT Department",2012,35000));
        empList.add(new Employee(100,"Saphire Singh",38,"Male","Infra Department",2015,40000));
        return empList;
    }
}
