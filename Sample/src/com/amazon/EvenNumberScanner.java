package com.amazon;

import java.util.Scanner;

public class EvenNumberScanner
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		
		int number = scanner.nextInt();
		
		boolean result = EvenNumberScanner.isEven(number);
		
		System.out.println("Number: " + number);
		System.out.println("Even: " + result);
		
		scanner.close();
	}
	
	static boolean isEven(int number)
	{
		return number % 2 == 0;
	}
}
