package com.kodewala.oops.polymorphism3;

public class PaymentProcessor
{
	public void processPayment(Payment payment) // can accept any type of Payment object
	{
		payment.doPayment(); // Polymorphism
	}

}
