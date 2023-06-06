package com.OopAssign1.main;
import java.util.InputMismatchException;
import java.util.Scanner;
import com.OopAssign1.model.Employee;
import com.OopAssign1.services.CredServices;
public class Driver {
	String department;
	int deptName;
	static Scanner sca;
	
	public static void main(String args[]) {
		System.out.println("Wellcome to First Assigment");
		Driver dev = new Driver();
		dev.displayDepartment();
		
		Employee e = new Employee("Chas","sarma");
	    CredServices credServices = new CredServices();
	    ///NOTES: When I try Call the employee class it generate error
		//String EmailAddress = credServices.generateEmailAddress(e, "technical") ;
	//	System.out.println("Email Address: "+EmailAddress);
	}
	public void displayDepartment() {
		try (Scanner sca = new Scanner(System.in)) {
			System.out.println("Select Department Name by Pressing 1:Technical, 2:Admin, 3: Human Resource, 4:Legal");
			deptName=sca.nextInt();
			if (deptName==1) {
				System.out.println("Technical");
			}
			else if (deptName==2) {
				System.out.println("Admin");
			}
			else if (deptName==3) {
				System.out.println("Human Resource");
			}
			else if (deptName==4) {
				System.out.println("Legal");
			}
			else
			{
				System.out.println("Invalid Selection");
			}
		}
		//exception has been done to handle integer error 
		catch(InputMismatchException exception)
		{
			System.out.println("ERROR: Integer Only Please");
		}
		
	}
}
