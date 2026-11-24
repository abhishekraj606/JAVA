package com.kodewala.arrays1;

public class Driver2
{

	public static void main(String[] args)
	{
		Order order1 = new Order("iPhone","75454151");
		Order order2 = new Order("Samsung","85454151");
		Order order3 = new Order("Realme","65454151");
		Order order4 = new Order("Redmi","55454151");
		
		Order orders[] = new Order[4];
		
		orders[0] = order1;
		orders[1] = order2;
		orders[2] = order3;
		orders[3] = order4;

	}

}
