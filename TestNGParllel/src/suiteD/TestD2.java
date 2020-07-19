package suiteD;

import org.testng.annotations.Test;

import base.BaseTest;

public class TestD2 extends BaseTest
{
  
	@Test
	public void testD2() throws InterruptedException 
	{
		System.out.println("Starting D2");
		
		Thread.sleep(5000);
		System.out.println("Ending D2");
	}
}
