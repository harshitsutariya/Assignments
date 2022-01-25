package com.uks.LENOVO.core.day8;

public class ThreadDemo1 extends Thread{
    public static void printNum() throws InterruptedException {
        for (int i=1;i<=5000;i++){
            System.out.println("Thread<"+Thread.currentThread()+"> : "+i);

            if(i%50 == 0){
                Thread.sleep(100);
            }
        }
    }
}
