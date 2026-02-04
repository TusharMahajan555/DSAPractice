package com.practice.streams;

import java.util.List;
import java.util.Optional;

public class FindMin {

    public static void main(String[] args)
    {

        Optional<Integer> list= List.of(1,-2,25,40,7,10).stream().min(Integer::compare);

        System.out.println(list);

    }

}
