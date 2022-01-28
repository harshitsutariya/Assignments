package com.uks.LENOVO.core.day8;

import java.io.IOException;

public class SynchronizedThreading {
    public static void main(String[] args) throws IOException, InterruptedException {

        EmpInfoMerger nameThread=new EmpInfoMerger("D:\\name.txt","read","name");
        EmpInfoMerger addressThread=new EmpInfoMerger("D:\\address.txt","read","address");
        EmpInfoMerger writeThread=new EmpInfoMerger("D:\\naw.txt","write","null");

        synchronized (nameThread) {
            nameThread.wait(100);
            nameThread.start();
        }
        synchronized (addressThread) {
            addressThread.wait(100);
            addressThread.start();
            addressThread.join();
        }
        synchronized (writeThread) {
            writeThread.wait(100);
            writeThread.start();
        }
    }
}

