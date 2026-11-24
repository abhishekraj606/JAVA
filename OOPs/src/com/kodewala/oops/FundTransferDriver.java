package com.kodewala.oops;

public class FundTransferDriver
{
    public static void main(String[] args)
    {
        FundTransfer account = new FundTransfer("Abhishek Raj", "1234567890", 5000);

        System.out.println("Account Holder: " + account.getAccountHolderName());
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Initial Balance: " + account.getBalance());

        double transferAmount = 1500;

        account.transferFunds(transferAmount);

        System.out.println("Final Balance: " + account.getBalance());
    }
}