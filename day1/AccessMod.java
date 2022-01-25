package com.uks.LENOVO.core.day1;

class A {
    public int a=10;
    protected float b=1.2F;
    char c='A';
    private String d="harshit";
    public long e=100000;
    protected double f=5.2;
    boolean g=true;

    public void printProperties() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
    }
}


class AccessMod{

    void printProperties(){
        A a1=new A();
        a1.printProperties();
    }
    public static void main(String[] args){
        A a=new A();
        a.printProperties();
    }

}


