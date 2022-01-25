package com.uks.LENOVO.core.day8;

import java.util.*;

public class GenericTest
{
    public static void main(String[] args)
    {
       Map<Long, String> map = new HashMap<>();

        printAll(map);
        addToDictionary(map);
        printAll(map);
        searchMobile(map);
    }

    private static void addToDictionary(Map<Long, String> map)
    {
        System.out.println("\nEnter Data for another 3 Employees ");
        Scanner scanner = new Scanner(System.in);
        int n = 3;
        for (int i = 1; i <= n; i++)
        {
            System.out.print("\nEnter Mobile Number Of "+i+" Person : ");
            Long number = scanner.nextLong();

            System.out.print("Enter Name of "+i+" Person : ");
            String fName = scanner.next();

            map.put(number, fName);
        }
    }

    private static void searchMobile(Map<Long, String> hashMap)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nEnter Mobile Number to get name :");
        Long x = scan.nextLong();

        System.out.println("Name : "+hashMap.get(x));
    }

    private static void printAll(Map<Long, String> map)
    {
        Set<Map.Entry<Long, String>> set = map.entrySet();

        map.put(9987123456L,"jacob");
        map.put(9819123456L,"jenny");

        for (Map.Entry e : set)
        {
            System.out.println("\nName : " + e.getValue());
            System.out.println("Mobile : " + e.getKey());

        }
    }
}