package com.kodewala.exception;

public class Driver1
{

	public static void main(String[] args)
	{
		System.out.println("Driver.main() START");
		
		Driver1 driver1 = new Driver1();
		driver1.doSomething();
		
		System.out.println("Driver.main() END");
	}
	
	public void doSomething()
	{
		System.out.println("Driver.doSomething() START");
		String name = null;
		int amount = 100;
		
		try
		{
		// Risky code --> code which may throw an exception.
		amount = amount/0;
		System.out.println(name.length()); // NPE --> not handled
		System.out.println("After length()");
		}
		catch (NullPointerException | ArithmeticException e)// This can catch Exception's Object and its child objects
		
		{
			System.out.println("Name is null...........");
			e.printStackTrace();		
		}
		
		System.out.println("Driver.doSomething() END");
	}

}
