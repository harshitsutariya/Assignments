package com.uks.LENOVO.core.day7;

import java.util.Random;

public class ArrayShuffling
{
    public static void main(String... args)
    {

        String[] array = {"hm","hello","how","are","you","i","am","fine","aap","kese","ho",
        "bs","bahot","badiya","or","batao","aap","batao","kuch","nahi"};

        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[new Random().nextInt(array.length)]+" ");
        }

    }
}