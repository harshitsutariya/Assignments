package com.uks.LENOVO.core.day5;

import java.io.IOException;
import java.util.*;

public class EmployeeSortedList {
    public static void main(String[] args) throws IOException {
            returnSortedList();
            RowPrinter.tableFormat();
    }


    public static List<BaseEmployee1> returnSortedList() throws IOException {
        System.out.println("enter Column name for sorting :");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();


        List<BaseEmployee1> list = null;
        switch (input) {

            case "fname":
                list = SortingMethod.firstName();

                break;

            case "lname":

                list = SortingMethod.lastName();
                break;

            case "emptype":

                list = SortingMethod.empType();
                break;

            case "basicsal":

                list = SortingMethod.basicSal();
                break;

            case "empcode":
               list=SortingMethod.empcode();
               break;

            default:
                System.out.println("enter valid column name");

        }

        return list;

    }
}



