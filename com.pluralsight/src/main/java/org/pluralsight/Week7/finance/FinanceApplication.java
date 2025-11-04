package org.pluralsight.Week7.finance;

import org.pluralsight.Week7.finance.Bank.BankAccount;

public class FinanceApplication {
    static void main() {
        BankAccount accountOne = new BankAccount("pam", "123", 12500);
        BankAccount accountTwo = new BankAccount("jeff", "456", 52);
        Valuable accountThree = new BankAccount("d", "5555", 2424);

        System.out.println("Value: " + accountOne.getValue());
        // account One
        accountOne.deposit(200);
        accountOne.deposit(500);
        accountOne.deposit(1000);
        // account two
        accountTwo.deposit(400);
        // account three
        System.out.println("Value: " + accountThree.getValue());
        System.out.println("Value: " + accountOne.getValue());
        System.out.println("Value: " +  accountTwo.getValue());
    }
}
