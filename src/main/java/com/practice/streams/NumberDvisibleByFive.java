package com.practice.streams;

import java.util.stream.Collector;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class NumberDvisibleByFive
{

    public static void main(String[] args){

//        boolean isDivisible=Stream.of(50).filter(x->x%5==0).findFirst().isPresent();

        boolean isDivisible=Stream.of(50).anyMatch(x->x%5==0); // atleast one element must divide

        System.out.println("Check Number is Divible "+isDivisible);

    }

}