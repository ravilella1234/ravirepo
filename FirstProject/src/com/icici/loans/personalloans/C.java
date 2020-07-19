package com.icici.loans.personalloans;

import com.icici.loans.homeloans.A;

public class C extends A
{
	
	public void m3()
	{
		System.out.println("iam m3 from Class C");
	}
	
	
	public static void main(String[] args) {
		C c  = new C();
		c.m3();
		c.m1();
	}

}
