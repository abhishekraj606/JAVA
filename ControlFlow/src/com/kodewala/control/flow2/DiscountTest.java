package com.kodewala.control.flow2;

public class DiscountTest
{
    public static void main(String[] args)
    {
        DiscountCalculator discountCalculator = new DiscountCalculator();

        String customerType = args[0];
        double purchaseValue = Double.parseDouble(args[1]);

        double discount = discountCalculator.calculateDiscount(customerType, purchaseValue);

        System.out.println("Discount amount is: " + discount);
    }
}