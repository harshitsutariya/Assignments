package com.uks.LENOVO.core.day3;

import java.util.Scanner;
public class FormattedNumbers
{
    void ChangeFormatNumber( )
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Format of your number: ");
        String format = sc.nextLine();

        System.out.println("Enter number your number:");
        double number = sc.nextDouble();
        customFormat(format,number);

    }
    public void customFormat(String format, double number )
    {
        if(format.equals("int")) {
            int number1 = (int) number;
            System.out.println("Formatted Number is :" + number1);
        }
        if(format.equals("float")) {
            float number1 = (float) number;
            System.out.println("Formatted Number is :" + number1);
        }
        if(format.equals("double")) {
            double number1 = number;
            System.out.println("Formatted Number is :" + number1);
        }
        if(format.equals("long")) {
            long number1 = (long) number;
            System.out.println("Formatted Number is :" + number1);
        }
    }

    public static void main(String args[])
    {
        FormattedNumbers obj=new FormattedNumbers();
        obj.ChangeFormatNumber();
    }
}