package com.practice.streams;

import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemoveNullValuesFromList
{
    public static void main(String[] args)
    {

        List<String> list= Stream.of("apple","","","null","null","banana","grapes").filter(str -> (!str.equals("") && !str.equals("null") )).collect(Collectors.toList());

        System.out.println(" New List "+list);

    }
}