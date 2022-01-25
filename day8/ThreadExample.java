package com.uks.LENOVO.core.day8;

public class ThreadExample {
    public static void main(String[] args) throws InterruptedException {

        ThreadDemo1.printNum();

        Runnable runnable=new ThreadDemo2();
        Thread thread=new Thread(runnable);

        thread.start();
    }
}
