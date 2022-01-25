package com.uks.LENOVO.core.day4;

import java.util.HashMap;
import java.util.Map;

public class FrequencyChecker
{
    public static void main(String[] args)
    {
       checker();
    }

    public static void checker() {
        String[] str ={"harshit","hrucha" ,"arshit","jagat","pavan","harshit","nitin"};
        Map<String, Integer> hashMap = new HashMap<>();
        String[] words = str;
        for(String word : words )
        {
            if(hashMap.containsKey(word))
            {
                hashMap.put(word, hashMap.get(word) + 1);
            }
            else
            {
                hashMap.put(word,1);
            }
        }
        System.out.println(hashMap);
    }
}
