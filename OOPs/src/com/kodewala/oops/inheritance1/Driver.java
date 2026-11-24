package com.kodewala.oops.inheritance1;

class Employee
{
	String name = "Raj";
	String address = "Jaipur";
	
	private String empCode = "AR40105465";
	
	public String getEmpCode()
	{
		return empCode;
	}
	
	public void markIn(String empId)
	{
		System.out.println("Marking In"+ empId);
	}

}

class Manager extends Employee //Manager IS-A Employee
{
	public void doSomething()
	{
		System.out.println(name); //using the parent class attribute
		System.out.println(address);
		// System.out.println(empCode);  // [As the parent class's is private, so can't be fetched]
		markIn(" " + address); //using the parent class method
	}
}
