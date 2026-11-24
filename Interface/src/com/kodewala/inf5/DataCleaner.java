package com.kodewala.inf5;

public class DataCleaner
{
	public void clean(Object obj)
	{
		if(obj instanceof Cleanable)
		{
			System.out.println("Allowed to perform the data cleaning!!!");
		}
		else
		{
			System.err.println("Not allowed to perform cleaning activity!!!");
		}
	}
}
