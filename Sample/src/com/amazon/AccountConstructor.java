package com.amazon;

public class AccountConstructor
{
	String name;
	
	public static void main(String args[])
	{
		AccountConstructor account = new AccountConstructor("Abhishek");
		
		System.out.println("Account Holder: " + account.name);
	}
	AccountConstructor(String _name)
	{
		this.name = _name;
		
		System.out.println("Inside constructor");
	}
}
