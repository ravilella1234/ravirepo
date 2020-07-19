package suiteD;

import org.testng.annotations.Test;

import base.BaseTest;

public class TestD3 extends BaseTest
{
  
	@Test
	public void testD3() throws InterruptedException 
	{
		System.out.println("Starting D3");
		
		Thread.sleep(5000);
		System.out.println("Ending D3");
	}
}
