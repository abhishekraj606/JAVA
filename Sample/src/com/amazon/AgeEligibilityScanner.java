package com.amazon;

import java.util.Scanner;

public class AgeEligibilityScanner {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your age: ");
		
		int age = scanner.nextInt();
		
		boolean message = (age >= 18);
		
		System.out.println("Eligible: " + message);

	}

}