package com.kodewala.objects;

public class Users
{
	String userName;
	String userId;
	String mobileNumber;
	
	static
	{
		System.out.println("I am in static init block");
	}

	public Users(String userName, String userId, String mobileNumber)
	{
		super(); //either super or this
		System.out.println("Users.Users(String userName, String userId, String mobileNumber)... Constructor");
		this.userName = userName;
		this.userId = userId;
		this.mobileNumber = mobileNumber;
	}

}
