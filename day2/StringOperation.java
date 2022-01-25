package com.uks.LENOVO.core.day2;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class StringOperation {

    public static void doOperationWithRegEx() {
        int upper = 0;
        int lower = 0;
        int digit = 0;

        Scanner sc=new Scanner(System.in);
        String input=sc.next();

        for(int j = 1; j < input.length(); j++)
        {
            Pattern p = Pattern.compile("\\d");
            Matcher m = p.matcher(input);
            while(m.find())
            {
                digit++;
            }
            Pattern pat = Pattern.compile("[A-Z]");
            Matcher mat = pat.matcher(input);
            while(mat.find())
            {
                upper++;
            }
            Pattern pattern = Pattern.compile("[a-z]");
            Matcher matcher = pattern.matcher(input);
            while(matcher.find())
            {
                lower++;
            }
        }
        System.out.println("Lower case letters : " + lower/5);
        System.out.println("Upper case letters : " + upper/5);
        System.out.println("Number : " + digit/5);

    }

    public static void reverseInput() {
        Scanner sc=new Scanner(System.in);
        String input=sc.next();
        StringBuilder input1 = new StringBuilder();
        input1.append(input);
        input1.reverse();
        System.out.println(input1);
    }

    public static void doOperation() {
        int upper = 0;
        int lower = 0;
        int digit = 0;

        Scanner sc=new Scanner(System.in);
        String input=sc.next();

        for (int i = 0; i < input.length(); i++) {

                char ch = input.charAt(i);
                if ( ch >= 'A' && ch <= 'Z' )
                    upper++;
                else if ( ch >= 'a' && ch <= 'z' )
                    lower++;
                else if ( ch >= '0' && ch <= '9' )
                    digit++;

        }

            System.out.println("Lower case letters : " + lower);
            System.out.println("Upper case letters : " + upper);
            System.out.println("Number : " + digit);
        }
}