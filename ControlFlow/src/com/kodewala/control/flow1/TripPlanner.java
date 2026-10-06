package com.kodewala.control.flow1;

public class TripPlanner
{
	public String suggestPlan(String src, String dest, int budget)
	{
		String suggestion = null;
		
		if(budget <= 1000)
		{
			suggestion = "You can be in home only!!!";
			System.out.println(suggestion);
		}
		else if(budget > 1000 && budget <=3000)
		{
			suggestion = "You can visit within city like Lal Bagh etc...." + "or you can watch movie.";
			System.out.println(suggestion);
		}
		else if(budget > 3000 && budget <=5000)
		{
			suggestion = "You can hire taxi and visit nearby places like mysore etc...";
			System.out.println(suggestion);
		}
		else
		{
			suggestion = "You can visit Goa!";
			System.out.println(suggestion);
		}
		return suggestion;
	}

}
