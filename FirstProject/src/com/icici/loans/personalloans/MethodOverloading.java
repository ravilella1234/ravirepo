package com.icici.loans.personalloans;

public class MethodOverloading 
{
	
	
	/*
	 * public void m1(int i) { System.out.println(i); }
	 */

	
	/*
	 * public void m1(float i) { System.out.println(i); }
	 */
	
	/*
	 * public void m1(String str) { System.out.println(str); }
	 */
	
	
	/*
	 * public void m1(Number str) { System.out.println(str); }
	 */
	
	/*
	 * public void m1(Integer str) { System.out.println(str); }
	 */
	
	public void m1(Object str)
	{
		System.out.println(str);
	}
	
	
	
	public static void main(String[] args) 
	{
		MethodOverloading obj = new MethodOverloading();
		obj.m1(100);
		obj.m1(12.34f);
		obj.m1("ravilella");
		obj.m1(1000);
		obj.m1(23.45f);
		obj.m1("keerthan");
	}

}
