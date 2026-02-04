package com.practice.streams;

import java.util.List;

public class MultiplyEachNumberByTwo {

    public static void main(String[] args)
    {
        List<Long> list= List.of(2L, 1L, 3L, 4L, 5L, 6L, 7L, 8L, 9L);

        List<Long> newList=list.stream().map(x->x*2).toList();

        newList.forEach(System.out::println);

    }

}
