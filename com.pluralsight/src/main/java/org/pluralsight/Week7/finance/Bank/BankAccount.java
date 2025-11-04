package org.pluralsight.Week7.finance.Bank;

import org.pluralsight.Week7.finance.Valuable;

public class BankAccount implements Valuable {
    private String name;
    private String accountNumber;
    private double balance;

    // Consturcotr
    public BankAccount(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }


    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Deposited: " + amount + " into account number:" + accountNumber);
    }

    public void withDraw(double amount) {
        this.balance -= amount;
        System.out.println("Withdrawed: " + amount + " into account number:" +  accountNumber);

    }



    @Override
    public double getValue() {
        return this.balance;
    }
}
