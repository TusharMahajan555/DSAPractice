package com.practice.arrays;


public class sortNumbers
{

    public static void main(String[] args) {

        int[] nums=new int[]{0,2,1,0,2,1,1,2};

                int []arr=new int[nums.length];
                int k=0;

                for(int i=0;i<nums.length;i++)
                {
                    if(nums[i]==0)
                    {
                        arr[k]=nums[i];
                        k++;
                    }
                }
                for(int i=0;i<nums.length;i++)
                {
                    if(nums[i]==1)
                    {
                        arr[k]=nums[i];
                        k++;
                    }
                }

                for(int i=0;i<nums.length;i++)
                {
                    if(nums[i]==2)
                    {
                        arr[k]=nums[i];
                        k++;
                    }
                }

                System.out.println("array is ");

                for(int i=0;i<nums.length;i++)
                {
                    System.out.println(arr[i]);
                    nums[i]=arr[i];
                }

            }
    }
