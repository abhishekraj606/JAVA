package com.kodewala.control.flow;

public class MakeMyTripDiscount
{

	public static void main(String[] args)
	{
		int fare = 12000;
		
		DiscountCalculator calculator = new DiscountCalculator();
		
		int discount = calculator.calculateDiscount(fare);
		
		int finalFare = fare - discount;
		
		System.out.println("Total Fare: " + fare);
        System.out.println("Discount: " + discount);
        System.out.println("Final Fare: " + finalFare);

	}

}
