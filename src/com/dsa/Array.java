package com.dsa;

import java.util.ArrayList;
import java.util.Arrays;

public class Array {

    public static void main(String[] args) {

        int arr[]={1,23,23,33,3535,};
        //System.out.println("Array is "+arr);
        System.out.println(Arrays.toString(arr));
        ArrayList<Integer> list=new ArrayList<>();
        list.add(45);
        list.add(334);
        list.add(23);
        list.add(24);
        System.out.println(list);
        list.set(0,99);
        System.out.println(list);
        swap(arr,0,3);
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));

    }

     static void reverse(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp;
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }

}
