package com.kodewala.inf1;

public interface iDiscount
{
	public static final int MAX_VALUE = 100;
	
	public abstract int calculateDiscount(int amount, int rate);
	
	public abstract void calculateDiscountTax(int tax);

}