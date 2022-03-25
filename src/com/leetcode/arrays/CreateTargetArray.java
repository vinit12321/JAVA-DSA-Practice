package com.leetcode.arrays;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;

public class CreateTargetArray {

    public static void main(String[] args) {
        int arr[]={0,1,2,3,4};
        int index[]={0,1,2,2,1};

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(createTargetArray(arr,index)));

    }

    static int[] createTargetArray(int[] nums, int[] index) {
        int arr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++) {
            insert(arr,nums[i],index[i]);
        }
        return arr;
    }

     static void insert(int[] arr, int num, int index) {
        int i;
        for(i=arr.length-1;i>index;i--){

            arr[i]=arr[i-1];
        }
        arr[i]=num;

    }


}
