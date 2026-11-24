package com.kodewala.inf3;


@FunctionalInterface
public interface IAccount
{
	
	String openAccount(String name, String address, int balance); // Only one abstract method - SAM
	

}
