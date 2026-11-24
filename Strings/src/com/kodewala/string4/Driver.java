package com.kodewala.string4;

public class Driver
{

	public static void main(String[] args)
	{
		String s1 = "This " + "is Raj from " + "Kodewala Academy Banglore.";
		
		//String s1 = "This is Raj from Kodewala Academy Banglore
		
		System.out.println(s1);
		
		String s2 = "Kodewala "; //scp
		String s3 = "Academy"; //scp
		
		String s4 = s2 + s3; //heap
		
		System.out.println(s4);
		
		String s5 = "Kodewala Academy";
		
		System.out.println(s5 == s4.intern()); //true
		
		
	}

}
