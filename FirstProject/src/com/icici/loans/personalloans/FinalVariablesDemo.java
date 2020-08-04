package com.icici.loans.personalloans;

public class FinalVariablesDemo 
{
	public final int x=10;
	public final static int y=20;
	
	public static void main(String[] args) 
	{
		final int z=30;
		FinalVariablesDemo obj = new FinalVariablesDemo();
		System.out.println(obj.x);
		obj.x=100;
		System.out.println(obj.x);
		
		System.out.println(y);
		y=200;
		System.out.println(y);
		
		System.out.println(z);
		z=300;
		System.out.println(z);
	}

}
