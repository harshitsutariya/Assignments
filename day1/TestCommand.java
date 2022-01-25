package com.uks.LENOVO.core.day1;

import java.util.Scanner;

public class TestCommand {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.print("enter choice :\n1. To add numbers\n2. Change to lowercase\n");

        int j=sc.nextInt();
        if(j==1)
        {

            MultiCommandLine.doOperation();

        }
        else if(j==2) {

            System.out.println("Enter Word :");
            String input = sc.next();
            String lower = null;
            for (int i = 0; i < input.length(); i++) {
                 lower = input.toLowerCase();
            }
            System.out.print(lower);
        }
    }
}


