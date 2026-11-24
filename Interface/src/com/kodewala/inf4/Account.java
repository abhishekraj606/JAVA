package com.kodewala.inf4;

public class Account implements Cloneable //giving permission so that object of this class can be copied/cloned
{
	String name;
	String address;
	String accno;
	public Account(String name, String address, String accno)
	{
		super();
		this.name = name;
		this.address = address;
		this.accno = accno;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	
	
}
