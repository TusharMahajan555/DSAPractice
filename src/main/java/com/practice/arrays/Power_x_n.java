package com.practice.arrays;

public class Power_x_n
{
    public static void main(String[] args) {

    double x=2;
    int n=5;


        double multiple=1.0;

        if(n < 0){
            n = -n;
            x = 1 / x;
        }

        for(int i=1;i<=n;i++)
        {
            multiple=multiple*x;
        }
//        return multiple;

        System.out.println(multiple);

    }
    }

