package com.icici.loans.homeloans;

public class StringDemo1 
{

	public static void main(String[] args) 
	{
		StringBuffer s1 = new StringBuffer("ravikanth");
		System.out.println(s1);
		System.out.println(s1.hashCode());
		
		StringBuffer s2 = new StringBuffer("lella");
		System.out.println(s2);
		System.out.println(s2.hashCode());
		
		s1=s1.append(s2);
		System.out.println(s1);
		System.out.println(s1.hashCode());
		
		System.out.println("----------------------------------------------");
		
		//StringBuffer s2 = new StringBuffer("lella");
		//System.out.println(s2);
		
		
		String e1 = new String("ravikanth");
		System.out.println(e1);
		System.out.println(e1.hashCode());
		
		String e2 = new String("lella");
		System.out.println(e2);
		System.out.println(e2.hashCode());
		
		e1= e1+e2;
		System.out.println(e1);
		System.out.println(e1.hashCode());
		
	}

}
