package com.amazon;

public class EvenNumber
	{
		public static void main(String args[])
		{
				int number = 47;
				
				boolean result = EvenNumber.isEven(number);
				
				System.out.println("Number: " + number);
				System.out.println("Even: " + result);
		}
		
		static boolean isEven(int number)
		{
				return number % 2 == 0;
		}
	}
