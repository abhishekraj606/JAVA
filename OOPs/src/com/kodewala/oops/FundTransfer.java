package com.kodewala.oops;

public class FundTransfer
{
    private String accountHolderName;
    private String accountNumber;
    private double balance;
    private double amount;

    // Constructor initializes the account details.
    public FundTransfer(String _accountHolderName, String _accountNumber, double _balance)
    {
        this.accountHolderName = _accountHolderName;
        this.accountNumber = _accountNumber;
        this.balance = _balance;
    }

    // Transfers funds only when the amount is valid.
    public boolean transferFunds(double _amount)
    {
        if (_amount <= 0)
        {
            System.out.println("Transaction failed: Amount must be positive.");
            return false;
        }

        if (_amount > balance)
        {
            System.out.println("Transaction failed: Insufficient balance.");
            return false;
        }

        this.amount = _amount;
        this.balance = this.balance - this.amount;

        System.out.println("Fund transfer successful.");
        return true;
    }

    // Allows other classes to read the balance.
    public double getBalance()
    {
        return balance;
    }

    public String getAccountHolderName()
    {
        return accountHolderName;
    }

    public String getAccountNumber()
    {
        return accountNumber;
    }
}