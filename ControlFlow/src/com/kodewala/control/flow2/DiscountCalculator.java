package com.kodewala.control.flow2;

public class DiscountCalculator
{
    public double calculateDiscount(String customerType, double purchaseValue)
    {
        double discountPercentage = 0;
        double discountAmount = 0;

        if(purchaseValue > 1000)
        {
            switch(customerType)
            {
            case "Gold":
                discountPercentage = 20;
                break;

            case "Silver":
                discountPercentage = 10;
                break;

            case "Regular":
                discountPercentage = 5;
                break;

            default:
                System.out.println("Unknown customer type");
                return 0;
            }

            discountAmount = purchaseValue * discountPercentage / 100;

            if(discountAmount > 2500)
            {
                discountAmount = 2500;
            }
        }

        return discountAmount;
    }
}