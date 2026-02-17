package com.practice.arrays;

public class PrefixSum {

    public static void main(String[] args) {

        int []arr=new int[]{10,20,10,5,15};
        int []nums=new int[arr.length];
        int k=0;
        nums[k]=arr[0];
        k++;

        for(int i=1;i<arr.length;i++)
        {
            nums[k]=nums[k-1]+arr[i];
            k++;
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(nums[i]+" ");
        }
    }

}
