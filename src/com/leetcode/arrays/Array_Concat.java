package com.leetcode.arrays;

import java.util.Arrays;

public class Array_Concat {
    public static void main(String[] args) {
        int[] arr={1,3,2,1};
        System.out.println(Arrays.toString(getConcatenation(arr)));
    }
    public static int[] getConcatenation(int[] nums) {
        int out[]=new int[(nums.length*2)];
        int len=nums.length;
        for(int i=0;i<nums.length;i++)
        {
            out[i]=nums[i];
            out[i+len]=nums[i];
        }
        return  out;
    }
}
