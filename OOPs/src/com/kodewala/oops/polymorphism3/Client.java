package com.kodewala.oops.polymorphism3;

public class Client
{

	public static void main(String[] args)
	{
		PaymentProcessor paymentProcessor = new PaymentProcessor();
		
		CreditCardPayment cardPayment = new CreditCardPayment();
		
		NetBankingPayment netPayment = new NetBankingPayment();
		
		UpiPayment upiPayment = new UpiPayment();
		
		paymentProcessor.processPayment(cardPayment);
		paymentProcessor.processPayment(netPayment);
		paymentProcessor.processPayment(upiPayment);

	}

}
