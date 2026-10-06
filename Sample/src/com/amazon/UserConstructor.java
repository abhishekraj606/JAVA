package com.amazon;

public class UserConstructor
{
	String userId;
	String userName;
	String country;
	
	UserConstructor(String _userId, String _userName, String _country)
			{
		
		System.out.println("Inside 3-parameter constructor");
		
		this.userId = _userId;
		this.userName = _userName;
		this.country = _country;
			}
	UserConstructor()
	{
		this("user123xstr", "guest_user", "IN");
	}
		public static void main(String args[])
		{
			UserConstructor user = new UserConstructor();
			System.out.println(user.userId);
			System.out.println(user.userName);
			System.out.println(user.country);
			
			UserConstructor user2 = new UserConstructor("A101", "Abhishek", "India");
			
			System.out.println(user2.userId);
			System.out.println(user2.userName);
			System.out.println(user2.country);
		}
	
}