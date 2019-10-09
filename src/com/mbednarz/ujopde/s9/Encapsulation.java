package com.mbednarz.ujopde.s9;

public class Encapsulation {

    public static void main(String[] args) {

        BankAccount savingAccount = new BankAccount();

        savingAccount.makeDeposit(5000);

        if (savingAccount.withdraw(223))
        {
            System.out.println("Money withdrawn!");
        }
        else
            System.out.println("Not enough money to make a wihdraw!");

        System.out.println("Balance ($): " + savingAccount.getBalance());
    }
}

class BankAccount
{
    public BankAccount()
    {
        balance = 1000;
    }

    private int balance;

    int getBalance()
    {
        return balance;
    }

    private boolean setBalance(int balance)
    {
        /*
        !SECURITY CONDITIONS!
         */
        this.balance = balance;
        return true;
    }

    boolean withdraw(int withdrawalAmount)
    {
        if (balance < withdrawalAmount)
            return false;
        else
            setBalance(balance - withdrawalAmount);

        return true;
    }

    boolean makeDeposit(int depositAmount)
    {
        setBalance(balance + depositAmount);
        return true;
    }
}