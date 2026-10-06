package com.kodewala.arrays1;

public class UserArray
{

	public static void main(String[] args)
	{
		User users[] = new User[5];
		
		users[0] = new User("Abhishek");
		users[1] = new User("Rahul");
		users[2] = new User("Priya");
		users[3] = new User("Amit");
		users[4] = new User("Neha");	
		
		for (int i = 0; i < users.length; i++)
		{
		    System.out.println(users[i].name);
		}

	}

}
