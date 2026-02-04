package com.practice.streams;

import java.util.List;
import java.util.stream.Collectors;

public class FilterEvenNumbers {

    public static void main(String[] args)
    {

     List<Integer> list=List.of(1,2,3,4,5,6);

     List<Integer> finalList= list.stream().filter(x->x%2==0).collect(Collectors.toList());

     System.out.println(" Even Numbers"+finalList);

    }

}
