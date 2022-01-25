package com.uks.LENOVO.core.day3;

import java.util.Scanner;

public class MainClassDetail{
    public static void main(String args[]) throws Exception {

        System.out.println("Enter Main Classname");
        Scanner sc=new Scanner(System.in);
        String in=sc.next();

        if(in.equals("UserInteraction")){
            ClassDetail.typeOfInfo();
        }
        else
        {
            throw new Exception("no class found");
        }

    }
}
