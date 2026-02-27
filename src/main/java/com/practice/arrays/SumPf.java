package com.practice.arrays;

public class SumPf
{
    public static void main(String[] args) {

        int []arr=new int[]{4,6,5,6,8,4,5};


        int sum=0;

        for (int i=0;i<6;i++)
        {
             sum+=arr[i];
        }

        System.out.println(sum);

    }

}
