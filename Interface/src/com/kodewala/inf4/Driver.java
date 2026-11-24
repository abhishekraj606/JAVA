package com.kodewala.inf4;

public class Driver
{

	public static void main(String[] args) throws CloneNotSupportedException
	{
		Account acc = new Account("Kodewala Academy", "BTM Banglore", "784546464541");
		
		Account cloneObjectofAcc = (Account) acc.clone(); // trying to clone (xerox/copy)
		
		System.out.println(cloneObjectofAcc.address);
		
		if(acc instanceof Cloneable)
		{
			System.out.println("true..... allowed to perform the activity");
		}
		else
		{
			System.out.println("false");
		}

	}

}
