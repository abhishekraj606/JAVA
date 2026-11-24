package com.kodewala.strings1;
class User
{
	String firstName;
	
	public User(String firstName)
	{
		super();
		this.firstName = firstName;
	}
}



public class Driver1
{

	public static void main(String[] args)
	{
		String city1 = "Banglore"; // one object created --> abc123
		
		String city2 = "Banglore"; // use the existing --> abc123
		
		String city3 = "Banglore"; // use the existing --> abc123
		
		String city4 = "Banglore"; // use the existing --> abc123
		
		String city5 = "Banglore"; // use the existing --> abc123
		
		//System.out.println(city1 == city2);
		
		System.out.println(city1.equals(city2)); //
		System.out.println(city3 + " " + city4 + " " + city5);
		
		User user1 = new User("Kodewala");
		User user2 = new User("Kodewala");
		
		System.out.println(user1.equals(user2));
		
	}

}
