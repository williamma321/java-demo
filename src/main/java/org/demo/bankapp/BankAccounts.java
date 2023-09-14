package org.demo.bankapp;

public class BankAccounts {
    double Account_Balance;

    BankAccounts(double Account_Balance){
        this.Account_Balance = Account_Balance;
    }
    void deposit (double amount) {
        this.Account_Balance += amount;
    }
    void withdraw (double amount) {
        this.Account_Balance -= amount;
    }
}
