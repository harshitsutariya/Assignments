package com.uks.LENOVO.core.day1;

import java.util.Scanner;

public class TestCommandLine {
    void validate(String username,String password){
        UserNamePassword userNamePassword=new UserNamePassword(username, password);
        String yourusername=userNamePassword.getUsername();
        String yourpassword=userNamePassword.getPassword();
        String myusername="harshit";
        String mypassword="123";
        if(yourusername.equals(myusername) && yourpassword.equals(mypassword)){
            System.out.println("login successful");
        }
        else
            System.out.println("password and username is different");

    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter username : ");
        String username=sc.next();
        System.out.println("enter password : ");
        String password=sc.next();

        TestCommandLine testCommandLine=new TestCommandLine();
        testCommandLine.validate(username,password);
    }
}
