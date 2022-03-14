package com.thisgary.lab.module1;

// Activity 4
public class Account {
    private String acctNo;
    private String acctName;
    private final double balance;

    public Account(String acctNo, String acctName, double balance) {
        this.acctNo = acctNo;
        this.acctName = acctName;
        this.balance = balance;
    }

    public String getAcctNo() {
        return (acctNo);
    }

    public String getAcctName() {
        return (acctName);
    }

    public double getBalance() {
        return (balance);
    }

    public void setAcctNo(String acctNo) {
        this.acctNo = acctNo;
    }

    public void setAcctName(String acctName) {
        this.acctName = acctName;
    }
}
