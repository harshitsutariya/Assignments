package com.uks.LENOVO.core.day7;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;
import java.util.regex.*;
import java.io.*;

public class FindInFiles
{

    public static void main(String[] args) throws Exception
    {

        long start = System.nanoTime();

        ExecutionInfo.beforeCall();

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter String To be Searched : ");
            String word = sc.nextLine();

            System.out.println("Enter Path : ");

            String dir = sc.nextLine();
            File file = new File(dir);
            Path path = file.toPath();

            Pattern p = Pattern.compile(word);

            if (file.isDirectory())
            {
                Searching.searchInDir(file, p);
            }
            else
            {
                InputStream input = Files.newInputStream(path);
                BufferedReader br = new BufferedReader(new InputStreamReader(input));
                Searching.searchInFile(file, br, p);
            }

            ExecutionInfo.afterCall();

            System.out.println("\nBefore calling garbage Collection : ");
            ExecutionInfo.beforeCall();

            Runtime.getRuntime().gc(); // System.gc()

            System.out.println("After calling garbage Collection : ");
            ExecutionInfo.afterCall();

            long end = System.nanoTime();

            System.out.println("Execution time is : " + (end - start) / 1000000000 + " seconds");
    }
}