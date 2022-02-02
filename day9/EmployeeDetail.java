package com.uks.LENOVO.core.day9;

public class EmployeeDetail {
    String userid;
    String basicsal,telnumber;
    String username;
    String password;
    String userrole;
    String address;
    String city;

    public EmployeeDetail(String username,String address, String city,String basicsal,String telnumber) {
        this.basicsal = basicsal;
        this.telnumber = telnumber;
        this.username = username;
        this.address = address;
        this.city = city;
    }

    public EmployeeDetail(String userid,String userrole) {
        this.userid = userid;
        this.userrole = userrole;
    }
}

