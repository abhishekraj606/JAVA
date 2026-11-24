package com.amazon;

import java.util.Scanner;

public class StudentName {
	

	public static void main(String[] args) {
		
       Scanner scanner = new Scanner(System.in);
		
	   System.out.print("Enter Name: ");
		
	   String name = scanner.nextLine();
		
	   System.out.println("Hello!!! How are you, " + name);
		
	   scanner.close();

	}

}
