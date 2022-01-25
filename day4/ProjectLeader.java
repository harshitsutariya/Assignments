import java.util.Scanner;

public class ProjectLeader extends Employee {

    long contacts;
    protected String employeeType="PL";


    public ProjectLeader(String name, String laname, String empt,long contact) {
        super(name, laname, empt);
        this.contacts=contact;
    }


    public void print(){
        System.out.println("FirstName:" + fname);
        System.out.println("Lastname:" + lname);
        System.out.println("EmployeeType:" + employeeType);
        System.out.println("contact Number:" + contacts);
    }
}

