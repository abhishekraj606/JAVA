package com.amazon;

public class AccountOverloading
{
	AccountOverloading(String name, int balance)
	{
		System.out.println("Account constructor with name and balance");
	}
	
	public static void main(String args[])
	{
		AccountOverloading account = new AccountOverloading();
		AccountOverloading account1 = new AccountOverloading("Abhishek");
		AccountOverloading account2 = new AccountOverloading("Abhishek", 5000);
	}
	
	AccountOverloading()
	{
		System.out.println("Default account constructor");
	}
	
	AccountOverloading(String name)
	{
		System.out.println("Account Constructor with name");
	}

}