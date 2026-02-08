package com.practice.streams;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamHashMapFunctions
{
    public static void main(String[] args)
    {
        Map<String,Integer> map=new HashMap<>();
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);

        Stream<Map.Entry<String,Integer>> entryStream=map.entrySet().stream();
//    Stream of keys
        Stream<String> keySet=map.keySet().stream();
//    Stream of Values
        Stream<Integer> keyValue=map.values().stream();

        map.entrySet().stream().filter(entry->entry.getValue()>28)
                .forEach(entry->System.out.println(entry.getValue()));

        List<String> newList=map.entrySet().stream().map(Map.Entry::getKey)
                .collect(Collectors.toList());


        map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));


        Map<String, Integer> filteredMap = map.entrySet().stream()
                .filter(entry -> entry.getValue() > 25)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println(filteredMap);



    }
}
