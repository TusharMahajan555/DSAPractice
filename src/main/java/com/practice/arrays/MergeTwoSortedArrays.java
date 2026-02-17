package com.practice.arrays;

public class MergeTwoSortedArrays
{


    public static void main(String[] args) {

        int []nums1=new int[]{1,2,3,0,0,0};
        int []nums2=new int[]{2,5,6};

        int m=3;
        int n=3;
        int i=0;
        int j=0;
        int k=0;

        int arr[]=new int[m+n];

        while(i<m && j<n)
        {
            if(nums1[i]<=nums2[j])
            {
                arr[k]=nums1[i];
                k++;
                i++;
            }
            else if(nums1[i]>=nums2[j])
            {
                arr[k]=nums2[j];
                k++;
                j++;
            }
        }

        while(i<m)
        {
            arr[k]=nums1[i];
            i++;
            k++;
        }
        while(j<n)
        {
            arr[k]=nums2[j];
            j++;
            k++;
        }


        for( i=0;i<m+n;i++)
        {
            nums1[i]=arr[i];
         }


        for( i=0;i<m+n;i++)
        {
            System.out.println(nums1[i]);
//            nums1[i]=arr[i];
        }

    }




}
