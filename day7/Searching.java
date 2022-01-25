package com.uks.LENOVO.core.day7;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Searching {

    public static void searchInDir(File file, Pattern p) throws IOException
    {
        File[] files = file.listFiles();
        try
        {
            for (File f : files)
            {
                if (f.isFile())
                {
                    Path path = f.toPath();
                    InputStream is = Files.newInputStream(path);
                    BufferedReader br = new BufferedReader(new InputStreamReader(is));
                    searchInFile(f, br, p);
                }
                else
                {
                    searchInDir(f, p);
                }
            }
        }

        catch (NullPointerException OutOfMemoryError )
        {
            System.out.println("out of memory");
        }
    }

    public static void searchInFile(File file, BufferedReader br, Pattern p1) throws IOException
    {
        int flag = 0;

        while (br.ready())
        {
            String str = br.readLine();
            flag++;

            Matcher m = p1.matcher(str);

            if (m.find())
            {
                System.out.println("\nFile : "+file.getName());
                System.out.println("Line Number : " + flag);
                System.out.println("Line : " + str+"\n");
            }
        }
    }
}