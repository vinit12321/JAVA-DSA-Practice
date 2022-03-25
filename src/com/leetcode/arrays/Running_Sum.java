package com.leetcode.arrays;

import java.util.Arrays;

public class Running_Sum {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        System.out.println(Arrays.toString(runningSum(arr)));
    }
    static int[] runningSum(int[] nums) {
        int[] result=new int[nums.length];
        int sum=0;
        for(int i=0;i<=nums.length-1;i++)
        {
            sum+=nums[i];
            result[i]=sum;
        }
    return result;
    }
}
