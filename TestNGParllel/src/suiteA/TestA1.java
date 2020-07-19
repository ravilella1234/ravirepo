package suiteA;

import java.net.MalformedURLException;

import org.testng.annotations.Test;

import base.BaseTest;

public class TestA1 extends BaseTest
{
  
	@Test
	public void testA1() throws InterruptedException, MalformedURLException 
	{
		System.out.println("Starting A1");
		
		Thread.sleep(5000);
		System.out.println("Ending A1");
	}
}
