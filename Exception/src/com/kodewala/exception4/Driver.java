package com.kodewala.exception4;

public class Driver
{

	public static void main(String[] args)
	{
		String name = "Kodewala";
		System.out.println(name.length());
		
		String className = "com.kodewala.exception4.Driver";
		try
		{			
			Class.forName(className); // loading the class into memory
			System.out.println("class loaded......");
		}
		
		catch (ClassNotFoundException e)
	    {
	    	e.printStackTrace();

	    }
	}
}
