package BaseEmployee;

import java.util.Scanner;

public abstract class BaseEmployee implements Iwork
{
    protected String fname,lname,emptype;
    protected double basicsal;
    Scanner sc = new Scanner(System.in);
    public void Employee()
    {
        fname = sc.nextLine();
        lname = sc.nextLine();
        emptype=sc.nextLine();
        basicsal=sc.nextDouble();
    }

}

