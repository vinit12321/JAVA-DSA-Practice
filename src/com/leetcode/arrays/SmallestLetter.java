package com.leetcode.arrays;

public class SmallestLetter {

    public static void main(String[] args) {
        System.out.println("Hello Starting the binary search ");
        int letters[]={2,3,5,9,14,16,18};
        int target=15;
        int ans=CeilingChar(letters,target);
        System.out.println(ans);
        System.out.println(letters[ans]);
    }

    static int CeilingChar(int[] letters, int target) {
        int start=0;
        int end=letters.length-1;
        while (start<=end){

            int mid=start+(end-start)/2;
            if(target<letters[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }

        }

        return letters[start%letters.length];
    }
}
