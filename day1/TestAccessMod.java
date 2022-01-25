package com.uks.LENOVO.core.day1;

public class TestAccessMod {
    AccessMod accessMod=new AccessMod();

    public void print() {
       accessMod.printProperties();
    }

    public static void main(String[] args){
        TestAccessMod testAccessMod=new TestAccessMod();
        testAccessMod.print();
    }
}
