package com.kodewala.objects;

public class Driver
{
	public static void main(String args[])
	{
		System.out.println("Driver class STARTS...");
		
		Users user1 = new Users("Raj", "40105465", "9155433218");
		Users user2 = new Users("Mohit", "40105468", "9155433217");
		Users user3 = new Users("Mukul", "40105469", "9155433225");
		Users user4 = new Users("Bhim", "40105463", "9155433236");
		
		System.out.println(user1.userName + " " + user2.userName + " " + user3.userName + " " + user4.userName);
		
		System.out.println("Driver class ENDS...");
	}
}
