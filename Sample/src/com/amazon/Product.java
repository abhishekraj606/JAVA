package com.amazon;

public class Product
{
	String name;
	int price;
	
	Product(String _name, int _price)
	{
		System.out.println("Inside Product constructor");
		
		this.name = _name;
		this.price = _price;
	}

}
