package com.leetcode.arrays;

import java.util.Arrays;

public class smallerNumbersThanCurrent {
    public static void main(String[] args) {
        int[] arr={6,5,4,8};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(arr)));

    }
    static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result=Arrays.copyOf(nums,nums.length);
        Arrays.sort(result);
        for(int i=0;i<nums.length;i++){

            for(int j=0;j<result.length;j++){
                if(nums[i]==result[j]){
                    nums[i]=j;
                    break;
                }
            }

        }
        return nums;
    }
}
