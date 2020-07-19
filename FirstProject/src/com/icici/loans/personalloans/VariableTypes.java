package com.icici.loans.personalloans;

public class VariableTypes 
{
	//primitive Variable
	int x=100; // instance (or) global (or) non-static Variable
	static String cname ="vmware";  // static (or) global Variable
	 static VariableTypes obj;

	void m1()
	{
		int x=200; // local variable
		System.out.println(this.x);
		System.out.println(VariableTypes.cname);
	}
	
	public static void m2()
	{
		 obj = new VariableTypes();
		System.out.println(obj.x);
		System.out.println(VariableTypes.cname);
	}
	
	public static void main(String[] args) 
	{
		 obj = new VariableTypes();  // reference variable
		System.out.println(obj.x);
		System.out.println(VariableTypes.cname);
	}

}
