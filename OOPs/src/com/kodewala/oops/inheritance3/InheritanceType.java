package com.kodewala.oops.inheritance3;

//Single Inheritance
class BankAccount
{
 String accountHolder;

 void displayAccountHolder()
 {
     System.out.println("Account Holder: " + accountHolder);
 }
}

class SavingsAccount extends BankAccount
{
 double interestRate;

 void displayInterestRate()
 {
     System.out.println("Interest Rate: " + interestRate + "%");
 }
}



//Multilevel Inheritance
class Employee
{
 String name;

 void displayName()
 {
     System.out.println("Employee Name: " + name);
 }
}

class Manager extends Employee
{
 String teamName;

 void displayTeam()
 {
     System.out.println("Team: " + teamName);
 }
}

class SeniorManager extends Manager
{
 String department;

 void displayDepartment()
 {
     System.out.println("Department: " + department);
 }
}



//Hierarchical Inheritance
class Product
{
 String productName;
 double price;

 void displayProduct()
 {
     System.out.println("Product: " + productName);
     System.out.println("Price: " + price);
 }
}

class Electronics extends Product
{
 int warrantyYears;

 void displayWarranty()
 {
     System.out.println("Warranty: " + warrantyYears + " years");
 }
}

class Clothing extends Product
{
 String size;

 void displaySize()
 {
     System.out.println("Size: " + size);
 }
}