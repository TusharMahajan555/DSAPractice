package com.practice.arrays;

public class BubbleSort
{
    public static void main(String[] args) {

        int arr[]=new int[]{4,8,1,9,2,5,3};
        int n=arr.length;
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n-1-i;j++)
                {
                    if(arr[j]>arr[j+1])
                    {
                        int temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                    }
                }
            }

            for (int i=0;i<n;i++)
            {
                System.out.print(arr[i]+" ");
            }

    }
}