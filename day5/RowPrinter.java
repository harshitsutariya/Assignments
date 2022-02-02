package com.uks.LENOVO.core.day5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;
import java.util.Scanner;

public class RowPrinter {


    public static List<BaseEmployee1> readFile() throws IOException {

        String row = "";
        String path="D:\\day5\\assignment.txt";
        String splitBy = ",";

        BufferedReader br = new BufferedReader(new FileReader(path));
        List<BaseEmployee1> list = new ArrayList<>();


        while ((row = br.readLine()) != null) {


            String[] employee = row.split(splitBy);

            BaseEmployee1 baseEmployee1 = new GeneralEmployee(employee[0],
                    employee[1], employee[2], employee[3], employee[4]);
            list.add(baseEmployee1);
        }
        return list;
    }

    public static void print() throws IOException {

        List<BaseEmployee1> list=RowPrinter.readFile();

        int c = 1;
        for (BaseEmployee1 e : list) {
            System.out.println("\nEmployee[" + c + "] : " + e.empCode
                    + "\nName : " + e.fName + " " + e.lName +
                    "\nEmployee type: " + e.empType +
                    "\nSalary: " + e.basicSal + "\n");
            c++;

        }
    }



    public static void tableFormat() throws IOException {

        Formatter fmt = new Formatter();
        fmt.format("%1s %14s %15s %15s %15s\n", "empcode", "fname", "lname", "emptype", "basicsal");

        List<BaseEmployee1> list=EmployeeSortedList.returnSortedList();

        for (BaseEmployee1 e : list)
            fmt.format("%-15s %-15s %-15s %-15s %-15s\n", e.empCode,
                    e.fName, e.lName, e.empType, e.basicSal);
        System.out.println(fmt);

    }
}




