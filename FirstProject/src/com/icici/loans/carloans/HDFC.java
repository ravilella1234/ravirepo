package com.icici.loans.carloans;

public class HDFC implements Rbi
{

	public static void main(String[] args) 
	{
		HDFC h = new HDFC();
		h.deposit();
		h.withdrawl();

	}

	@Override
	public void withdrawl() {
		System.out.println("iam overriden withdrawl from HDFC");
	}

	@Override
	public void deposit() {
		System.out.println("iam overriden deposit from HDFC");
	}

}
