package com.kodewala.arrays1;

public class CityArray
{

	public static void main(String[] args)
	{
		String cities[] = new String[5];

		cities[0] = "Bangalore";
		cities[1] = "Mumbai";
		cities[2] = "Delhi";
		cities[3] = "Chennai";

		for (int index = 0; index < cities.length; index++)
		{
		    System.out.println(cities[index]);
		}
	}
}
