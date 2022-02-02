package com.uks.LENOVO.core.day9;

import java.io.IOException;

public class DemoApplication {
    public static void main(String[] args) throws InterruptedException {


        ThreadGroup threadGroup = new ThreadGroup("threadgroup");

        new LoaderProcess("userLoginInfo");
        new LoaderProcess("userInfo");

        Thread t1 = new Thread(threadGroup,new Runnable() {
            @Override
            public void run() {
                try {
                    LoaderProcess.loadUserLoginInfo();
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"thread1");

        Thread t2=new Thread(threadGroup,new Runnable() {
            @Override
            public void run() {
                try {
                    LoaderProcess.loadUserInfo();
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"thread2");

        Thread t3=new Thread(threadGroup,new Runnable() {
            @Override
            public void run() {
                try {
                    LoaderProcess.mergeInfoAsObject();
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"thread3");

            t1.start();
            t1.join();

            t2.start();
            t2.join();

            t3.start();
            t3.join();
    }
}
