package com.practice.streams;

import java.util.List;

public class SortListInAscOrder {

    public static void main(String[] args)
    {

        List<Integer> list=List.of(1,7,3,9,2,6);

        list.stream().sorted().forEach(System.out::println);



    }

}