package com.practice.arrays;

import java.util.Arrays;

public class findDuplicateNumbers
{

    public static void main(String[] args) {

        int nums[] = {1,3,4,2,2};

        Arrays.sort(nums);

         int num=0;
        for(int i=0;i<nums.length-1;i++)
        {
             if(nums[i]==nums[i+1])
            {
                num=nums[i];
            }

        }

            System.out.println("Duplicate number is "+num);

    }
}
