package com.uks.LENOVO.core.day3;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

public class ClassDetail{


    public static void typeOfInfo() throws NoSuchMethodException {

        Scanner sc=new Scanner(System.in);

        System.out.println("All for all details of class");
        System.out.println("M for all methods of class");
        System.out.println("F for all fields of class\n");

        System.out.println("Enter your choice");
        String input=sc.next();

        if(input.equals("ALL")){
            constructor();
        }
        if(input.equals("M")){
            method();
        }
        if(input.equals("F")){
            field();
        }
    }



     static ClassDetail cd=new ClassDetail();
     static Class cls = cd.getClass();

    public static void constructor() throws NoSuchMethodException {
        Constructor constructor = cls.getConstructor();
        System.out.println(constructor.getName());

        method();
        field();
    }

    public static void method(){
        Method[] methods=cls.getDeclaredMethods();
        for(Method meth: methods)
        {
            System.out.println(meth.getName());
        }
    }

    public static void field(){
        Field[] fds = cls.getFields();
        for(Field fd: fds)
        {
            System.out.println(fd.getName());
        }
        System.out.print("no fields are there");
    }
}
