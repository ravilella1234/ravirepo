package com.icici.loans.personalloans;


class Parent
{
	public Number workHard()
	{
		System.out.println("Parent : Wakeup early, Goto college....");
		return 0;
	}
	
	void care()
	{
		System.out.println("Parent : atmost care on kids.....");
	}
}


public class Child extends Parent
{
	
	public strictfp Object workHard()
	{
		System.out.println("Child : Wakeup anytime, Goto bar/parlour....");
		return 0;
	}
	
	void love()
	{
		System.out.println("Child : iam in love .....");
	}
	
	public static void main(String[] args) 
	{
		Child c = new Child();
		c.workHard();
		c.care();
		c.love();
	}
}
