package com.uks.LENOVO.core.day6;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class CompanyInfo
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("choices");

        System.out.println("1.English");
        System.out.println("2.Japanese");

        System.out.println("Enter your choice");
        int input = sc.nextInt();

        switch (input)
        {
            case 1:
            {
                System.out.println("Data in English");

                Locale locale = new Locale("en","US");
                ResourceBundle resourceBundle = ResourceBundle.getBundle("com.uks.LENOVO.core.day6.message_en",locale);

                System.out.println(resourceBundle.getString("name"));
                System.out.println(resourceBundle.getString("headoffice"));
                System.out.println(resourceBundle.getString("branchoffice"));

                break;
            }
            case 2:
            {
                System.out.println("Data in japan");

                ResourceBundle resourceBundle1 = ResourceBundle.getBundle("com.uks.LENOVO.core.day6.message_ja",Locale.JAPAN);

                System.out.println(resourceBundle1.getString("name"));
                System.out.println(resourceBundle1.getString("headoffice"));
                System.out.println(resourceBundle1.getString("branchoffice"));
            }
        }
    }
}