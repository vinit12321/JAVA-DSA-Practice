package com.dsa;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[]={1,3,2,8,6,4,7,55,33,75,35};
        int target=1;
        System.out.println("Numbers is at Location "+linearsearch(arr,target));

    }

    private static int linearsearch(int arr[],int target) {
        if(arr.length==0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
