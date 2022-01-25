package com.uks.LENOVO.core.day7;

import java.io.*;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class PersistantEmpList {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Hashtable<Integer, EmployeeDetail> hashtable=PersistantEmpList.getData();

        PersistantEmpList.serialize(hashtable);

        PersistantEmpList.deSerialize();
    }

    public static Hashtable<Integer, EmployeeDetail> getData()
    {

        Hashtable<Integer, EmployeeDetail> hashtable = new Hashtable<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of employee :");
        int n = sc.nextInt();
        int i;
        for (i = 1; i <= n; i++)
        {
            System.out.printf("Enter Name of %d Employee: ",i);
            String name = sc.next();
            System.out.print("Enter Age: ");
            int age = sc.nextInt();
            System.out.print("Enter salary: ");
            double salary = sc.nextDouble();

            EmployeeDetail employeeDetail = new EmployeeDetail(name, age, salary);
            hashtable.put(i,employeeDetail);
        }
        return hashtable;
    }

    public static void serialize(Hashtable<Integer, EmployeeDetail> hashtable) throws IOException
    {

        String Path = "files.txt";

        FileOutputStream fileOutputStream = new FileOutputStream(Path);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(hashtable);

        objectOutputStream.close();
        fileOutputStream.close();

        System.out.print("\nSerialization Successful.....\n");
    }

    public static void deSerialize() throws IOException, ClassNotFoundException {

        String filePath="files.txt";
        FileInputStream fileInputStream = new FileInputStream(filePath);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        Hashtable<Integer, EmployeeDetail> hashtable =
                (Hashtable<Integer, EmployeeDetail>) objectInputStream.readObject();

        objectInputStream.close();
        fileInputStream.close();

        System.out.println("\nAfter DeSerialization\n");

        for (Map.Entry<Integer, EmployeeDetail> entry:hashtable.entrySet())
        {
            System.out.println("\nEmployee Name: " + entry.getValue().name
                    +"\nEmployee Age: "+ entry.getValue().age +"\nEmployee Salary: "+  entry.getValue().salary);
        }
    }
}
