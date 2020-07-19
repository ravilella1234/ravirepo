package suiteA;

import java.net.MalformedURLException;

import org.testng.annotations.Test;

import base.BaseTest;

public class TestA2 extends BaseTest
{
  
	@Test
	public void testA2() throws InterruptedException, MalformedURLException 
	{
		System.out.println("Starting A2");
		
		Thread.sleep(5000);
		System.out.println("Ending A2");
	}
}
