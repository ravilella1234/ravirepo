package com.icici.loans.carloans;

public class ChildClass extends FirstAbstarct
{

	public static void main(String[] args) 
	{
		ChildClass c=new ChildClass();
		c.m1();
		c.m2();

	}
	
	
	public void m1()
	{
		System.out.println("Iam m1 overriden method in class Child class");
	}

	
	public void m2() 
	{
		System.out.println("iam overriden m2 from ChildClass");
	}

}
