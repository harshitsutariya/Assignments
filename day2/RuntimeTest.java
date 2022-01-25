package com.uks.LENOVO.core.day2;

import java.io.IOException;
import java.util.Map;
import java.util.Set;

public class RuntimeTest {
    public static void main(String[] args) throws IOException {

        ProcessBuilder p = new ProcessBuilder();
        p.command("Notepad", "D:\\GIT.txt");
        p.start();

        Runtime runtime = Runtime.getRuntime();
        runtime.exec("notepad");

        Map<String, String> env = p.environment();
        Set<String> keys = env.keySet();
        for (String key : keys) {
            System.out.println(key + " ==> " + env.get(key));
        }
    }
}