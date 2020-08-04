package com.icici.loans.homeloans;

public class StringDemo 
{

	public static void main(String[] args) 
	{
		String s1 = "ravikanth";
		System.out.println(s1);
		System.out.println(s1.length());
		System.out.println(s1.hashCode());
		System.out.println(s1.isEmpty());
		System.out.println(s1.charAt(2));
		System.out.println(s1.indexOf('v'));
		System.out.println(s1.startsWith("avi"));
		System.out.println(s1.endsWith("ant"));
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		
		String s2 = new String("Ravikant");
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.contains(s2));
		System.out.println(s1.contains(s2.toLowerCase()));
		
		System.out.println(s1+s2);
		System.out.println(s1.concat(s2));
		
		for(int i=0;i<s1.length();i++)
		{
			System.out.println(s1.charAt(i));
		}
		
		System.out.println(s1.replace('r', 'k'));
		System.out.println(s1.substring(1, 7));
		
		String s3 = "ravikanth Lella";
		String[] s = s3.split(" ");
		System.out.println(s[0]);
		System.out.println(s[1]);
		
		for(String j : s)
		{
			System.out.println(j);
		}
		
		String s4 = " ravikanth";
		System.out.println(s4);
		System.out.println(s4.trim());
		
		System.out.println(s1.equals(s4));
		System.out.println(s1.equals(s4.trim()));
		
	}

}
