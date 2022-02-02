package com.uks.LENOVO.core.day4.BaseEmployee;

class TLEmployee extends PLEmployee {

    @Override
    public void doWork() {
        assignTaskToJunior();
        collectReportFromJunior();
    }

    void assignTaskToJunior() {
        System.out.println("pls assign some task to junior");
    }

    void collectReportFromJunior() {
        System.out.println("pls collect Report From Junior");
    }

    @Override
    public void reportToSenior() {
        System.out.println("pls provide report to senior");
    }

}
