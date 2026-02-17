package com.practice.arrays;

public class SearchMatrix
{
    public static void main(String[] args)
    {

        int [][]matrix =new int[][] {{1,3,5,7},{10,11,16,20},{23,30,34,60}};

        int target=3;
        int output=-1;
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]==target)
                {
                    output=matrix[i][j];
                }
            }
        }

    System.out.println(output);

//        if(arr.length==0) return false;
//        return Arrays.stream(arr).flatMapToInt(Arrays::stream).anyMatch(x -> x==target);



    }
}