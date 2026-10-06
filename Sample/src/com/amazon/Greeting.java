package com.amazon;

public class Greeting
{

	public static void main(String[] args)
	{
		String name = "Abhishek";
		
		Greeting.greetUser(name);
	}
	static void greetUser(String name)
	{
		System.out.println("Hello, " + name + "!");
	}

}