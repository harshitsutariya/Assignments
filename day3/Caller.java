package com.uks.LENOVO.core.day3;


class Caller{


    static String empname;
    public void empNameSal(String args[]){
            empname = args[0];
    }

    class SalaryStructure {

            Double basicSal;
            Double hra;
            Double totalSalary;

            public void basicSal (String args[]) {basicSal = Double.parseDouble(args[1]);

            hra = (12.5 / 100) * basicSal;
            totalSalary = basicSal + hra;
        }

        public void print()
        {
            System.out.println("Employee name:- " + empname + "\n" + "Basic Salary:-" + basicSal + "\n" + "HRA:-" + hra + "\n" + "Total Salary:-" + totalSalary);
        }
    }

}
