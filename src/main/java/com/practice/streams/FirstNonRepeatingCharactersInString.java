package com.practice.streams;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharactersInString
{
    public static void main(String[] args)
    {

        String str="geeks for geeks";


//        LinkedHashMap::new     it preserves order in any jvm


        Map<Character, Long> map= str.chars().mapToObj(x->(char)x).filter(x->!Character.isWhitespace(x)).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()));

            System.out.println(map);

            for(Map.Entry<Character, Long> entry: map.entrySet())
            {
                    char k= entry.getKey();
                    long v= entry.getValue();
                    if(v==1)
                    {
                        System.out.println(k);
                        return;
                    }
            }


    }

}
