package suiteC;

import org.testng.annotations.Test;

import base.BaseTest;

public class TestC2 extends BaseTest
{
  
	@Test
	public void testC2() throws InterruptedException 
	{
		System.out.println("Starting C2");
		
		Thread.sleep(5000);
		System.out.println("Ending C2");
	}
}
