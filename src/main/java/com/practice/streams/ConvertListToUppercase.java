package com.practice.streams;

import java.util.List;

public class ConvertListToUppercase {

    public static void main(String[] args)
    {

        List<String> list= List.of("apple","banana","guava");

        List<String> convertedList= list.stream().map(str->str.toUpperCase()).toList();

        System.out.println("Words converted to uppercase are "+convertedList);

    }

}
