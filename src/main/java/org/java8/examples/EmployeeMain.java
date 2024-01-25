package org.java8.examples;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EmployeeMain {
    public static void main(String[] args) {

        List<Employee> allEmployeeList = EmployeeList.getAllEmployeeList();

        List<Employee> collect = allEmployeeList.stream().collect(Collectors.toList());

        //Second Highest Salary
        Employee secondHighestSalary = allEmployeeList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1).findFirst().get();

        System.out.println("SecondHighestSalary == > " + secondHighestSalary);

        //First highest salary

        Employee higestSalary = allEmployeeList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).findFirst().get();
        System.out.println("********************************************************");
        System.out.println("HigestSalary == > " + higestSalary);

        //How many male and female employees are there in the organization?
        Map<String,Long> howManyMaleAndFemale=allEmployeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
        System.out.println("********************************************************");
        System.out.println("HowManyMaleAndFemale = " + howManyMaleAndFemale);

        System.out.println("********************************************************");
        //Print the name of all departments in the organization?

        allEmployeeList.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);

        System.out.println("********************************************************");
        //What is the average age of male and female employees?

        Map<String,Double> averageAgeOfMaleAndFemale=allEmployeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getAge)));
        System.out.println("AverageAgeOfMaleAndFemale ==>" + averageAgeOfMaleAndFemale);

        System.out.println("********************************************************");
        //Get the names of all employees who have joined after 2015?

        allEmployeeList.stream().filter(e->e.getYearOfJoining()>2015).map(Employee::getName).forEach(System.out::println);

        System.out.println("********************************************************");
        //Count the number of employees in each department?

        Map<String,Long> numberOfEmployeeEachDept=allEmployeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));

        for(Map.Entry<String,Long> dept:numberOfEmployeeEachDept.entrySet())
        {
            System.out.println( dept.getKey() + " : " + dept.getValue());
        }
        System.out.println("********************************************************");
        //What is the average salary of each department?

        Map<String,Double> averageSalaryOfDept=allEmployeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));

        for(Map.Entry<String,Double> aveg:averageSalaryOfDept.entrySet())
        {
            System.out.println(aveg.getKey() + " : " + aveg.getValue());
        }
        System.out.println("********************************************************");
        //Get the details of youngest Female employee in the IT development department?

        Optional<Employee> youngestMaleEmployee = allEmployeeList.stream().filter(e -> e.getGender() == "Female" && e.getDepartment() == "IT Department")
                .min(Comparator.comparingInt(Employee::getAge));
        Employee youngestEmployee = youngestMaleEmployee.get();
        System.out.println(youngestEmployee.getName() + " : " + youngestEmployee.getGender() + " : " + youngestEmployee.getAge() + " : " + youngestEmployee.getDepartment());

        System.out.println("********************************************************");
        //Who has the most working experience in the organization?
        Optional<Employee> firstEmployee = allEmployeeList.stream().sorted(Comparator.comparingInt(Employee::getYearOfJoining)).findFirst();
        Employee employee = firstEmployee.get();

        System.out.println(employee.getName());

        System.out.println("********************************************************");
        //How many male and female employees are there in the HR Departmentg team?

        Map<String, Long> collect1MaleAndFemale = allEmployeeList.stream().filter(e -> e.getDepartment() == "HR Department").collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));

        for(Map.Entry<String,Long> maleAndFemale:collect1MaleAndFemale.entrySet())
        {
            System.out.println(maleAndFemale.getKey() + " : " + maleAndFemale.getValue());
        }
        System.out.println("********************************************************");
        //What is the average salary of male and female employees?

        Map<String, Double> collectAverage = allEmployeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));

        System.out.println(collectAverage);

        System.out.println("********************************************************");
        //List down the names of all employees in each department?

        Map<String, List<Employee>> employeeByDepartment = allEmployeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));

        for(Map.Entry<String,List<Employee>> emp:employeeByDepartment.entrySet())
        {
            System.out.println("---------------------------------");
            System.out.println(emp.getKey() + ":");

            System.out.println("---------------------------------");
            List<Employee> value = emp.getValue();
            for(Employee e:value)
            {
                System.out.println(e.getName());
            }
        }
        System.out.println("********************************************************");
        //What is the average salary and total salary of the whole organization?
        DoubleSummaryStatistics summerized = allEmployeeList.stream().collect(Collectors.summarizingDouble(Employee::getSalary));

        System.out.println("Average Salary = "  +  summerized.getAverage());
        System.out.println("Total Salary = " + summerized.getSum());


    }
}
