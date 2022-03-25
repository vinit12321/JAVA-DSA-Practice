package com.leetcode.arrays;

import java.util.Arrays;

public class MaximumWealth {
    public static void main(String[] args) {
        int arr[][]={{1,5},{7,3},{3,5}};
        System.out.println(maximumWealth(arr));

    }
    static int maximumWealth(int[][] accounts) {
        int max_sum=0;
        for(int i=0;i<accounts.length;i++)
        {
            int sum=0;
            for(int j=0;j<accounts[i].length;j++)
            {
                sum+=accounts[i][j];
            }
            if(max_sum<sum)
            {
                max_sum=sum;
            }
        }
        return  max_sum;
    }
}
