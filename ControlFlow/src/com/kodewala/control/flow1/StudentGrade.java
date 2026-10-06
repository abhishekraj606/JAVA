package com.kodewala.control.flow1;

public class StudentGrade
{

	public static void main(String[] args)
	{
		int marks = 25;
		
		if (marks >= 80) 
		{
			System.out.println("Grade A");
		}
		else if (marks >= 60)
		{
			System.out.println("Grade B");
		}
		else if (marks >= 40)
		{
			System.out.println("Grade C");
		}
		else 
		{
			System.out.println("Fail");
		}

	}

}
