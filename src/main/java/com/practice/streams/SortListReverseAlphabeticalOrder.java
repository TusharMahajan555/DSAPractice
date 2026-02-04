package com.practice.streams;
import java.util.Comparator;
import java.util.List;

public class SortListReverseAlphabeticalOrder
{
    public static void main(String[] args)
    {

        List<String> list=List.of("Guava","Apple","Grapes","Pomengranate").stream().sorted(Comparator.reverseOrder()).toList();

        list.forEach(System.out::println);

    }
}