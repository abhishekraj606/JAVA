package com.kodewala.loops1;

public class Accounts
{

	public static void main(String[] args) 
	{

		BankDetails b1 = new BankDetails("Rahul", 1500, "987654321");
		BankDetails b2 = new BankDetails("Amit", 5000, "9876543211");
		BankDetails b3 = new BankDetails("Priya", 1800, "9876543212");
		BankDetails b4 = new BankDetails("Neha", 3500, "9876543213");
		BankDetails b5 = new BankDetails("Ravi", 1200, "9876543214");

		BankDetails[] customers = {b1, b2, b3, b4, b5};

        System.out.println("Customers whose balance is less than 2000: ");
        System.out.println("----------------------");
        System.out.println("----------------------");

        for (int i = 0; i < customers.length; i++) 
        {

            if (customers[i].accountBalance < 2000) 
            {

                System.out.println("Customer Name: " + customers[i].customerName);

                System.out.println("Account Balance: "+ customers[i].accountBalance);

                System.out.println("----------------------");
                
            }
        }
    }
}