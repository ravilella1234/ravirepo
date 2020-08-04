package com.icici.loans.homeloans;

import com.icici.loans.personalloans.C;

public class B extends A
{
		
	public void m1()
	{
		System.out.println("iam overriden m1 from Class B");
	}
	
	public void m2()
	{
		System.out.println("iam m2 from Class B");
	}
	
	public static void main(String[] args) 
	{
		
		A a =new A(); // HASA Relationship
		a.m1();
		System.out.println(a.x);
				
		 B b = new B();
		 b.m2();
		 b.m1();
		 System.out.println(b.x);
	}
	
	
}
