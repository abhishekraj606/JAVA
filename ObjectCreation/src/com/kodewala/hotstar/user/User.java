package com.kodewala.hotstar.user;

public class User
{
	String userID;
	String userName;
	String type;
	public static int LiveUserCount = 0;
	
	public User(String userID, String userName, String type)
	{
		super();
		this.userID = userID;
		this.userName = userName;
		this.type = type;
		LiveUserCount++;
		
	}
	public User(String userName, String type)
	{
		
		this.userName = userName;
		this.type = type;
		LiveUserCount++;
	}
	public User() 
	{
		LiveUserCount++;
	}
	public void displayUserDetails() {
		System.out.println("User ID: " + userID);
        System.out.println("User Name: " + userName);
        System.out.println("Type: " + type);
        System.out.println("-------------------");
	}
}
