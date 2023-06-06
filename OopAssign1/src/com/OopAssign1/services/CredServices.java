package com.OopAssign1.services;

import com.OopAssign1.interfaces.ICredentials;
import com.OopAssign1.model.Employee;
import com.OopAssign1.main.Driver;

import java.util.Random;
import java.util.Scanner;
public class CredServices implements ICredentials {

		public String generateEmailAddress() {
		//return employee.getFirstName("Chandan")+employee.getLastName("Sarma")+"@"+department+".abc.com";;
		return null;
		} 	
		public String generatePassword() {

			final int length = 8;

			String uppWrd="ABCDEFGHIJKLMNOPQRSTWUVXYZ";
			String lwrWrd="abcdefghijklmnopqrstwevxyz";
			String  nmbrs="0123456789";
			String spcl="!@#$%^&";
			String psdwrd= uppWrd+lwrWrd+nmbrs+spcl;
			Random randomPassword = new Random();
			String password="";
			String uppChar =String.valueOf(uppWrd.charAt(randomPassword.nextInt(uppWrd.length())));
			String lowerChar = String.valueOf(lwrWrd.charAt(randomPassword.nextInt(lwrWrd.length())));
			String numChar = String.valueOf(nmbrs.charAt(randomPassword.nextInt(nmbrs.length())));
			String spclChar = String.valueOf(spcl.charAt(randomPassword.nextInt(spcl.length())));
			for(int j=0;j<=length;j++) {
				password +=String.valueOf(uppWrd.charAt(randomPassword.nextInt(uppWrd.length()))); 

			}


			return password+uppChar+lowerChar+numChar+spclChar;
		}
		public void showCredential(Employee employee)
		{
			//return null;
		}
		public String generateCredetails(Employee employee, String department) {
			return null;
		}
		@Override
		public void showCredentials(Employee emp) {
			// TODO Auto-generated method stub
			System.out.println("Wellcome to The Organization:");
			emp.displayEmpName();
			
		}
		
	
/*my issue is with the employee as how to dynamically pass employee data into selected department 
 * and generate the email & Password accordingly
*/
	}
