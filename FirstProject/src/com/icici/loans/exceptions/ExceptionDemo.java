package com.icici.loans.exceptions;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class ExceptionDemo 
{

	public static void main(String[] args) 
	{
		int nr,dr,result;
		
		Scanner sc = new Scanner(System.in);
		
		 
		while(true) 
		{
			System.out.println("Enter the numarator value : ");
			nr = sc.nextInt();
			System.out.println("Enter the Denomiator value : ");
			dr = sc.nextInt();
			
			try 
			{
				result = nr / dr;
				System.out.println(result);
				break;
			} 
			catch (Exception e) 
			{
				//e.printStackTrace();
				//System.out.println(e);
				System.out.println("denominator value should be greater than zero....");
			}	
		}
	}

}
