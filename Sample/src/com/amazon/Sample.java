package com.amazon;

import java.util.Scanner;

public class Sample {
	public static void main(String args[]) {
		System.out.println("Hello' Welcome to Eclipse IDE!!!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Your name: ");
		String name = sc.nextLine();
		System.out.println("Hello!!" + name);
		sc.close();
	}

}