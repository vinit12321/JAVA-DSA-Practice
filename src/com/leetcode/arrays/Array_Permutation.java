package com.leetcode.arrays;

import java.util.Arrays;

public class Array_Permutation {
    public static void main(String[] args) {
    int arr[]={5,0,1,2,3,4};
    int build_arr[]=new int[arr.length];
    build_arr=buildArray(arr);
        System.out.println(Arrays.toString(build_arr));
    }

    public static int[] buildArray(int[] nums) {
        int[] new_array=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            new_array[i]=nums[nums[i]];
        }

    return new_array;
    }
}
