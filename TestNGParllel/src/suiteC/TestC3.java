package suiteC;

import org.testng.annotations.Test;

import base.BaseTest;

public class TestC3 extends BaseTest
{
  
	@Test
	public void testC3() throws InterruptedException 
	{
		System.out.println("Starting C3");
		
		Thread.sleep(5000);
		System.out.println("Ending C3");
	}
}