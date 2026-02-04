package com.practice.streams;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class FirstElementGreaterThenTen
{
    public static void main(String[] args)
    {

        long numbers= IntStream.iterate(0, x->x+1).limit(15).filter(x -> x>10).findFirst().orElseThrow();

        System.out.println("Number is "+numbers);

    }

}
