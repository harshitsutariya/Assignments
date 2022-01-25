package com.uks.LENOVO.core.day7;

import java.io.Serializable;

public class EmployeeDetail implements Serializable {
    String name;
    int age;
    double salary;

    public EmployeeDetail(String name, int age, double salary)
    {
        this.name= name;
        this.age=age;
        this.salary =salary;
    }
}
