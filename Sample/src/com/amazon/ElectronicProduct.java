package com.amazon;

public class ElectronicProduct extends Product
{
	int warranty;
	
	ElectronicProduct(String _name, int _price, int _warranty)
	{
		super(_name, _price);
		this.warranty = _warranty;
		
		System.out.println("Inside ElectronicProduct constructor");
	}
	public static void main(String args[])
	{
		ElectronicProduct product = new ElectronicProduct("Iphone", 180000, 2);
		
		System.out.println(product.name);
		System.out.println(product.price);
		System.out.println(product.warranty);
	}

}