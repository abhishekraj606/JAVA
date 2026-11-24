package com.kodewala.oops.polymorphism2;

class Employee
{
	public void markIn()
	{
		System.out.println("Employee.markIn()............ Employee Marking In");
	}
}

class HRManager extends Employee
{
	@Override
	public void markIn()
	{
		System.out.println("HRManager.markIn()............ HR Manager Marking In");
	}
	
	@Override
	public int hashCode()
	{
		return 543213456;
	}
	
}


public class Driver
{

	public static void main(String[] args)
	{
		/*
		 * Employee e1 = new Employee(); e1.markIn();
		 */
		
		Employee e2 = new HRManager(); //Parent class can refer child class object.
		
		e2.markIn(); // Same method will behave differently based on the actual object.
		System.out.println(e2.hashCode());
		// 1. At the time of compilation, it will check the method's existence in class Employee
		// 2. At the time of execution (while running), it will call the method on actual object.

	}

}
