package com.amazon;

public class CalculateTotal
{
	public static void main(String args[])
	{
		int price = 500;
		int quantity = 3;
		
		int total = CalculateTotal.calculateTotal(price, quantity);
		
		System.out.println("Total Calculation: " + total);
	}
	
	static int calculateTotal(int price, int quantity)
	{
		int total = price * quantity;
		
		return total;
		
	}

}