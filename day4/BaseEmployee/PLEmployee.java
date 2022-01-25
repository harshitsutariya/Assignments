package BaseEmployee;

class PLEmployee extends BaseEmployee implements IReport {

    String employeeType = "PL";

    public void print() {
        long contact;
        contact = sc.nextLong();

        System.out.println("FirstName:" + fname);
        System.out.println("Lastname:" + lname);
        System.out.println("EmployeeType:" + employeeType);
        System.out.println("Salary:" + basicsal);
        System.out.println("contact Number:" + contact);

    }

    @Override
    public void doWork() {
        assignTaskToJunior();
        collectReportFromJunior();

    }

    void assignTaskToJunior() {
        System.out.println("assigntasktojunior");
    }

    void collectReportFromJunior() {
        System.out.println("collectReportFromJunior");
    }

    @Override
    public void reportToSenior() {
        System.out.println("report to senior");
    }
}
