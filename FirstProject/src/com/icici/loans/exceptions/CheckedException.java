package com.icici.loans.exceptions;

import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedException 
{

	public static void main(String[] args) 
	{
		try {
			BufferedInputStream b = new BufferedInputStream(new FileReader("d://abc.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
