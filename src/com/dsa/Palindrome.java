package com.dsa;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        System.out.println("Enter the String to check palindrome");
        Scanner sc=new Scanner(System.in);
        String name = sc.next();
        System.out.println(name);
        char[] name_arr = name.toCharArray();
        char[] reverse = new char[name_arr.length];

        System.out.println(name_arr);
        for(int i=name_arr.length-1,k=0;i>=0;i--){
            reverse[k]=name_arr[i];
            k++;
        }
        System.out.println(reverse);
        String res = new String(reverse);
        System.out.println(res.equals(name));
        if(res.equals(name)){
            System.out.println("String is Palindrome");
        }
        else{
            System.out.println("String is not palindrome");

        }
        // Better Approach for Palindrome
        System.out.println("With New Approach");
        boolean result= palindrome(name);
        if(result){
            System.out.println("String is palindrome");

        }
        else {
            System.out.println("String is not palindrome");
        }

    }

     static Boolean palindrome(String name) {
        int k=0,j=name.length()-1;
        while(k<j){
            if(name.charAt(k)!=name.charAt(j)){
                return false;
            }
            k++;
            j--;
        }
        return  true;
    }
}
