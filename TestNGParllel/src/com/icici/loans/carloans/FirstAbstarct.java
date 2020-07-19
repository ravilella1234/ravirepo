package com.icici.loans.carloans;

public abstract class FirstAbstarct 
{
	
	public void m1()
	{
		System.out.println("Iam m1 concrete method in class FirstAbstarct");
	}
	
	public abstract void m2();
	
	
	public static void main(String[] args) 
	{
		FirstAbstarct f=new ChildClass();
		f.m1();
		f.m2();
	}

}
