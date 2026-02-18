package com.practice.arrays;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement1 {
    public static void main(String[] args) {

        int []nums=new int[]{2,2,1,1,1,2,2};

        Map<Integer, Integer> counterMap = new HashMap<>();

        int n=(nums.length);

        for(int i:nums){
            counterMap.put(i,counterMap.getOrDefault(i, 0) + 1);
        }
        int max=-1;
        for (Map.Entry<Integer, Integer> entry : counterMap.entrySet()) {
            if(entry.getValue()>(n/2))
            {
                if(max<entry.getValue())
                {
                    max=entry.getKey();
                }
            }
        }
        System.out.println(max);
    }
}