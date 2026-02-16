package com.practice.streams;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.mapping;


public class GroupEmployeesByDept
{
    public static void main(String[] args){

        List<Employess> employee= List.of(new Employess("Aman","HR"),
                new Employess("Harsh","Technical"),
                new Employess("naman","HR"),
                new Employess("manan","HR"),
                new Employess("agam","HR"),
                new Employess("naveen","Technical"),
                new Employess("sandeep","HR"),
                new Employess("kanav","Technical"));

        Map<String,List<String>> peopleByDepartment=employee.stream()
                .collect(Collectors.groupingBy(Employess::getDepartment,
                        Collectors.mapping(Employess::getName,Collectors.toList())));

        System.out.println(peopleByDepartment);
}
}