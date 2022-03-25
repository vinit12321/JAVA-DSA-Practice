package com.leetcode.arrays;

public class maxSubArray {
    public static void main(String[] args) {
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));

    }
    static int maxSubArray(int[] nums) {
        int sum=nums[0];
        int max_value=nums[0];
        for(int i=1;i<nums.length;i++){
            if(sum<0){
                sum=0;
            }
            sum+=nums[i];
          max_value=Math.max(max_value,sum);
        }
        return max_value;
    }
}
