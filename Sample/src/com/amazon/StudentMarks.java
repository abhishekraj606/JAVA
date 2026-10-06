package com.amazon;

import java.util.Scanner;

public class StudentMarks {

	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter marks: ");
		
		int marks = scanner.nextInt();
		
		boolean message = (marks >= 40);
		
		System.out.println("Passed: " + message);

	}

}