package org.pluralsight.Week7.finance.Bank;

import org.pluralsight.Week7.finance.Valuable;

import java.util.ArrayList;

public class CreditCard  implements Valuable {
    private String name;
    private String accountNumber;
    private double balance;
    private ArrayList<String> charges; // Apple:50, microsoft:1000

    // Constructor
    public CreditCard(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // methods
    public void charge(String Vendor, double amount) {
        String fixedFormat = Vendor + ":" + amount; // Apple:50
        charges.add(fixedFormat);
        System.out.println("Added to charges array");
    }
    // pay()
    public void pay(double... amount) {
        double newBalance = this.balance;
        if(amount.length == 0) {
            for (int i = 0; i < charges.size(); i++) {
                this.balance -= Double.parseDouble(charges.get(i).split(":")[1]);
            }
            newBalance = this.balance;
        } else {
            for (int i = 0; i < amount.length; i++) {
                this.balance -= amount[i];
            }
            newBalance = this.balance;
        }
        System.out.println("New balance:" + newBalance);
    }

    @Override
    public double getValue() {
        return this.balance;
    }
}
