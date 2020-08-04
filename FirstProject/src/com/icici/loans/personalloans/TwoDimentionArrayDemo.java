package com.icici.loans.personalloans;

public class TwoDimentionArrayDemo 
{

	public static void main(String[] args) 
	{
		//int x[] = {1,2,3};
		
		int x[][] = {
						{1,2,3,4},
						{4,5,6},
						{7,8,9,10,11}
					};
		
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
			{
				System.out.print(x[i][j] + "  ");
			}
			System.out.println("");
		}
		
		
		for(int k[] : x)
		{
			for(int l : k)
			{
				System.out.print(l + " ");
			}
			System.out.println("");
		}

	}

}
