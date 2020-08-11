package com.icici.loans.collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo 
{

	public static void main(String[] args) 
	{
		ArrayList<String> a  = new ArrayList<String>();
		a.add("kosmik");
		a.add("oracle");
		a.add("vmware");
		a.add("MindQ");
		
		System.out.println(a);
				
		ListIterator<String> val = a.listIterator();
		while(val.hasNext())
		{
			String var = val.next();
			if(var.equals("kosmik"))
				val.set("global tech");
			else
				val.remove();
		}
		
		System.out.println(a);

	}

}
