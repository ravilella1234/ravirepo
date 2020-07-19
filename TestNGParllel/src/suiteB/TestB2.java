package suiteB;

import java.net.MalformedURLException;

import org.testng.annotations.Test;

import base.BaseTest;

public class TestB2 extends BaseTest
{
  
	@Test
	public void testB2() throws InterruptedException, MalformedURLException 
	{
		System.out.println("Starting B2");
		
		Thread.sleep(5000);
		System.out.println("Ending B2");
	}
}
