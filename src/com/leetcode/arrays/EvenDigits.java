package com.leetcode.arrays;

import java.util.Arrays;

public class EvenDigits {
    public static void main(String[] args) {
    int arr[]={1,33,22,23,123,4};
        System.out.println(EvenDigits(arr));
        int ar[]=new int[10];
        Arrays.fill(ar, -1);
        System.out.println(Arrays.toString(ar));
    }
    static int EvenDigits(int arr[]){
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(digits(arr[i])%2==0){
                count++;
            }
        }
        return  count;
    }
    static boolean Contains(int num){
        int count=0;
        if(num<0){

        }
        while(num>0){
            count++;
            num=num/10;
        }

        if(count%2==0){
            return true;
        }
        return  false;
    }
    static int digits(int num){
        if(num<0){
            num=num*-1;
        }
        return (int) (Math.log10(num) +1);
    }
}
