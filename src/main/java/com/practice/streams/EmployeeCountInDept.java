package com.practice.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeCountInDept
{
    public static void main(String[] args) {


        List<Employess> employee= List.of(new Employess("Aman","HR"),
                new Employess("Harsh","Technical"),
                new Employess("naman","HR"),
                new Employess("manan","HR"),
                new Employess("agam","HR"),
                new Employess("naveen","Technical"),
                new Employess("sandeep","HR"),
                new Employess("kanav","Technical"));

        Map<String,Long> newMap=employee.stream().collect(Collectors.groupingBy(Employess::getDepartment,Collectors.counting()));

        System.out.println(newMap);


    }



}
