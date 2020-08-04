package com.icici.loans.personalloans;

public class Employee 
{
	int empNo;
	String empName;
	float sal;
	
	/*
	 * public Employee() { System.out.println("iam default constructor....");
	 * 
	 * System.out.println(this.empNo); System.out.println(this.empName);
	 * System.out.println(this.sal); }
	 */
	
	public Employee(int empNo) 
	{
		//this();
		this.empNo=empNo;
		
		System.out.println(this.empNo);
		System.out.println(this.empName);
		System.out.println(this.sal);
	}
	
	public Employee(int empNo, String empName) 
	{
		this(1744);
		this.empNo=empNo;
		this.empName=empName;
		
		System.out.println(this.empNo);
		System.out.println(this.empName);
		System.out.println(this.sal);
	}

	public Employee(int empNo, String empName, float sal) 
	{
		this(1745,"keerthan");
		this.empNo=empNo;
		this.empName=empName;
		this.sal=sal;
		
		System.out.println(this.empNo);
		System.out.println(this.empName);
		System.out.println(this.sal);
	}

	public static void main(String[] args) 
	{		
		Employee e4 = new Employee(1746, "ravilella",12.34f);
		
	}	
}
