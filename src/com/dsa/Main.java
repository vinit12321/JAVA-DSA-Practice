package com.dsa;
import javax.xml.transform.stream.StreamSource;
import  java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.print("Hello World");
//        int a,b;
//        a=5+4;
//        System.out.print(a);
        System.out.println("Hello World");
        System.out.println("Tata Motors Shared falled by 2.75 & Tata Steel has fallen down by 55% from its 52-week high");
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter some value");
        int scv=sc.nextInt();
        System.out.println("Your number is "+scv);
        System.out.println("Enter fruit value");
        String fruit=sc.next();
        switch (fruit){
            case "Mango":
                System.out.println("Its mango");
                break;
            case "Apple":
                System.out.println("Its Apple");
            case "Orange":
                System.out.println("Its orange fruit");
                break;
            default:
                System.out.println("Fruits are not matching.Please enter valid fruits");
        }

    }
}
