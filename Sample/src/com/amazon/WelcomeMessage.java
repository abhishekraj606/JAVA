package com.amazon;

public class WelcomeMessage
{

	public static void main(String[] args)
	{
		String name = "Abhishek";
		
		String welcomeMessage = WelcomeMessage.createWelcomeMessage(name);
		System.out.println(welcomeMessage);

	}
	static String createWelcomeMessage(String name)
	{
		String message = "Welcome, " + name + "!";
		
		return message;
	}

}