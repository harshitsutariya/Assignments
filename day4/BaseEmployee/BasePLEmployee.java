package BaseEmployee;

public class BasePLEmployee {
    public static void main(String args[])
    {
        PLEmployee pe=new PLEmployee();
        pe.Employee();
        pe.print();

        Iwork iwork=new PLEmployee();
        Iwork iwork1=new TLEmployee();
        iwork.doWork();
        iwork1.doWork();

        IReport ireport=new PLEmployee();
        IReport iReport1=new TLEmployee();
        ireport.reportToSenior();
        iReport1.reportToSenior();


    }
}
