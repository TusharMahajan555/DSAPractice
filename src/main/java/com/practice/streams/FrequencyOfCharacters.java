package com.practice.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FrequencyOfCharacters
{
        public static void main(String []args)
        {

            List<Character> list=List.of('e','a','b','e','a','c','f');

            Map<Character,Long> frequencyList= list.stream().
                    collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

            frequencyList.forEach((k,v)->System.out.println("Key "+k+" value "+v));

            String str="I am a java Springboot microservice developer and java is an amazing Language";

            List<String> newList=new ArrayList<>();

            String[] words = str.split("\\s+");

            for(String word:words)
            {
                newList.add(word);
            }

            System.out.println(newList);

            // Character frequency
//   Map<Character, Long> charFrequency =str.replaceAll("\\s+", "").chars()
//                            .mapToObj(c -> (char) c)
//                            .collect(Collectors.groupingBy(Function.identity(),
//                                    Collectors.counting()));

            Map<String, Long> frequencyMap1=newList.stream()
                    .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

            frequencyMap1.forEach((k,v)->System.out.println("Key "+k+" Value "+v));
        }

        int []arr=new int[]{1,3,6,1,7,2,6,3,6};

        Map<Integer, Long> intStream= Arrays.stream(arr).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

}