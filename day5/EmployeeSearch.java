package com.uks.LENOVO.core.day5;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class EmployeeSearch {

    public static void main(String[] args) throws IOException {

        RowReader.printRecord();
        searchCriteria();
    }

    public static void searchCriteria() throws IOException {

        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter Lastname :");
        String lastName = sc.next();

        RowPrinter.readFile();

        List<BaseEmployee1> list=RowPrinter.readFile();

        int c = 1;

//        Collections.sort(list);

        for (BaseEmployee1 e : list) {
            if ( (e.lName).equals(lastName) ) {
                System.out.println("\nEmployee[" + c + "] : " + e.empCode
                        + "\nName : " + e.fName + " " + e.lName +
                        "\nEmployee type: " + e.empType +
                        "\nSalary: " + e.basicSal + "\n");
                c++;
            }

        }

    }
}
