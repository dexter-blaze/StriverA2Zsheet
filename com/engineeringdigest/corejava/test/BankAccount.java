package com.engineeringdigest.corejava.test;

public class BankAccount {
    private long accountNumber;

    private double balance;

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        if(amount>0){
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
        else{
            System.out.println("Invalid Deposit amount");
        }
    }

    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("Withdrew" + amount);
        }
        else{
            System.out.println("Invalid amount or Insufficient Balance");
        }
    }
}
