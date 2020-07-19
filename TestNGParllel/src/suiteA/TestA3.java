package suiteA;

import java.net.MalformedURLException;

import org.testng.annotations.Test;

import base.BaseTest;

public class TestA3 extends BaseTest
{
  
	@Test
	public void testA3() throws InterruptedException, MalformedURLException 
	{
		System.out.println("Starting A3");
		
		Thread.sleep(5000);
		System.out.println("Ending A3");
	}
}
