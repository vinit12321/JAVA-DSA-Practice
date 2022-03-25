package com.dsa;

import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number");
        int n=sc.nextInt();
        System.out.println(n);
        Boolean arm=isArmstrong(n);
        if(arm){
            System.out.println("Number is Armstrong");

        }
        else
        {
            System.out.println("Number is not Armstrong");
        }
    }

     static Boolean isArmstrong(int num) {
        int sum=0,arm;
        int org=num;
        while(num>0)
        {
            int rem=num%10;
            num=num/10;
            sum=sum+rem*rem*rem;
        }
         System.out.println(sum);
        if(sum==org){
            return true;
        }
        else {
            return false;

        }


    }
}
