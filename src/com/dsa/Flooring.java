package com.dsa;

public class Flooring {
    public static void main(String[] args) {

        System.out.println("Hello Starting the binary search ");
        int arr[]={1,4,7,32,36,43,55,65,74,79,80};
        int target=52;
        int ans=Flooring(arr,target);
        System.out.println(ans);
        System.out.println(arr[ans]);
    }

    static int Flooring(int[] arr, int target) {
        int start=0;
        int end=arr.length-1;
        while (start<=end){

            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else

            {
                return mid;
            }
        }

        return end;
    }
}
