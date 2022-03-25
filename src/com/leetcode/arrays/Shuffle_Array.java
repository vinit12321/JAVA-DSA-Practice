package com.leetcode.arrays;

import java.util.Arrays;

public class Shuffle_Array {
    public static void main(String[] args) {
        int arr[]={2,5,1,3,4,7};
        int n=3;
        System.out.println(Arrays.toString(shuffle(arr,n)));
    }
    static int[] shuffle(int[] nums, int n) {
        int[] result=new int[nums.length];
        int k=0;
        for(int i=0;i<(nums.length)/2;i++)
        {
            result[k]=nums[i];
            k++;
            result[k]=nums[i+n];
            k++;
        }
        return result;
    }
}
