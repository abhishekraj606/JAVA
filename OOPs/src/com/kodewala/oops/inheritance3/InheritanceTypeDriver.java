package com.kodewala.oops.inheritance3;

public class InheritanceTypeDriver
{
    public static void main(String[] args)
    {
    	
        // Single Inheritance
        System.out.println("=== Single Inheritance ===");

        SavingsAccount account = new SavingsAccount();
        account.accountHolder = "Abhishek";
        account.interestRate = 4.5;

        account.displayAccountHolder();
        account.displayInterestRate();
        

        // Multilevel Inheritance
        System.out.println("\n=== Multilevel Inheritance ===");

        SeniorManager manager = new SeniorManager();
        manager.name = "Rahul";
        manager.teamName = "Backend Development";
        manager.department = "Technology";

        manager.displayName();
        manager.displayTeam();
        manager.displayDepartment();
        

        // Hierarchical Inheritance
        System.out.println("\n=== Hierarchical Inheritance ===");

        Electronics laptop = new Electronics();
        laptop.productName = "Laptop";
        laptop.price = 55000;
        laptop.warrantyYears = 2;

        Clothing shirt = new Clothing();
        shirt.productName = "Shirt";
        shirt.price = 1200;
        shirt.size = "L";

        laptop.displayProduct();
        laptop.displayWarranty();

        System.out.println();

        shirt.displayProduct();
        shirt.displaySize();
    }
}