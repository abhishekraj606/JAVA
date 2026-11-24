package com.kodewala.collections;

import java.util.ArrayList;

public class ArrayListExp1
{
	public static void main(String args[])
	{
		// create a container which will hold something(objects)
		
		ArrayList<String> learners = new ArrayList<String>();
		
		learners.add("Gautam");
		learners.add("Prince");
		learners.add("Aman");
		learners.add("Rohit");
		learners.add("Gautam");
		learners.add("Aman");
		learners.add(null);
		learners.add(null);
		
		System.out.println(learners);
		
	}

}
