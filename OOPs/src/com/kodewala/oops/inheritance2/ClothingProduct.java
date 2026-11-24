package com.kodewala.oops.inheritance2;

public class ClothingProduct extends Product
{
	int exchangePolicyDays;
	
	public ClothingProduct(String productName, String description, int quantity, String status, int exchangePolicyDays)
	{
		super(productName, description, quantity, status);
		
		this.exchangePolicyDays = exchangePolicyDays;
	}
	
	public void viewClothingProductDetails()
	{
		System.out.println(productName);
		System.out.println(description);
		System.out.println(quantity);
		System.out.println(status);
		
		System.out.println(exchangePolicyDays);
		
	}

}
