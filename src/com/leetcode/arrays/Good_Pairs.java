package com.leetcode.arrays;

import java.util.Arrays;

public class Good_Pairs {
    public static void main(String[] args) {
        int arr[]={1,2,3,1,1,3};
        System.out.println(Arrays.toString(arr));
        System.out.println(numIdenticalPairs(arr));
    }
    static int numIdenticalPairs(int[] nums) {
    int total_pair=0;
    for(int i=0;i<nums.length;i++){
        for(int j=i+1;j<nums.length;j++){
            if(nums[i]==nums[j]){
                total_pair+=1;
            }
        }

    }

    return total_pair;
    }
}
