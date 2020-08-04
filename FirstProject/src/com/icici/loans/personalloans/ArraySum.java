package com.icici.loans.personalloans;

import java.util.Scanner;

public class ArraySum 
{
	
	public int m1()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size : ");
		int asize = sc.nextInt();
		int [] a = new int[asize];
		int sum=0;
			
		System.out.println("Enter the Array Elements :");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			System.out.println("a["+i+"]=" + a[i]);
			sum = sum+a[i];
		}
		System.out.println("sum of array is : " + sum);
		return sum;
	}

	public static void main(String[] args) 
	{
		ArraySum obj =  new ArraySum();
		int count = obj.m1();
		System.out.println("count of array from outside is : "+ count);
	}

}
