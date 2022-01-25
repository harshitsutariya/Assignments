package com.uks.LENOVO.core.day2;

import java.util.Scanner;

public class StringManipulation extends StringOperation {
    public static void main(String[] args) {

        System.out.println("1. To reverse string");
        System.out.println("2. To count number, upper and lower");
        System.out.println("3. to count digit, upper and lower with regex\n");

        System.out.println("Enter choice : ");

        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        switch (i) {
            case 1: {
                System.out.println("Enter Word to reverse : ");
                reverseInput();
                break;
            }
            case 2: {

                System.out.println("Enter String");
                doOperation();
                break;
            }

            case 3:{
                System.out.println("count with regex");
                doOperationWithRegEx();
                break;
            }
            default:System.out.print("enter valid ips");
        }

    }
}
