package com.practice.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElement2
{
    public static void main(String[] args)
    {
        int []nums=new int[]{2,2,1,1,1,2,2};


        Map<Integer, Integer> counterMap = new HashMap<>();
        int n = nums.length;

        for (int num : nums) {
            counterMap.put(num, counterMap.getOrDefault(num, 0) + 1);
        }

        List<Integer> result = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : counterMap.entrySet()) {
            if (entry.getValue() > n / 3) {
                result.add(entry.getKey());
            }
        }


        System.out.println(result.get(0));

    }
}
