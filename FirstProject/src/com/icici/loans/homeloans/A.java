package com.icici.loans.homeloans;

import java.util.Date;

public class A 
{
	public int x=100;
	
	public  void m1()
	{
		System.out.println("iam m1 from Class A");
	}
	
	public static void m4()
	{
		System.out.println("iam static m4...");
	}
	
	static
	{
		System.out.println("iam static block....");
	}
	
	static
	{
		Date dt = new Date();
		System.out.println(dt);
	}
	
	public static void main(String[] args) 
	{
		
		 A a  = new A();
		 a.m1();
		 System.out.println(a.x);
		 
		 A.m4();
	}

}
