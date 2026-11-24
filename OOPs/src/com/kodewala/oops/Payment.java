package com.kodewala.oops;

public class Payment
{
	private int balance; // Data or Variable

	public Payment(int balance)
	{
		super();
		this.balance = balance;
	}
	
	public void doDebit(int _amount)
	{
		//Modifying the data
		balance = balance - _amount;
	}
	
	public void doCredit(int _amount)
	{
		if(_amount > 0) 
		{
		//Modifying the data
		balance = balance + _amount;
		}
	}
	
	public int getBalance()
	{
		return balance;
	}

}
