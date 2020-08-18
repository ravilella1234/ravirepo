package com.browserLaunchers;

public class TC_001 extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		init();
		
		launch("chromebrowser");
		
		navigateUrl("bestbuyurl");
		
		Thread.sleep(5000);
		
		navigateUrl("amazonurl");

	}

}
