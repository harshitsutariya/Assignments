package com.uks.LENOVO.core.day5;

public class BaseEmployee1 implements Comparable<BaseEmployee1>
{

    String fName,lName,empType;
    int empCode,basicSal;

    BaseEmployee1(String empcode,String fname, String lname, String emptype, String basicsal){
        this.empCode = Integer.parseInt(empcode);
        this.fName=fname;
        this.lName=lname;
        this.empType=emptype;
        this.basicSal= Integer.parseInt(basicsal);
    }
    @Override
    public int compareTo(BaseEmployee1 o) {
        if((this.empCode)>(o.empCode))
            return 1;
        else
            return -1;
    }
}

