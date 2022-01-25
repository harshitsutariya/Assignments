package com.uks.LENOVO.core.day6;

import com.uks.LENOVO.core.day1.MultiCommandLine;
import com.uks.LENOVO.core.day2.StringOperation;
import com.uks.LENOVO.core.day3.ClassDetail;
import com.uks.LENOVO.core.day3.DateAdd;
import com.uks.LENOVO.core.day3.DateAndTime;
import com.uks.LENOVO.core.day3.DateDifference;
import com.uks.LENOVO.core.day4.FrequencyChecker;
import com.uks.LENOVO.core.day5.EmployeeSearch;
import com.uks.LENOVO.core.day5.EmployeeSortedList;
import com.uks.LENOVO.core.day5.RowPrinter;
import com.uks.LENOVO.core.day5.RowReader;

import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

public class UserInteraction{
    public static void main(String[] args) throws NoSuchMethodException, IOException, ParseException,InvalidInputException{

        System.out.println("a. MultiCommandLine(Assignment 4 of Day 1) ");
        System.out.println("b. StringManipulation(Assignment 3 of Day 2) ");
        System.out.println("c. StringOperation(Assignment 4 of Day 2) ");
        System.out.println("d. PrintDataAndTime(Assignment 3 of Day 3) ");
        System.out.println("e. DateDifference(Assignment 4 of Day 3) ");
        System.out.println("f. DateAdd(Assignment 5 of Day 3) ");
        System.out.println("g. ReflectionInJava(Assignment 8 of Day 3) ");
        System.out.println("h. FrequencyChecker(Assignment 5 of Day 4) ");
        System.out.println("i. EmployeeSearch(Assignment 3 of day 5) ");
        System.out.println("j. SortingRecord(Assignment 4 of Day 5)\n ");


            System.out.println("enter your choice ");
            Scanner sc = new Scanner(System.in);
            String choice = sc.next();
        try{
        switch (choice) {

            case "a":

                System.out.print("enter choice :\n1. To add numbers\n2. Change to lowercase\n");

                int j = sc.nextInt();
                if ( j == 1 ) {
                    MultiCommandLine.doOperation();
                }
                else if ( j == 2 ) {

                    System.out.println("Enter Word :");
                    String input = sc.next();
                    String lower = null;
                    for (int i = 0; i < input.length(); i++) {
                        lower = input.toLowerCase();
                    }
                    System.out.print(lower);
                }
                else
                    throw new InvalidInputException();
                break;

            case "b":
                System.out.println("1. To reverse string");
                System.out.println("2. To count number, upper and lower\n");

                System.out.println("Enter choice : ");

                int k = sc.nextInt();
                switch (k) {
                    case 1: {
                        System.out.println("Enter Word to reverse : ");
                        StringOperation.reverseInput();
                        break;
                    }
                    case 2: {

                        System.out.println("Enter String");
                        StringOperation.doOperation();
                        break;
                    }
                    default:
                        throw new InvalidInputException();
                }
                break;


            case "c":
                System.out.println("Enter String");
                StringOperation.doOperationWithRegEx();
                break;

            case "d":
                DateAndTime.printDateAndTime();
                break;

            case "e":
                DateDifference.dateDifference();
                break;

            case "f":
                DateAdd.addDate();
                break;

            case "g":
                System.out.println("All for all details of class");
                System.out.println("M for all methods of class");
                System.out.println("F for all fields of class\n");

                System.out.println("Enter your choice");
                String input = sc.next();

                if ( input.equals("ALL") ) {
                    ClassDetail.constructor();
                }
                else if ( input.equals("M") ) {
                    ClassDetail.method();
                }
                else if ( input.equals("F") ) {
                    ClassDetail.field();
                }
                else
                    throw new InvalidInputException();

                break;

            case "h":
                FrequencyChecker.checker();
                break;

            case "i":
                EmployeeSearch rs = new EmployeeSearch();
                RowReader.printRecord();
                rs.searchCriteria();
                break;

            case "j":
                EmployeeSortedList.returnSortedList();
                RowPrinter.tableFormat();
                break;

            default:
                throw new InvalidInputException();
        }

        } catch (InvalidInputException e) {
            System.out.println("enter valid choice\n" +e);
        }

    }
}
