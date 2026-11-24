package com.kodewala.strings2;

public class Driver
{

	public static void main(String[] args)
	{
		String s1 = "Kodewala"; // SCP

		String s2 = new String("Academy"); // one object in scp + one in heap

		System.out.println(s1 == s2); // 123wdw == 475wvvr --> false

		String s3 = new String("Kodewala");
		String s4 = new String("Kodewala");

		System.out.println(s4 == s3);

		System.out.println(s4.equals(s3));
	}

}