package com.practice.arrays;

public class MoveZeroes {

    public static void main(String[] args) {

        int[] nums=new int[]{0,1,0,3,12};



        int i=0;
                int n=nums.length;
                int j=0;

                while(i<n && j<n)
                {
                    if(nums[j]!=0)
                    {

                        int swap=nums[i];
                        nums[i]=nums[j];
                        nums[j]=swap;

                        i++;
                    }
                    j++;
                }

        System.out.println("array is ");

        for(int k=0;k<nums.length;k++)
        {
            System.out.println(nums[k]);

        }



    }

}
