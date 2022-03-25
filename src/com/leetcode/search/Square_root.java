package com.leetcode.search;

public class Square_root {
    public static void main(String[] args) {
        int x=8;
        System.out.println(sqrt(x));
    }

    private static int sqrt(int x) {
        if(x<=1) return x;
        long low=1,high=x;
        long mid=1;
        while(low<=high){
            mid=(low+high)/2;
            long tx=((long)mid)*mid;
            if(tx==x) return (int)tx;
            if(x<tx){
                high=mid-1;
            }
            else{
                low=mid+1;
            }

        }

        return (int) high;

    }

}
