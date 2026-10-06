package com.kodewala.control.flow;

/**
 * * This class is responsible for accepting booking from user.
 */
public class Booking
{
	// More than 6 pax per PNR is not allowed.
	public String doBooking(String from, String to, int noOfPax)
	{
		String pnr = null;
		if(noOfPax > 6) //if true then only below code gets executed.
		{
			// Do not allow to book
			System.err.println("As per IRCTC policy, only 6 pax asre allowed for PNR");
			
		}
		else
		{
			// Confirming the booking
			pnr = "335874561";
			System.out.println("Confirming the booking: " + pnr);
			System.out.println("Status Confirmed");
			System.out.println("SEAT: 27 A2");
		}
		
		return pnr;
	}

}
