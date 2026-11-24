package com.kodewala.oops.polymorphism1;


class User
{
	
}

class AdminUser extends User // AdminUser is a type of User
{
	
}

class FinanceUser extends AdminUser
{
	
}

public class Driver
{

	public static void main(String[] args)
	{
		User u1 = new User();
		AdminUser au1 = new AdminUser();
		
		User au2 = new AdminUser(); // Parent class can refer child class object --> auto up-casting
		
		Object au3 = new FinanceUser();
		
		AdminUser au = (AdminUser) new User(); // Child class is referring parent class object --> down-casting
		
		System.out.println(u1 + " " + au1 + " " + au2 + " " + au3 + " " + au);
		
	}

}
