package com.amazon;

public class AccountDetails
{
    String name;
    int balance;
    
    public static void main(String args[])
    {
    	AccountDetails account1 = new AccountDetails();
    	System.out.println("Name: " + account1.name);
    	System.out.println("Balance: " + account1.balance);
    	
    	AccountDetails account2 = new AccountDetails("Abhishek");
    	System.out.println("Name: " + account2.name);
    	
        AccountDetails account3 = new AccountDetails("Abhishek", 5000);
    	System.out.println("Name: " + account3.name);
    	System.out.println("Balance: " + account3.balance);
    }
    
    AccountDetails()
    {
        this.name = "Unknown";
        this.balance = 0;
    }

    AccountDetails(String _name)
    {
        this.name = _name;
        this.balance = 0;
    }
    
    AccountDetails(String _name, int _balance)
    {
    	this.name = _name;
    	this.balance = _balance;
    }
    
    
}