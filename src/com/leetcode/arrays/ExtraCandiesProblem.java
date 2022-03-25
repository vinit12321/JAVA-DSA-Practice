package com.leetcode.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExtraCandiesProblem {
    public static void main(String[] args) {
        int[] candies={2,3,5,1,3};
        int n=3;
        System.out.println(Arrays.toString(kidsWithCandies(candies,n).toArray()));

    }
    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> lis=new ArrayList<>();
        int max=0;
        for(int i=0;i<candies.length;i++){
            if(max<candies[i]){
                max=candies[i];
            }
        }
        for(int arr:candies){
            if((arr+extraCandies)<max){
                lis.add(false);
            }
            else
            {
                lis.add(true);
            }
        }
    return lis;
    }
}
