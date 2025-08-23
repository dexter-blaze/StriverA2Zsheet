package com.engineeringdigest.corejava.test;

public class Test2 {
    public static void main(String[] args){
        BankAccount account1 = new BankAccount();
        account1.setAccountNumber(9113408142l);

        System.out.println(account1.getAccountNumber());
        account1.deposit(-10);
        account1.withdraw(10);
        account1.deposit(100);
        account1.withdraw(10);
        System.out.println(account1.getBalance());
    }
}
