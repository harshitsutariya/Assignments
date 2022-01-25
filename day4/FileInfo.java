package com.uks.LENOVO.core.day4;

import java.io.File;


public class FileInfo {
    public static void main(String[] args) {

        File f1 = new File(args[0]);

        if ( f1.isFile() ) {
            if ( f1.exists() ) {
                System.out.println("This File is exist");
            } else {
                System.out.print("File doesn't exist");
            }

            System.out.println("This Is File");
            System.out.println("The name of the file is: " + f1.getName());
            System.out.println("The Directory of the file is: " + f1.getParent());

            long size = f1.length();
            System.out.println("Size of " + f1 + " is " + (double) size / 1000 + "kb");
        }


        else if ( f1.isDirectory() ) {
            if ( f1.exists() ) {
                System.out.println("This Directory is exist");
            } else {
                System.out.print("Directory doesn't exist");
            }

            System.out.println("This is Directory");

            long size=0;
            if ( f1.isDirectory() ) {
                File[] filesNames = f1.listFiles();
                for (File temp : filesNames) {
                    if ( temp.isDirectory() ) {
                        File dirs = new File(temp.getPath());
                        getDirSize(dirs);
                    } else {

                        size+=temp.length();

                    }
                }
                System.out.println("size of "+f1+" "+size+ " bytes");
            }
        }
    }

    private static long getDirSize(File dirs) {
        long size = 0;
        for (File file : dirs.listFiles()) {
            if ( file.isFile() )
                size += file.length();
            else
                size += getDirSize(file);

        }
        System.out.println("size of "+dirs+" "+ size +" bytes");
        return size;
    }
}

