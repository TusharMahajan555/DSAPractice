package com.practice.streams;

import java.util.*;
import java.util.stream.Collectors;

public class SortEmplooyes
{
    public static void main(String[] args)
    {
        // sort employees by salary
        HashMap<String,Long> map=new HashMap<>();

        map.put("Naman",100l);
        map.put("aman",120l);
        map.put("raman",100l);
        map.put("honey",40l);
        map.put("kant",1000l);
        map.put("rohan",100l);

        HashMap<String,Long> filteredMap=  map.entrySet().stream().sorted(Map.Entry.comparingByValue()).
                collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,
                        (a, b) -> a,
                        LinkedHashMap::new));

        System.out.println(filteredMap);

//        sort by department

        List<Employess> employee= List.of(new Employess("Aman","HR"),
                new Employess("Harsh","Technical"),
                new Employess("naman","HR"),
                new Employess("manan","HR"),
                new Employess("agam","HR"),
                new Employess("naveen","Technical"),
                new Employess("sandeep","HR"),
                new Employess("kanav","Technical"));

        List<Employess> peopleByDepartment=employee.stream()
                .sorted(Comparator.comparing(Employess::getDepartment)).collect(Collectors.toList());


        peopleByDepartment.forEach(e ->
                System.out.println(e.getName() + " - " + e.getDepartment())
        );



//        Highest Paid Employee
        HashMap<String,Long> map1=new HashMap<>();

        map1.put("Naman",100l);
        map1.put("aman",120l);
        map1.put("raman",100l);
        map1.put("honey",40l);
        map1.put("kant",1000l);
        map1.put("rohan",100l);

        String filteredMap1=  map1.entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey).orElse(null);

        System.out.println(" filteredMap1 "+filteredMap1);

    }
}
