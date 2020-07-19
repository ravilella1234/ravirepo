package suiteB;

import java.net.MalformedURLException;

import org.testng.annotations.Test;

import base.BaseTest;

public class TestB3 extends BaseTest
{
  
	@Test
	public void testB3() throws InterruptedException, MalformedURLException 
	{
		System.out.println("Starting B3");
		
		Thread.sleep(5000);
		System.out.println("Ending B3");
	}
}
