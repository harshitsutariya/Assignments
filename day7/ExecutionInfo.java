package com.uks.LENOVO.core.day7;

public class ExecutionInfo {
    public static void main(String[] args){
        beforeCall();
        afterCall();
    }

    public static void beforeCall() {
        long memory=Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.println("memory usage before calling the program : "+memory+"\n");
    }

    public static void afterCall() {
        long memory=Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.println("memory usage after calling the program : "+memory+"\n");
    }
}
