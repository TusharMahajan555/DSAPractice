package com.practice.arrays;

public class StockBuySell
{
    public static void main(String[] args)
    {

        int[] prices= new int[]{7,6,4,3,1};

        int max=0;
        for(int i=0;i<prices.length;i++)
        {
            for(int j=i+1;j<prices.length;j++)
            {
                if(max<(prices[j]-prices[i]))
                {
                    max=(prices[j]-prices[i]);
                }
            }
        }
System.out.println("highest profit earned "+max);

    }
}
