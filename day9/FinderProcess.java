package com.uks.LENOVO.core.day9;

import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FinderProcess {

    static Map<Integer, EmployeeDetail> newMap = LoaderProcess.map1;
    static  Scanner sc = new Scanner(System.in);
    static  EmployeeDetail emp=null;

    static synchronized void authenticate() throws IOException, InterruptedException {

        int i = 1;

        while (i <= 3) {

            System.out.print("\nEnter UserName :");
            String username = sc.nextLine();
            System.out.print("Enter PassWord :");
            String passWord = sc.nextLine();

            Thread.sleep(1000);

            for (Map.Entry<Integer, EmployeeDetail> entry : newMap.entrySet()) {

                Pattern p = Pattern.compile(username);
                Pattern p1 = Pattern.compile(passWord);

                Matcher m = p.matcher(entry.getValue().username);
                Matcher m1 = p1.matcher(entry.getValue().password);

                if (m.find() && m1.find()) {
                    System.out.println("\nLogin Successful");

                    Thread.sleep(1000);

                    System.out.println("\nProfile Information : ");

                    System.out.println("\nUser Name : " + entry.getValue().username + "\nRole : " +
                            entry.getValue().userrole + "\nAddress : " + entry.getValue().address + "\nCity : " +
                            entry.getValue().city + "\nSalary : " + entry.getValue().basicsal +
                            "\nContact Number : " + entry.getValue().telnumber);

                    if ((entry.getValue().userrole).equals("manager")){
                        showOptionForManager();
                    }
                    else if((entry.getValue().userrole).equals("admin")){
                        showOptionForAdmin();
                    }

                    System.exit(0);
                }
            }

            if (emp == null) {
                System.out.println("Either User Name or Password is wrong. Please try again." +
                        " Remaining Try " + (3 - i));
                i++;
                Thread.sleep(2000);
            }
        }

        if (i > 3) {
            System.out.println("\nThe System gets closed because the data you have provided is not valid." +
                    " Please re-confirm it.");
            System.exit(1);
        }
    }

    static synchronized void showOptionForManager() {

        System.out.println("\nDisplay Employee List (Press L)\nSearch for Employee (Press S) \n");
        System.out.print("Enter Choice : ");

        String input=sc.next();
        switch (input){

            case "L":
                System.out.println("1. Back to main Menu (Press B)\n2. Press E for Employees\n" +
                        "3. Log Off (O)\n4. Exit(X)\n");

                System.out.println("\nEnter choice");
                String choice=sc.next();

                if(choice.equals("B")){
                    showOptionForManager();
                }

                else if(choice.equals("E")){
                    System.out.println("Employee List : ");
                    for (Map.Entry<Integer, EmployeeDetail> entry : newMap.entrySet()){
                        while ((entry.getValue().userrole).equals("employee")){
                            System.out.println(entry.getValue().username);

                            break;
                        }
                    }
                }

                else if(choice.equals("O")){
                    System.out.println("log off");
                }

                else if(choice.equals("X")){
                    System.exit(0);
                }

                else{
                    System.out.println("\nEnter valid choice");
                }
                break;

            case "S":

                System.out.println("1. Back to main Menu (Press B)\n2. Press E for search Employees\n" +
                        "3. Log Off (O)\n4. Exit(X)");

                System.out.println("\nEnter choice : ");
                choice=sc.next();

                if(choice.equals("B")){
                    showOptionForManager();
                }

                else if(choice.equals("E")){

                    System.out.println("Enter Employee name : ");
                    String name=sc.next();

                    for (Map.Entry<Integer, EmployeeDetail> entry : newMap.entrySet()){

                        Pattern p = Pattern.compile(name);
                        Matcher m = p.matcher(entry.getValue().username);

                        if (m.find() && (entry.getValue().userrole).equals("employee")){
                            System.out.println("\nUser Name : " + entry.getValue().username + "\nRole : " +
                                    entry.getValue().userrole + "\nAddress : " + entry.getValue().address + "\nCity : "
                                    + entry.getValue().city + "\nSalary : " + entry.getValue().basicsal +
                                    "\nContact Number : " + entry.getValue().telnumber);

                            System.exit(0);
                        }
                    }
                    if (emp==null){
                        System.out.println("Employee not found");

                    }

                }

                else if(choice.equals("O")){
                    System.out.println("log off");
                }

                else if(choice.equals("X")){
                    System.exit(0);
                }

                else{
                    System.out.println("\nEnter valid choice");
                }
                break;

            default:
                System.out.println("\nEnter Valid Choice");
        }
    }

    static synchronized void showOptionForAdmin() {
        System.out.println("\nDisplay a List (Press L)\nSearch for Employee (Press S) \n");

        System.out.print("Enter Choice : ");
        String input=sc.next();

        switch (input){
            case "L":
                System.out.println("1. Back to main Menu (Press B)\n2. Press E for Employees\n" +
                        "3. Press M for Manager\n4. Press A for admin \n5. ALL for all\n6. Log Off (O)\n7. Exit(X)");

                System.out.println("enter choice");
                String choice=sc.next();

                if(choice.equals("B")){
                    showOptionForAdmin();
                }
                else if(choice.equals("E")){

                    System.out.println("Employee List : ");
                    for (Map.Entry<Integer, EmployeeDetail> entry : newMap.entrySet()){
                        while ((entry.getValue().userrole).equals("employee")){
                            System.out.println(entry.getValue().username);

                            break;
                        }
                    }
                }
                else if(choice.equals("M")){

                    System.out.println("Manager List : ");
                    for (Map.Entry<Integer, EmployeeDetail> entry : newMap.entrySet()){
                        while ((entry.getValue().userrole).equals("manager")){
                            System.out.println(entry.getValue().username);

                            break;
                        }
                    }
                }
                else if(choice.equals("A")){

                    System.out.println("Admin List : ");
                    for (Map.Entry<Integer, EmployeeDetail> entry : newMap.entrySet()){
                        while ((entry.getValue().userrole).equals("admin")){
                            System.out.println(entry.getValue().username);

                            break;
                        }
                    }
                }
                else if(choice.equals("ALL")){

                    System.out.println("All User List : ");
                    for (Map.Entry<Integer, EmployeeDetail> entry : newMap.entrySet()){

                            System.out.println(entry.getValue().username);
                    }
                }
                else if(choice.equals("O")){
                    System.out.println("log off");
                }
                else if(choice.equals("X")){
                    System.exit(0);
                }
                else{
                    System.out.println("\nEnter valid choice");
                }
                break;

            case "S":
                System.out.println(" 1. Back to main Menu (Press B)\n2. Press E for Employees\n" +
                        "3. Press M for Manager\n4. Press A for admin \n5. ALL for all\n6. Log Off (O)\n7. Exit(X)");

                System.out.println("Enter choice");
                choice=sc.next();

                if(choice.equals("B")){
                    showOptionForAdmin();
                }

                else if(choice.equals("E")){
                    System.out.println("Enter Employee name : ");
                    String name=sc.next();

                    for (Map.Entry<Integer, EmployeeDetail> entry : newMap.entrySet()){

                        Pattern p = Pattern.compile(name);

                        Matcher m = p.matcher(entry.getValue().username);

                        if (m.find() && (entry.getValue().userrole).equals("employee")){
                            System.out.println("\nUser Name : " + entry.getValue().username + "\nRole : " +
                                    entry.getValue().userrole + "\nAddress : " + entry.getValue().address + "\nCity : "
                                    + entry.getValue().city + "\nSalary : " + entry.getValue().basicsal +
                                    "\nContact Number : " + entry.getValue().telnumber);

                            System.exit(0);
                        }
                    }
                    if(emp==null){
                        System.out.println("Employee not found");
                    }
                }

                else if(choice.equals("M")){
                    System.out.println("Enter Manager name : ");
                    String name=sc.next();

                    for (Map.Entry<Integer, EmployeeDetail> entry : newMap.entrySet()){

                        Pattern p = Pattern.compile(name);

                        Matcher m = p.matcher(entry.getValue().username);

                        if (m.find() && (entry.getValue().userrole).equals("manager")){
                            System.out.println("\nUser Name : " + entry.getValue().username + "\nRole : " +
                                    entry.getValue().userrole + "\nAddress : " + entry.getValue().address + "\nCity : "
                                    + entry.getValue().city + "\nSalary : " + entry.getValue().basicsal +
                                    "\nContact Number : " + entry.getValue().telnumber);

                            System.exit(0);
                        }
                    }
                    if(emp==null){
                        System.out.println("Manager not found");
                    }
                }

                else if(choice.equals("A")){
                    System.out.println("Enter Admin name : ");
                    String name=sc.next();

                    for (Map.Entry<Integer, EmployeeDetail> entry : newMap.entrySet()){

                        Pattern p = Pattern.compile(name);

                        Matcher m = p.matcher(entry.getValue().username);

                        if (m.find() && (entry.getValue().userrole).equals("admin")){
                            System.out.println("\nUser Name : " + entry.getValue().username + "\nRole : " +
                                    entry.getValue().userrole + "\nAddress : " + entry.getValue().address + "\nCity : "
                                    + entry.getValue().city + "\nSalary : " + entry.getValue().basicsal +
                                    "\nContact Number : " + entry.getValue().telnumber);

                            System.exit(0);
                        }
                    }

                    if(emp==null){
                        System.out.println("Admin not found");
                    }
                }
                else if(choice.equals("ALL")){
                    for (Map.Entry<Integer, EmployeeDetail> entry : newMap.entrySet()){

                            System.out.println("\nUser Name : " + entry.getValue().username + "\nRole : " +
                                    entry.getValue().userrole + "\nAddress : " + entry.getValue().address + "\nCity : "
                                    + entry.getValue().city + "\nSalary : " + entry.getValue().basicsal +
                                    "\nContact Number : " + entry.getValue().telnumber);
                    }
                }

                else if(choice.equals("O")){
                    System.out.println("log off");
                }

                else if(choice.equals("X")){
                    System.exit(0);
                }

                else{
                    System.out.println("\nEnter valid choice");
                }
                break;

            default:
                System.out.println("\nEnter Valid Choice");
        }
    }
}


