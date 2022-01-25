package com.uks.LENOVO.core.day3;

public class Employee extends Caller {

    public static void main(String args[]) {

        Employee employee = new Employee();
        Employee.SalaryStructure inner = employee.new SalaryStructure();

        if(args[0].isEmpty()){
            System.out.println("enter name");
        }
        else {

            employee.empNameSal(args);
        }

        if(args[1].isEmpty()){
            System.out.println("enter salary");
        }
        else{
           inner.basicSal(args);
        }


        inner.print();



    }

}

