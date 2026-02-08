package com.practice.streams;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import static java.lang.reflect.Array.set;

public class DupliatesInList
{
    public static void main(String[] args)
    {
        List<String> list=List.of("aman","aman","raman","agaam","ram");
        Set<String> set=new HashSet<>();
        Set<String> newList= list.stream().
                filter(x->!set.add(x)).collect(Collectors.toSet());

        System.out.println(" New fliterd list is "+newList);
    }
}