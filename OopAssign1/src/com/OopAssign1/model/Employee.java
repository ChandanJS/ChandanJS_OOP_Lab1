package com.OopAssign1.model;

import java.util.Scanner;
public class Employee {
	// little confusion over here how to dynamically enter thing into parameterized constructor
	private static String firstName;
	private static String lastName;
	
	public Employee(String fisrtName, String LastName){
		this.firstName=firstName;
		this.lastName =lastName;
		
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	
	}

	public void getFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void getLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The First Name");
		firstName =sc.nextLine();
		System.out.println("Enter Last Name");
		lastName =sc.nextLine();
	
		Employee emp=new Employee(firstName, firstName);
		emp.displayEmpName();
		
	}
	public void  displayEmpName() {
		System.out.println("Employee Name :::"+firstName +" "+lastName);
	}
}

