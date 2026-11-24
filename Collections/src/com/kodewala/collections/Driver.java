package com.kodewala.collections;

public class Driver
{

	public static void main(String[] args)
	{
		int products[] = new int[100];
		// store the price --> container(box) which holds integer value
		
		int price[] = {200, 5000, 100, 200, 300, 500, 23456, 5600}; // Memory --> Heap --> Dtore to Database(JDBC)
		
		// process --> find the price value above 1000
		
		for(int index=0; index < price.length; index++)
		{
			int currentPrice = price[index];
			// System.out.println("CurrentPrice is: " + currentPrice);
			
			if(currentPrice > 1000)
			{
				System.out.println(currentPrice);
			}
		}
				
	}

}
