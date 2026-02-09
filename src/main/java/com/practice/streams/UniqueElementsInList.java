package com.practice.streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class UniqueElementsInList
{
    public static void main(String[] args)
    {

        List<String> list=List.of("aman","aman","raman","agaam","ram");

        Map<String,Long> map=list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(map);

        for (Map.Entry<String, Long> entry : map.entrySet()) {
            String k = entry.getKey();
            Long v = entry.getValue();
           if(v<2)
           {
               System.out.println(k);
           }
        }


    }

}
