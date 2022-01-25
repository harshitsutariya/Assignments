package com.uks.LENOVO.core.day6;

import java.io.*;

public class ExceptionDemo {

    public static void ExceptionExample() {

        try
        {
            FileInputStream fileInputStream = new FileInputStream("hello.txt");
            System.out.println("no exception");
        }

        catch (FileNotFoundException fnf)
        {
            fnf.printStackTrace();
            System.out.println("File not Found");
        }

        catch (IOException io)
        {
            io.printStackTrace();
            System.out.println("IO Exception found");
        }

        catch(Exception e)
        {
            e.printStackTrace();
            System.out.println("exception occur");
        }
    }
}
