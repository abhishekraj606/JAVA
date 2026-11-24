package com.tcs.emp;

public class Driver
{

	public static void main(String[] args) throws CloneNotSupportedException
	{
		Address address = new Address("16th Main", "27th Cross", "Banglore");
		
		Employee emp1 = new Employee("Kodewala", "KW123", address);
		
		Employee clonedEmp = (Employee) emp1.clone();
		
		emp1.address.city = "KOL";
		
		System.out.println(emp1.address.city);
		System.out.println(clonedEmp.address.city);
	}

}
