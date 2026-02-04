package com.practice.streams;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class NumberGreaterThenFifty
{
public static void main(String[] args)
{
    long numberStream=IntStream.iterate(0, x -> x+1).limit(100).filter(x-> x >= 50 && x<=80).skip(10).count();
    double numStream=DoubleStream.iterate(0, x->x+1).limit(100).filter(x->x>=30.0).skip(40).count();

    System.out.println("Numbers greater then fifty are "+numberStream);
    System.out.println("Numbers greater then fifty are "+numStream);

}
}
