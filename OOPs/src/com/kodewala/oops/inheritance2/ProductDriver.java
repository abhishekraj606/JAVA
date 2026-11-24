package com.kodewala.oops.inheritance2;

public class ProductDriver
{

	public static void main(String[] args)
	{
		Product product = new Product("Puma Shoes", "Premium shoes", 250, "In-Stock");
		
		product.viewProductDetails();
		
		ClothingProduct clothingProduct = new ClothingProduct("Puma Shoes", "Premium shoes", 250, "In-Stock", 7);
		
		clothingProduct.viewClothingProductDetails();

	}

}
