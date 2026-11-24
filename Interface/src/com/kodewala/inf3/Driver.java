package com.kodewala.inf3;

public class Driver
{

	public static void main(String[] args)
	{
		IAccount account = (name, add, amt) ->
		{
			System.out.println("Opening Account for... " + name);
			return "Account Opened";
		};
		
		String result = account.openAccount("Kodewala", "BTM Banglore", 1000);
		System.out.println(result);

	}

}
