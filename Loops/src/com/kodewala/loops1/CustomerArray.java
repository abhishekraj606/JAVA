package com.kodewala.loops1;

public class CustomerArray
{

	public static void main(String[] args)
	{
		Customer customers[] = new Customer[5];
		
		customers[0] = new Customer("Abhishek", 1500);
		customers[1] = new Customer("Rahul", 3500);
		customers[2] = new Customer("Priya", 1200);
		customers[3] = new Customer("Amit", 5000);
		customers[4] = new Customer("Neha", 1800);
		
		for (int i = 0; i < customers.length; i++)
		{
			if (customers[i].balance < 2000)
			{
				System.out.println(customers[i].name + " : " + customers[i].balance);
			}
		    
		}

	}

}
