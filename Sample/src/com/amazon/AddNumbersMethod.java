package com.amazon;

public class AddNumbersMethod 
{

	public static void main(String[] args) 
	{
		int firstNumber = 10;
		int secondNumber = 20;
		
		int result = AddNumbersMethod.addTwoNumbers(firstNumber, secondNumber);
		
		System.out.println("Sum: " + result);

	}
	
	static int addTwoNumbers(int firstNumber, int secondNumber)
	{
			int sum = firstNumber + secondNumber;
			
			return sum;
	}

}
