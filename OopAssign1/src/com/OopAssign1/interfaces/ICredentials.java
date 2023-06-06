package com.OopAssign1.interfaces;

import com.OopAssign1.model.Employee;

public interface ICredentials {
	public String generateCredetails(Employee employee, String department);
	public String generatePassword();
	public void showCredentials();
	void showCredentials(Employee emp);

}
