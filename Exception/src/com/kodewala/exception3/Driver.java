package com.kodewala.exception3;

public class Driver
{

	public static void main(String[] args)
	{
		Driver driver = new Driver();
		int result = driver.calcDiscount(100, 10);
		System.out.println(result);

	}
	
	private int calcDiscount(int amount, int disc)
	{
		int finalAmt = 0;
		try 
		{
			finalAmt = amount - (amount * disc / 100); // risky?
			return finalAmt;
		}
		catch (Exception e)
		{
			System.out.println("Some exception....");
			e.printStackTrace();
		}
		finally
		{
		}
		finalAmt = 110;
		return finalAmt;
	}

}
