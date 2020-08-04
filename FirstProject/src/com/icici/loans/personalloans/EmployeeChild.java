package com.icici.loans.personalloans;

public class EmployeeChild extends Employee
{
	String address;

	public EmployeeChild(String address) 
	{
		super(1746,"ravilella",12.34f);
		this.address = address;
		System.out.println(this.address);
	}
	
	void m1()
	{
		
	}
	
	public static void main(String[] args) 
	{
		EmployeeChild ec = new EmployeeChild("hyderabad");
		
	}
	

}
