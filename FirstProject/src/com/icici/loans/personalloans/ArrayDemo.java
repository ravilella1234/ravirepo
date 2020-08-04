package com.icici.loans.personalloans;

public class ArrayDemo 
{

	public static void main(String[] args) 
	{
		/*
		 * int[] a = {10,20,30,40};
		 * 
		 * for(int i=0;i<a.length;i++) { System.out.println("a["+i+"]=" + a[i]); }
		 */
		
		int[] a = new int[8];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		a[5]=60;
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println("a["+i+"]="+a[i]);
		}
		
		for(int i : a)
		{
			System.out.println(i);
		}
		
	}

}
