package com.example.lab13.task2;

public class Main {
    public static void main(String[] args) {
        BDAdapter db = new BDAdapter(new BD());
        AuthAdapter auth = new AuthAdapter(new Auth());
        if (auth.auth(db)){
            ReportBuilder rp = new ReportBuilder(db);
            System.out.println("PASSED");
        }
    }
}
