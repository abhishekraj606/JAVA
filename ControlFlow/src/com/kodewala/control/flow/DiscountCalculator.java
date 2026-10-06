package com.kodewala.control.flow;

public class DiscountCalculator
{
    public int calculateDiscount(int fare)
    {
        int discount = 0;

        if (fare <= 5000)
        {
            discount = 0;
        }
        else if (fare <= 10000)
        {
            discount = fare * 10 / 100;
        }
        else
        {
            discount = fare * 15 / 100;
        }

        if (discount > 1250)
        {
            discount = 1250;
        }

        return discount;
    }
}