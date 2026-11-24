package com.kodewala.inf1;

public class BusBooking implements iDiscount
{
	@Override
	public int calculateDiscount(int amount, int rate)
	{
		return amount;
	}
	
	@Override
	public void calculateDiscountTax(int tax)
	{
		
	}

}
