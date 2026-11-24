package com.kodewala.exception5;

public class AccountMgmt
{
	void openAccount()
	{
		System.out.println("AccountMgmt.openAccount() START");
		
		activeAccount("2345654623");
		
		System.out.println("AccountMgmt.openAccount() END");
	}
	
	private void activeAccount(String accNo)
	{
		System.out.println("AccountMgmt.activeAccount() START");
		try
		{
			checkAccountStatus(null);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("AccountMgmt.activeAccount() END");
	}
	
	private boolean checkAccountStatus(String accNo) throws Exception
	{
		try
		{
			accNo.startsWith("SBI"); // NPE --> Risky code
		}
		catch (NullPointerException e)
		{
			// throw --> create new exception object and throw it to the caller
			throw new Exception("Account number is not starting with SBI");
		}
		
		return false;
	}

}
