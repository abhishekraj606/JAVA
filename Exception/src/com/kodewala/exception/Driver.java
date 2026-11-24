package com.kodewala.exception;

class Account
{
	
}

public class Driver
{
	public static void main(String args[])
	{	
		System.out.println("Driver.main()... START");
		
		int amount =100;
		int part = 0;
		int total = amount/part;
		System.out.println(total);
		
		Account account = null;
		
		String address = args[0]; // reading from command line arguments
		
		System.out.println(address);
		
		String name = null; // This may be null?
		
		// name.length() --> performing operation on name and calculating the total length
		
		System.out.println(account.hashCode()); // 8
		
		System.out.println("Driver.main()... END");
	}

}
