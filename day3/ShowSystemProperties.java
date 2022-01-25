package com.uks.LENOVO.core.day3;

public class ShowSystemProperties
{
    public static void main(String args[])
    {
        SystemProperties obj=new SystemProperties();
        if(args[0].equals("osname"))
        {
            obj.osName();
        }
        else if(args[0].equals("udir"))
        {
            obj.UserDir();
        }
        else if(args[0].equals("uname"))
        {
            obj.userName();
        }
        else if(args[0].equals("all"))
        {
            obj.osName();
            obj.userName();
            obj.UserDir();
        }
    }
}