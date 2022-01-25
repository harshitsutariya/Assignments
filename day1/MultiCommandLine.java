package com.uks.LENOVO.core.day1;

import java.util.Scanner;

public class MultiCommandLine {
//    public static boolean isInt(String string) {
//            try {
//                Integer.parseInt(string);
//                return true;
//            } catch (NumberFormatException e) {
//                System.out.println("enter valid input");
//
//            }
//            return false;
//        }

        public static void doOperation() {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter total of number to add");
        int total=sc.nextInt();
        int input;
        int sum=0;

            System.out.println("Enter number to add");
            for (int i = 0; i < total; i++) {
                input=sc.nextInt();

                    sum += input;
            }
            System.out.println(sum);
        }
}