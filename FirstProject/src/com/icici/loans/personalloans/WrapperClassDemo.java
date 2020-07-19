package com.icici.loans.personalloans;

import java.util.ArrayList;

public class WrapperClassDemo 
{

	public static void main(String[] args) 
	{
		//Boxing Process using Constructors
		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer("123");
		
		System.out.println(obj1);
		System.out.println(obj2);
		
		//Boxing process using valueOf method
		Integer obj3 = Integer.valueOf(1000);
		Integer obj4 = Integer.valueOf("1234");
		
		System.out.println(obj3);
		System.out.println(obj4);
		
		ArrayList<Float> a  = new ArrayList<>();

	}

}
