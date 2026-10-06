package com.amazon;

public class AgeCategory 
{

	public static void main(String[] args) 
	{
		int age = 65;
		
		boolean message = (age < 18 || age > 60);
		
		System.out.println("Age: " + age);
		
		System.out.println("Does the person comes under age catogarised:" + message);

	}

}
