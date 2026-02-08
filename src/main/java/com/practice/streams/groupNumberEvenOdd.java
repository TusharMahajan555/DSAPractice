package com.practice.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class groupNumberEvenOdd
{
    public static void main(String[] args)
    {

        List<Integer> list=List.of(1,4,2,5,9,6,8);


        Map<Boolean, List<Integer>> newGroup=list.stream().collect(Collectors.partitioningBy(x->x%2==0));

        System.out.println(newGroup.get(true));
        System.out.println(newGroup.get(false));

    }
}
